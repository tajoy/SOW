/**
 * BaseObject.java
 * 
 * Tajoy Create on 2015年9月26日 上午11:21:55
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.store.object;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.tbox.tajoy.sow.driver.DriverManager;
import cn.tbox.tajoy.sow.exception.CannotCalcHashException;
import cn.tbox.tajoy.sow.exception.NotRegisterDriverClassException;
import cn.tbox.tajoy.sow.exception.NotTheDriverInstanceException;

/**
 * BaseObject
 * All object is extends this class.
 * The class is defined common features and methos in all object.
 * <br>
 * <br>
 * 所有的储存对象都继承自该类.
 * 这个类定义了所有的对象通用的特性和方法.
 * 
 * @author Tajoy
 *
 */
public abstract class BaseObject
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger LOGGER     =
        LoggerFactory.getLogger(BaseObject.class);


    // ===========================================================
    // Fields
    // ===========================================================
    protected IdObject          id         = null;


    private ObjectType         type       = null;


    private Date                createTime = null;


    private IdObject            id_before  = null;


    private IdObject            id_after   = null;

    // ===========================================================
    // Constructors
    // ===========================================================
    /**
     * <h1>BaseObject</h1><br/>
     * The constructor used for subClass set it type.
     * <br/>
     * <br/>
     * 用于子类设置其类型的构造器
     * 
     * @param _type
     *            type to set
     *            需设置的类型
     * 
     */
    protected BaseObject(ObjectType _type)
    {
        this.type = _type;
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    /**
     * @return the id_before
     */
    public synchronized final IdObject getIdBefore()
    {
        return id_before;
    }

    /**
     * @return the id_after
     */
    public synchronized final IdObject getIdAfter()
    {
        return id_after;
    }

    /**
     * @return the type of Objects
     */
    public synchronized final ObjectType getType()
    {
        return type;
    }

    /**
     * @return the createTime
     */
    public synchronized final Date getCreateTime()
    {
        return createTime;
    }

    /**
     * <h1>getId</h1><br/>
     * Get the {@link IdObject} of this object content,if call this method 2 and
     * more times, it will return cached value.
     * <br/>
     * <br/>
     * 获取该对象的{@link IdObject}, 如果调用这个函数
     * 2次或更多次,它将会返回缓存的值.
     * 
     * @return the IdObject of this Object content
     * @throws NotRegisterDriverClassException
     * @throws NotTheDriverInstanceException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws CannotCalcHashException
     * @see IdObject
     */
    public synchronized final IdObject getId()
        throws InstantiationException, IllegalAccessException,
        NotTheDriverInstanceException, NotRegisterDriverClassException,
        CannotCalcHashException
    {
        if (id == null)
        {
            calcId();
        }
        return id;
    }

    /**
     * @param id_before the id_before to set
     */
    private synchronized final void setIdBefore(
        IdObject id_before)
    {
        this.id_before = id_before;
    }

    /**
     * @param id_after the id_after to set
     */
    private synchronized final void setIdAfter(
        IdObject id_after)
    {
        this.id_after = id_after;
    }

    /**
     * @param createTime the createTime to set
     */
    private synchronized final void setCreateTime(
        Date createTime)
    {
        this.createTime = createTime;
    }

    /**
     * @param id the id to set
     */
    private synchronized final void setId(
        IdObject id)
    {
        this.id = id;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================
    /**
     * <h1>calcHash</h1><br/>
     * The method that is real calculate object content to hash,
     * every object extends from {@link BaseObject} must override
     * this method.
     * <br/>
     * <br/>
     * 这是真正计算哈希值的方法, 每一个从{@link BaseObject}继承的
     * 储存对象都必须重载这个方法.
     * 
     * @return
     * @throws NotRegisterDriverClassException
     * @throws NotTheDriverInstanceException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws CannotCalcHashException
     */
    public synchronized final IdObject calcHash()
        throws InstantiationException, IllegalAccessException,
        NotTheDriverInstanceException, NotRegisterDriverClassException,
        CannotCalcHashException
    {
        return DriverManager.getHashDriver().clacHash(this);
    }

    /**
     * <h1>isSame</h1><br/>
     * test this object whether is same with other object.
     * <br/>
     * <br/>
     * 判断当前储存对象与另外一个储存对象是否是相同的
     * 
     * @param other_object
     *            other object to test whether is same
     *            <br/>
     *            另外一个用来判断是否相同的储存对象
     * @return
     *         return {@code true} is same;
     *         {@code false} is not same.
     *         <br/>
     *         返回{@code true}为一样;
     *         {@code false}为不一样.
     * @throws CannotCalcHashException
     * @throws NotRegisterDriverClassException
     * @throws NotTheDriverInstanceException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public synchronized final boolean isSame(
        BaseObject other)
            throws CannotCalcHashException, InstantiationException,
            IllegalAccessException, NotTheDriverInstanceException,
            NotRegisterDriverClassException
    {
        return getId().equals(other.getId()) && getType() == other.getType();
    }

    /**
     * <h1>hashCode</h1><br/>
     * Support to java hash features, just return its
     * {@link IdObject#hashCode()} by {@link #getId()}
     * <br/>
     * <br/>
     * 为了支持java的哈希特性, 仅仅通过{@link #getId()}返回其{@link IdObject#hashCode()}
     * 
     * @see BaseObject#getId()
     * @see IdObject#hashCode()
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        try
        {
            return getId().hashCode();
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return 0;
        }
    }

    /**
     * <h1>equals</h1><br/>
     * Support to java equals features, just return its
     * {@link IdObject#equals}.
     * <br/>
     * <br/>
     * 为了支持java的判断相等特性, 仅仅返回其{@link IdObject#equals}
     * 
     * @see IdObject#equals(java.lang.Object)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(
        Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof BaseObject))
        {
            return false;
        }
        BaseObject other = (BaseObject) obj;
        try
        {
            return this.isSame(other);
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    // ===========================================================
    // Methods
    // ===========================================================
    public void calcId()
        throws InstantiationException, IllegalAccessException,
        NotTheDriverInstanceException, NotRegisterDriverClassException,
        CannotCalcHashException
    {
        id = calcHash();
    }


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
    /**
     * <h1>ObjectAccessor</h1><br>
     * 
     * <br>
     * <br>
     * 仅仅作为访问 BaseObject 的接口.
     * 只有实现该接口的类才能访问设置类方法.
     * 
     * @author Tajoy
     *
     */
    public interface ObjectAccessor
    {

        /**
         * @param id_before the id_before to set
         */
        default public void setIdBefore(
            BaseObject obj,
            IdObject id_before)
        {
            obj.setIdBefore(id_before);
        }

        /**
         * @param id_after the id_after to set
         */
        default public void setIdAfter(
            BaseObject obj,
            IdObject id_after)
        {
            obj.setIdAfter(id_after);
        }

        /**
         * @param createTime the createTime to set
         */
        default public void setCreateTime(
            BaseObject obj,
            Date createTime)
        {
            obj.setCreateTime(createTime);
        }

        /**
         * @param id the id to set
         */
        default public void setId(
            BaseObject obj,
            IdObject id)
        {
            obj.setId(id);
        }

    }
}
