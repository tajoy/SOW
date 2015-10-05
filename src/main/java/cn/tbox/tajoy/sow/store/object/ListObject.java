/**
 * <h1>ListObject.java</h1><br>
 * Tajoy Create on 2015年10月1日 下午3:00:02
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.store.object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.tbox.tajoy.sow.exception.CannotCalcHashException;
import cn.tbox.tajoy.sow.exception.NotRegisterDriverClassException;
import cn.tbox.tajoy.sow.exception.NotTheDriverInstanceException;

/**
 * <h1>ListObject</h1><br>
 * 
 * @author Tajoy
 *
 */
public class ListObject extends StructObject implements List<BaseObject>
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger LOGGER =
        LoggerFactory.getLogger(ListObject.class);


    // ===========================================================
    // Fields
    // ===========================================================
    private List<BaseObject>    list   = null;

    // ===========================================================
    // Constructors
    // ===========================================================
    public ListObject()
    {
        super(ObjectType.STRUCT_LIST);
        list = new ArrayList<BaseObject>();
    }

    private ListObject(List<BaseObject> _list)
            throws InstantiationException,
            IllegalAccessException, NotTheDriverInstanceException,
            NotRegisterDriverClassException, CannotCalcHashException
    {
        super(ObjectType.STRUCT_LIST);
        list = _list;
        calcId();
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================
    /**
     * <h1>size</h1><br>
     * 
     * @see java.util.List#size()
     */
    @Override
    public int size()
    {
        return list.size();
    }

    /**
     * <h1>isEmpty</h1><br>
     * 
     * @see java.util.List#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    /**
     * <h1>contains</h1><br>
     * 
     * @see java.util.List#contains(java.lang.Object)
     */
    @Override
    public boolean contains(
        Object o)
    {
        return list.contains(o);
    }

    /**
     * <h1>iterator</h1><br>
     * 
     * @see java.util.List#iterator()
     */
    @Override
    public Iterator<BaseObject> iterator()
    {
        // XXX : will out of control, may be change data !!!
        return null;
    }

    /**
     * <h1>toArray</h1><br>
     * 
     * @see java.util.List#toArray()
     */
    @Override
    public Object[] toArray()
    {
        return list.toArray();
    }

    /**
     * <h1>toArray</h1><br>
     * 
     * @see java.util.List#toArray(java.lang.Object[])
     */
    @Override
    public <T> T[] toArray(
        T[] a)
    {
        return list.toArray(a);
    }

    /**
     * <h1>add</h1><br>
     * 
     * @see java.util.List#add(java.lang.Object)
     */
    @Override
    public boolean add(
        BaseObject obj)
    {
        try
        {
            boolean ret = list.add(obj);
            if (ret) calcId();
            return ret;
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * <h1>remove</h1><br>
     * 
     * @see java.util.List#remove(java.lang.Object)
     */
    @Override
    public boolean remove(
        Object o)
    {
        try
        {
            boolean ret = list.remove(o);
            if (ret) calcId();
            return ret;
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * <h1>containsAll</h1><br>
     * 
     * @see java.util.List#containsAll(java.util.Collection)
     */
    @Override
    public boolean containsAll(
        Collection<?> c)
    {
        return list.containsAll(c);
    }

    /**
     * <h1>addAll</h1><br>
     * 
     * @see java.util.List#addAll(java.util.Collection)
     */
    @Override
    public boolean addAll(
        Collection<? extends BaseObject> c)
    {
        try
        {
            boolean ret = list.addAll(c);
            if (ret) calcId();
            return ret;
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * <h1>addAll</h1><br>
     * 
     * @see java.util.List#addAll(int, java.util.Collection)
     */
    @Override
    public boolean addAll(
        int index,
        Collection<? extends BaseObject> c)
    {
        try
        {
            boolean ret = list.addAll(index, c);
            if (ret) calcId();
            return ret;
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * <h1>removeAll</h1><br>
     * 
     * @see java.util.List#removeAll(java.util.Collection)
     */
    @Override
    public boolean removeAll(
        Collection<?> c)
    {
        try
        {
            boolean ret = list.removeAll(c);
            if (ret) calcId();
            return ret;
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * <h1>retainAll</h1><br>
     * 
     * @see java.util.List#retainAll(java.util.Collection)
     */
    @Override
    public boolean retainAll(
        Collection<?> c)
    {
        try
        {
            boolean ret = list.retainAll(c);
            if (ret) calcId();
            return ret;
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return false;
        }
    }

    /**
     * <h1>clear</h1><br>
     * 
     * @see java.util.List#clear()
     */
    @Override
    public void clear()
    {
        list.clear();
        try
        {
            calcId();
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * <h1>get</h1><br>
     * 
     * @see java.util.List#get(int)
     */
    @Override
    public BaseObject get(
        int index)
    {
        return list.get(index);
    }

    /**
     * <h1>set</h1><br>
     * 
     * @see java.util.List#set(int, java.lang.Object)
     */
    @Override
    public BaseObject set(
        int index,
        BaseObject element)
    {
        BaseObject ret = list.set(index, element);
        if (ret != null)
        {
            try
            {
                calcId();
            }
            catch (Throwable e)
            {
                LOGGER.error(e.getLocalizedMessage(), e);
            }
        }
        return ret;
    }

    /**
     * <h1>add</h1><br>
     * 
     * @see java.util.List#add(int, java.lang.Object)
     */
    @Override
    public void add(
        int index,
        BaseObject element)
    {
        list.add(index, element);
        try
        {
            calcId();
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * <h1>remove</h1><br>
     * 
     * @see java.util.List#remove(int)
     */
    @Override
    public BaseObject remove(
        int index)
    {
        BaseObject ret = list.remove(index);
        try
        {
            calcId();
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
        }
        return ret;
    }

    /**
     * <h1>indexOf</h1><br>
     * 
     * @see java.util.List#indexOf(java.lang.Object)
     */
    @Override
    public int indexOf(
        Object o)
    {
        return list.indexOf(o);
    }

    /**
     * <h1>lastIndexOf</h1><br>
     * 
     * @see java.util.List#lastIndexOf(java.lang.Object)
     */
    @Override
    public int lastIndexOf(
        Object o)
    {
        return list.lastIndexOf(o);
    }

    /**
     * <h1>listIterator</h1><br>
     * 
     * @see java.util.List#listIterator()
     */
    @Override
    public ListIterator<BaseObject> listIterator()
    {
        // XXX : will out of control, may be change data !!!
        return null;
    }

    /**
     * <h1>listIterator</h1><br>
     * 
     * @see java.util.List#listIterator(int)
     */
    @Override
    public ListIterator<BaseObject> listIterator(
        int index)
    {
        // XXX : will out of control, may be change data !!!
        return null;
    }

    /**
     * <h1>subList</h1><br>
     * 
     * @see java.util.List#subList(int, int)
     */
    @Override
    public ListObject subList(
        int fromIndex,
        int toIndex)
    {
        try
        {
            return new ListObject(list.subList(fromIndex, toIndex));
        }
        catch (Throwable e)
        {
            LOGGER.error(e.getLocalizedMessage(), e);
            return null;
        }
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
