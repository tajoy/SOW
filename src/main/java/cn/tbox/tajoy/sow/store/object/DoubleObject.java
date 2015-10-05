/**
 * <h1>DoubleObject.java</h1><br>
 * Tajoy Create on 2015年10月1日 下午4:51:35
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
 * <h1>DoubleObject</h1><br>
 * 
 * @author Tajoy
 *
 */
public class DoubleObject extends DataObject<Double>
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
    public DoubleObject(Double data) throws CannotCalcHashException,
            InstantiationException, IllegalAccessException,
            NotTheDriverInstanceException, NotRegisterDriverClassException
    {
        super(ObjectType.DATA_DOUBLE, data);
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
