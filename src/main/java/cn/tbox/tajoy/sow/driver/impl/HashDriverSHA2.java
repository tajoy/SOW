/**
 * <h1>HashDriverSHA2.java</h1><br>
 * Tajoy Create on 2015年10月2日 上午3:04:02
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.driver.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.tbox.tajoy.sow.driver.HashDriver;
import cn.tbox.tajoy.sow.init.Initializable;
import cn.tbox.tajoy.sow.store.object.BaseObject.ObjectAccessor;
import cn.tbox.tajoy.sow.store.object.BoolObject;
import cn.tbox.tajoy.sow.store.object.BytesObject;
import cn.tbox.tajoy.sow.store.object.DoubleObject;
import cn.tbox.tajoy.sow.store.object.IdObject;
import cn.tbox.tajoy.sow.store.object.ListObject;
import cn.tbox.tajoy.sow.store.object.LongObject;
import cn.tbox.tajoy.sow.store.object.MapObject;

/**
 * <h1>HashDriverSHA2</h1><br>
 * 
 * @author Tajoy
 *
 */
public class HashDriverSHA2 implements HashDriver, ObjectAccessor
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger LOGGER =
        LoggerFactory.getLogger(HashDriverSHA2.class);

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================
    HashDriverSHA2()
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
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.BoolObject)
     */
    @Override
    public IdObject clacHash(
        BoolObject obj)
    {
        // TODO add method statements
        this.setId(obj, null);
        return null;
    }

    /**
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.BytesObject)
     */
    @Override
    public IdObject clacHash(
        BytesObject obj)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.IdObject)
     */
    @Override
    public IdObject clacHash(
        IdObject obj)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.LongObject)
     */
    @Override
    public IdObject clacHash(
        LongObject obj)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.DoubleObject)
     */
    @Override
    public IdObject clacHash(
        DoubleObject obj)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.ListObject)
     */
    @Override
    public IdObject clacHash(
        ListObject obj)
    {
        // TODO add method statements
        return null;
    }

    /**
     * <h1>clacHash</h1><br>
     * 
     * @see cn.tbox.tajoy.sow.driver.HashDriver#clacHash(cn.tbox.tajoy.sow.store.object.MapObject)
     */
    @Override
    public IdObject clacHash(
        MapObject obj)
    {
        // TODO add method statements
        return null;
    }

    // ===========================================================
    // Methods
    // ===========================================================
    @Initializable
    public static void init()
    {
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
