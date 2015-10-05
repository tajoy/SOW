/**
 * <h1>HashDriver.java</h1><br>
 * Tajoy Create on 2015年9月27日 下午7:23:17
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.driver;

import cn.tbox.tajoy.sow.store.object.*;

/**
 * <h1>HashDriver</h1><br>
 * 
 * @author Tajoy
 *
 */
public interface HashDriver extends DriverManager.Interface
{

    default public IdObject clacHash(
        BaseObject obj)
    {
        switch (obj.getType())
        {
        case DATA_BOOL:
            return clacHash((BoolObject) obj);
        case DATA_BYTES:
            return clacHash((BytesObject) obj);
        case DATA_ID:
            return clacHash((IdObject) obj);
        case DATA_LONG:
            return clacHash((LongObject) obj);
        case DATA_DOUBLE:
            return clacHash((DoubleObject) obj);
        case STRUCT_LIST:
            return clacHash((ListObject) obj);
        case STRUCT_MAP:
            return clacHash((MapObject) obj);
        default:
            return null;
        }
    }

    IdObject clacHash(
        BoolObject obj);

    IdObject clacHash(
        BytesObject obj);

    IdObject clacHash(
        IdObject obj);

    IdObject clacHash(
        LongObject obj);

    IdObject clacHash(
        DoubleObject obj);

    IdObject clacHash(
        ListObject obj);

    IdObject clacHash(
        MapObject obj);

}
