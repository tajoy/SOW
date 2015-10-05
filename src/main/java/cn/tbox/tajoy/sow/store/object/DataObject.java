/**
 * DataObject.java
 * 
 * Tajoy Create on 2015年9月26日 上午11:20:45
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
 * DataObject
 * 
 * @author Tajoy
 *
 */
public abstract class DataObject<DataType> extends BaseObject
{
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================
    protected DataType data = null;

    // ===========================================================
    // Constructors
    // ===========================================================
    DataObject(ObjectType type, DataType _data) throws CannotCalcHashException,
            InstantiationException, IllegalAccessException,
            NotTheDriverInstanceException, NotRegisterDriverClassException
    {
        super(type);
        this.data = _data;
        calcId();
    }
    // ===========================================================
    // Getter & Setter
    // ===========================================================

    /**
     * @return the data
     */
    public synchronized final DataType getData()
    {
        return data;
    }

    /**
     * @param data the data to set
     * @throws NotRegisterDriverClassException
     * @throws NotTheDriverInstanceException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public synchronized final void setData(
        DataType data)
            throws CannotCalcHashException, InstantiationException,
            IllegalAccessException, NotTheDriverInstanceException,
            NotRegisterDriverClassException
    {
        this.data = data;
        calcId();
    }

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
