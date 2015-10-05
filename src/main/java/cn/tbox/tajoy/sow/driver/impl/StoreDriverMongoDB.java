/**
 * <h1>StoreDriverMongoDB.java</h1><br>
 * Tajoy Create on 2015年10月2日 上午3:06:11
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.driver.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.tbox.tajoy.sow.driver.StoreDriver;
import cn.tbox.tajoy.sow.init.Initializable;
import cn.tbox.tajoy.sow.store.object.BaseObject;
import cn.tbox.tajoy.sow.store.object.BoolObject;
import cn.tbox.tajoy.sow.store.object.BytesObject;
import cn.tbox.tajoy.sow.store.object.DoubleObject;
import cn.tbox.tajoy.sow.store.object.IdObject;
import cn.tbox.tajoy.sow.store.object.ListObject;
import cn.tbox.tajoy.sow.store.object.LongObject;
import cn.tbox.tajoy.sow.store.object.MapObject;

/**
 * <h1>StoreDriverMongoDB</h1><br>
 * 
 * @author Tajoy
 *
 */
public class StoreDriverMongoDB implements StoreDriver
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger LOGGER =
        LoggerFactory.getLogger(StoreDriverMongoDB.class);

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================
    StoreDriverMongoDB()
    {
        // TODO add Constructor body statements
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    /**
     * <h1>getBoolObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getBoolObject(java.lang.String)
     */
    @Override
    public BoolObject getBoolObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>getBytesObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getBytesObject(java.lang.String)
     */
    @Override
    public BytesObject getBytesObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>getLongObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getLongObject(java.lang.String)
     */
    @Override
    public LongObject getLongObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>getIdObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getIdObject(java.lang.String)
     */
    @Override
    public IdObject getIdObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>getDoubleObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getDoubleObject(java.lang.String)
     */
    @Override
    public DoubleObject getDoubleObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>getListObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getListObject(java.lang.String)
     */
    @Override
    public ListObject getListObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>getMapObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#getMapObject(java.lang.String)
     */
    @Override
    public MapObject getMapObject(
        String id)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>addObject</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.StoreDriver#addObject(cn.tbox.tajoy.sow.store.object.BaseObject)
     */
    @Override
    public boolean addObject(
        BaseObject obj)
    {
        // TODO add method statements
        return false;
    }

    // ===========================================================
    // Methods
    // ===========================================================

    @Initializable(priority = 10)
    public static boolean init()
    {
        return false;
    }
    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
