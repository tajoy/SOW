/**
 * LongObject.java
 * 
 * Tajoy Create on 2015年9月26日 上午11:16:53
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
 * LongObject
 * 
 * @author Tajoy
 *
 */
public class LongObject extends DataObject<Long>
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
    public LongObject(Long data) throws CannotCalcHashException,
            InstantiationException, IllegalAccessException,
            NotTheDriverInstanceException, NotRegisterDriverClassException
    {
        super(ObjectType.DATA_LONG, data);
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
