/**
 * <h1>InitializationManager.java</h1><br>
 * Tajoy Create on 2015年10月2日 下午5:04:28
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.init;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Predicates;

import cn.tbox.tajoy.sow.config.ConfigurationManager.ConfigurationInitializer;
import cn.tbox.tajoy.sow.reflection.ReflectionHelper;

/**
 * <h1>InitializationManager</h1><br>
 * 
 * 
 * 初始化管理器, 单例.
 * 
 * @author Tajoy
 *
 */
public class InitializationManager implements ConfigurationInitializer
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger          LOGGER   =
        LoggerFactory.getLogger(InitializationManager.class);


    // ===========================================================
    // Fields
    // ===========================================================
    private static InitializationManager instance = null;

    // ===========================================================
    // Constructors
    // ===========================================================
    private InitializationManager()
    {
        // TODO add Constructor body statements
    }
    // ===========================================================
    // Getter & Setter
    // ===========================================================

    /**
     * @return the instance
     */
    public static synchronized final InitializationManager getInstance()
    {
        if (instance == null)
        {
            instance = new InitializationManager();
        }
        return instance;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================
    /**
     * <h1>initializeAll</h1><br>
     * 
     * 寻找所有载入的类中被{@link Initializable}正确注解的初始化方法, 在根据优先级升序排序后
     * 依次执行之, 如果中途有初始化执行失败则中止整个初始化进程, 并返回 {@code false}
     * 
     * @return
     */
    public boolean initializeAll()
    {
        // initialize ConfigurationManager
        initializeConfiguration();

        // find it out all of initializable public static boolean method.
        @SuppressWarnings("unchecked")
        List<Method> allInitMethod =
            ReflectionHelper.searchClassByPkgAndPredicate(
                Predicates.and(
                    ReflectionUtils.withAnnotation(Initializable.class),
                    ReflectionUtils.withParametersCount(0),
                    ReflectionUtils.withModifier(Modifier.PUBLIC),
                    ReflectionUtils.withModifier(Modifier.STATIC),
                    Predicates.or(
                        ReflectionUtils.withReturnType(Void.class),
                        ReflectionUtils.withReturnType(Boolean.class),
                        ReflectionUtils.withReturnType(void.class),
                        ReflectionUtils.withReturnType(boolean.class))),
                "");

        allInitMethod.sort(new Comparator<Method>() {

            @Override
            public int compare(
                Method o1,
                Method o2)
            {
                return getPriority(o2) - getPriority(o1);
            }
        });

        for (Method method : allInitMethod)
        {
            LOGGER.info(
                "Initializing : " + method.toString());
            try
            {
                Object ret = method.invoke(null);
                if (ret != null && (boolean) ret == false)
                {
                    LOGGER.error(
                        "Initialize failed!");
                    System.exit(-1);
                }
            }
            catch (Throwable e)
            {
                LOGGER.error(e.getLocalizedMessage(), e);
            }
            LOGGER.info("Initialize success!");
        }

        return true;
    }

    private int getPriority(
        Method e)
    {
        Initializable annt = e.getAnnotation(Initializable.class);
        if (annt == null)
        {
            return 0;
        }
        return annt.priority();
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
