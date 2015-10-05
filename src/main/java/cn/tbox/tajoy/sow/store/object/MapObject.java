/**
 * MapObject.java
 * Tajoy Create on 2015年9月26日 上午11:26:24
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.store.object;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MapObject
 * 
 * @author Tajoy
 *
 */
public class MapObject extends StructObject implements Map<String, BaseObject>
{
    // ===========================================================
    // Constants
    // ===========================================================

    private static final Logger     LOGGER =
        LoggerFactory.getLogger(MapObject.class);


    // ===========================================================
    // Fields
    // ===========================================================
    private Map<String, BaseObject> map    = null;

    // ===========================================================
    // Constructors
    // ===========================================================
    public MapObject()
    {
        super(ObjectType.STRUCT_MAP);
        map = new HashMap<String, BaseObject>();
    }

    public MapObject(Map<String, BaseObject> _map)
    {
        super(ObjectType.STRUCT_MAP);
        map = _map;
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
     * @see java.util.Map#size()
     */
    @Override
    public int size()
    {
        return map.size();
    }

    /**
     * <h1>isEmpty</h1><br>
     * 
     * @see java.util.Map#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    /**
     * <h1>containsKey</h1><br>
     * 
     * @see java.util.Map#containsKey(java.lang.Object)
     */
    @Override
    public boolean containsKey(
        Object key)
    {
        return map.containsKey(key);
    }

    /**
     * <h1>containsValue</h1><br>
     * 
     * @see java.util.Map#containsValue(java.lang.Object)
     */
    @Override
    public boolean containsValue(
        Object value)
    {
        return map.containsValue(value);
    }

    /**
     * <h1>get</h1><br>
     * 
     * @see java.util.Map#get(java.lang.Object)
     */
    @Override
    public BaseObject get(
        Object key)
    {
        return map.get(key);
    }

    /**
     * <h1>put</h1><br>
     * 
     * @see java.util.Map#put(java.lang.Object, java.lang.Object)
     */
    @Override
    public BaseObject put(
        String key,
        BaseObject value)
    {
        BaseObject ret = map.put(key, value);
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
     * <h1>remove</h1><br>
     * 
     * @see java.util.Map#remove(java.lang.Object)
     */
    @Override
    public BaseObject remove(
        Object key)
    {
        BaseObject ret = map.remove(key);
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
     * <h1>putAll</h1><br>
     * 
     * @see java.util.Map#putAll(java.util.Map)
     */
    @Override
    public void putAll(
        Map<? extends String, ? extends BaseObject> m)
    {
        map.putAll(m);
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
     * <h1>clear</h1><br>
     * 
     * @see java.util.Map#clear()
     */
    @Override
    public void clear()
    {
        map.clear();
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
     * <h1>keySet</h1><br>
     * 
     * @see java.util.Map#keySet()
     */
    @Override
    public Set<String> keySet()
    {
        return map.keySet();
    }

    /**
     * <h1>values</h1><br>
     * 
     * @see java.util.Map#values()
     */
    @Override
    public Collection<BaseObject> values()
    {
        return map.values();
    }

    /**
     * <h1>entrySet</h1><br>
     * 
     * @see java.util.Map#entrySet()
     */
    @Override
    public Set<java.util.Map.Entry<String, BaseObject>> entrySet()
    {
        // XXX : will out of control, may be change data !!!
        return null;
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
