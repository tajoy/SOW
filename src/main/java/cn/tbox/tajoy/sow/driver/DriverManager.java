/**
 * <h1>DriverManager.java</h1><br>
 * Tajoy Create on 2015年9月26日 下午9:16:48
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.driver;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.tbox.tajoy.sow.driver.StoreDriver;
import cn.tbox.tajoy.sow.exception.NotRegisterDriverClassException;
import cn.tbox.tajoy.sow.exception.NotTheDriverInstanceException;
import cn.tbox.tajoy.sow.store.object.BaseObject;
import cn.tbox.tajoy.sow.store.object.IdObject;

/**
 * <h1>DriverManager</h1><br>
 * 
 * @author Tajoy
 *
 */
public final class DriverManager
{

    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger                                 LOGGER                   =
        LoggerFactory.getLogger(DriverManager.class);


    // ===========================================================
    // Fields
    // ===========================================================
    private static Map<DriverType, Class<? extends Interface>> driverImplementClasses   =
        new HashMap<DriverType, Class<? extends Interface>>();


    private static Map<DriverType, Interface>                  driverImplementInstances =
        new HashMap<DriverType, Interface>();

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================
    private static void regDriver(
        DriverType type,
        Class<? extends Interface> clazz)
    {
        driverImplementClasses.put(type, clazz);
    }

    private static Interface getDriver(
        DriverType type)
            throws NotRegisterDriverClassException, InstantiationException,
            IllegalAccessException
    {

        Interface instence = driverImplementInstances.get(type);
        Class<? extends Interface> driver_clazz =
            driverImplementClasses.get(type);

        // 没有创建实例
        if (instence == null)
        {
            // 注册了实现类
            if (driver_clazz != null)
            {
                instence = driver_clazz.newInstance();
                driverImplementInstances.put(type, instence);
            }
            else
            {
                throw new NotRegisterDriverClassException();
            }
        }

        return instence;
    }

    public static void regStoreDriver(
        Class<? extends StoreDriver> clazz)
    {
        regDriver(DriverType.STORE, clazz);
    }

    public static StoreDriver getStoreDriver()
        throws Throwable
    {
        Interface ins = getDriver(DriverType.STORE);
        if (!(ins instanceof StoreDriver))
            throw new NotTheDriverInstanceException();
        return (StoreDriver) getDriver(DriverType.STORE);
    }

    public static void regHashDriver(
        Class<? extends HashDriver> clazz)
    {
        regDriver(DriverType.HASH, clazz);
    }

    public static HashDriver getHashDriver()
        throws NotTheDriverInstanceException, InstantiationException,
        IllegalAccessException, NotRegisterDriverClassException
    {
        Interface ins = getDriver(DriverType.STORE);
        if (!(ins instanceof StoreDriver))
            throw new NotTheDriverInstanceException();
        return (HashDriver) getDriver(DriverType.STORE);
    }


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
    public interface Interface
    {

    }

}
