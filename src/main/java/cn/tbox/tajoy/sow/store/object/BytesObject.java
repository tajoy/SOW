/**
 * BytesObject.java
 * 
 * Tajoy Create on 2015年9月26日 上午11:21:25
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.store.object;

import cn.tbox.tajoy.sow.exception.CannotCalcHashException;
import cn.tbox.tajoy.sow.exception.NotRegisterDriverClassException;
import cn.tbox.tajoy.sow.exception.NotTheDriverInstanceException;

/**
 * BytesObject
 * 
 * @author Tajoy
 *
 */
public class BytesObject extends DataObject<Byte[]>
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
    public BytesObject(Byte[] bytes) throws CannotCalcHashException,
            InstantiationException, IllegalAccessException,
            NotTheDriverInstanceException, NotRegisterDriverClassException
    {
        // TODO add Constructor body statements
        super(ObjectType.DATA_BYTES, bytes);
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

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
