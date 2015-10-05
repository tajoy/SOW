/**
 * StoreDriver.java
 * Tajoy Create on 2015年9月26日 上午11:27:32
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.driver;

import cn.tbox.tajoy.sow.store.object.*;

/**
 * StoreDriver
 * 
 * @author Tajoy
 *
 */
public interface StoreDriver extends DriverManager.Interface
{

    public BoolObject getBoolObject(
        String id);

    public BytesObject getBytesObject(
        String id);

    public LongObject getLongObject(
        String id);

    public IdObject getIdObject(
        String id);

    public DoubleObject getDoubleObject(
        String id);

    public ListObject getListObject(
        String id);

    public MapObject getMapObject(
        String id);

    default public BoolObject getBoolObject(
        IdObject idObj)
    {
        return getBoolObject(idObj.getData());
    }

    default public BytesObject getBytesObject(
        IdObject idObj)
    {
        return getBytesObject(idObj.getData());
    }

    default public LongObject getLongObject(
        IdObject idObj)
    {
        return getLongObject(idObj.getData());
    }

    default public IdObject getIdObject(
        IdObject idObj)
    {
        return getIdObject(idObj.getData());
    }

    default public DoubleObject getDoubleObject(
        IdObject idObj)
    {
        return getDoubleObject(idObj.getData());
    }

    default public ListObject getListObject(
        IdObject idObj)
    {
        return getListObject(idObj.getData());
    }

    default public MapObject getMapObject(
        IdObject idObj)
    {
        return getMapObject(idObj.getData());
    }

    public boolean addObject(
        BaseObject obj);
}
