/**
 * <h1>ReflectionHelper.java</h1><br>
 * Tajoy Create on 2015年10月5日 上午3:21:22
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

/**
 * <h1>ReflectionHelper</h1><br>
 * 
 * @author Tajoy
 *
 */
public class ReflectionHelper
{
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================
    private ReflectionHelper()
    {
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================
    public static List<Method> searchClassByPkgAndPredicate(
        final java.util.function.Predicate<? super Method> predicate,
        String pkg_path)
    {
        Reflections reflections =
            new Reflections(pkg_path, new SubTypesScanner(false));
        Collection<String> directSubtypes =
            reflections.getStore().get(SubTypesScanner.class).get(
                Object.class.getName());

        List<Method> ret = new ArrayList<Method>();

        for (Iterator<String> iterator = directSubtypes.iterator(); iterator
            .hasNext();)
        {
            String string = (String) iterator.next();
            Class<?> clazz = null;
            try
            {
                clazz = Class.forName(string);
            }
            catch (ClassNotFoundException e)
            {
                // pass
                continue;
            }

            @SuppressWarnings("unchecked")
            Set<Method> initMethods = ReflectionUtils
                .getMethods(
                    clazz,
                    new com.google.common.base.Predicate<Method>() {

                        @Override
                        public boolean apply(
                            Method input)
                        {
                            return predicate.test(input);
                        }
                    });

            ret.addAll(initMethods);
        }
        return ret;
    }

    public static List<Method> searchClassByPkgAndPredicate(
        final com.google.common.base.Predicate<? super Method> predicate,
        String pkg_path)
    {
        Reflections reflections =
            new Reflections(pkg_path, new SubTypesScanner(false));
        Collection<String> directSubtypes =
            reflections.getStore().get(SubTypesScanner.class).get(
                Object.class.getName());

        List<Method> ret = new ArrayList<Method>();

        for (Iterator<String> iterator = directSubtypes.iterator(); iterator
            .hasNext();)
        {
            String string = (String) iterator.next();
            Class<?> clazz = null;
            try
            {
                clazz = Class.forName(string);
            }
            catch (ClassNotFoundException e)
            {
                // pass
                continue;
            }

            @SuppressWarnings("unchecked")
            Set<Method> initMethods = ReflectionUtils
                .getMethods(
                    clazz,
                    predicate);

            ret.addAll(initMethods);
        }
        return ret;
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
