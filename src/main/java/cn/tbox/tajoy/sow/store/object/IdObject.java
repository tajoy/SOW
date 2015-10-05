/**
 * IdObject.java
 * Tajoy Create on 2015年9月26日 上午11:57:39
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
 * IdObject
 * 
 * <br>
 * <br>
 * 对象标识符的储存对象, 类似于C的指针
 * 
 * @author Tajoy
 *
 */
public class IdObject extends DataObject<String>
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
    public IdObject(String id)
            throws CannotCalcHashException, InstantiationException,
            IllegalAccessException, NotTheDriverInstanceException,
            NotRegisterDriverClassException
    {
        super(ObjectType.DATA_ID, id);
    }
    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @Override
    public int hashCode()
    {
        return this.data.hashCode();
    }

    public boolean equals(
        IdObject obj)
    {
        return this.data.equals(obj.data);
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
