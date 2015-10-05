/**
 * <h1>ConfigurationManager.java</h1><br>
 * Tajoy Create on 2015年10月3日 下午2:39:10
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.config;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigBeanFactory;
import com.typesafe.config.ConfigFactory;

/**
 * <h1>ConfigurationManager</h1><br>
 * 
 * 
 * 程序配置管理类
 * 该类需最先由 {@link InitializationManager} 初始化
 * 然后再初始化其他的初始化进程
 * 
 * 
 * @author Tajoy
 *
 */
public class ConfigurationManager
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger         LOGGER        =
        LoggerFactory.getLogger(ConfigurationManager.class);


    // ===========================================================
    // Fields
    // ===========================================================
    private static ConfigurationManager instance      = null;


    private Config                      config        = null;


    private HashMap<String, Object>     moduleConfigs =
        new HashMap<String, Object>();

    // ===========================================================
    // Constructors
    // ===========================================================
    private ConfigurationManager()
    {
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    /**
     * @return the instance
     */
    public static synchronized final ConfigurationManager getInstance()
    {
        if (instance == null)
        {
            instance = new ConfigurationManager();
        }

        return instance;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================
    public Config getConfig()
    {
        return getInstance().config;
    }

    public <T> T getModuleConfig(
        Class<T> clazz)
    {
        return getModuleConfig(clazz, false);
    }

    @SuppressWarnings("unchecked")
    public <T> T getModuleConfig(
        Class<T> clazz,
        boolean isLoad)
    {
        ConfigurationBean ant =
            clazz.getAnnotation(ConfigurationBean.class);
        if (ant == null)
        {
            return null;
        }

        String module = ant.module();
        T mconf = null;
        boolean haveCached = moduleConfigs.containsKey(module);
        // 强制载入 或 没有缓存
        if (isLoad || !haveCached)
        {
            mconf =
                ConfigBeanFactory.create(
                    getConfig().getConfig(module),
                    clazz);
        }
        if (mconf != null) // 载入成功
        {
            moduleConfigs.put(module, mconf);
        }
        else
        {
            if (haveCached) // 没有载入 且 已缓存
            {
                mconf = (T) moduleConfigs.get(module);
            }
        }

        return mconf;
    }

    public void loadModuleConfig(
        Class<?> clazz)
    {
        getModuleConfig(clazz, true);
    }

    public void saveChanges()
    {
        LOGGER.debug(getClass().getName() + " save changed.");
        // TODO
    }

    /**
     * <h1>initialize</h1><br>
     * 
     * 仅仅供 {@link InitializationManager} 调用
     */
    private void initialize()
    {
        // TODO fill it
        config = ConfigFactory.load();
    }

    @Override
    protected void finalize()
        throws java.lang.Throwable
    {
        LOGGER.info(getClass().getName() + " finalizing ...");
        saveChanges();
    }


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
    public interface ConfigurationInitializer
    {

        default public void initializeConfiguration()
        {
            ConfigurationManager.getInstance().initialize();
        }
    }

}
