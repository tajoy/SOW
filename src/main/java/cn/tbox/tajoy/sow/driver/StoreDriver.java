

package cn.tbox.tajoy.sow.driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.tbox.tajoy.sow.store.object.TreeObject;

public class StoreDriver
{

    private static final Logger               LOGGER       =
        LoggerFactory.getLogger(StoreDriver.class);


    private static Interface                  instence     = null;


    private static Class<? extends Interface> driver_clazz = null;


    public class NotRegisterDriverClassException extends Exception
    {

        private static final long serialVersionUID = -4987825622091841341L;

        NotRegisterDriverClassException()
        {
            super("");
        }

    }


    public interface Interface
    {

        public TreeObject getTreeObject(
            String key);

        public void appendObject(
            String key,
            TreeObject obj);

    }

    public
        void
        registerDriver(
            Class<? extends Interface> clazz)
    {
        driver_clazz = clazz;
    }


    public class Factory
    {

        public Interface getInstence()
            throws InstantiationException, IllegalAccessException,
            NotRegisterDriverClassException
        {
            if (instence == null && driver_clazz != null)
            {
                instence = driver_clazz.newInstance();
            }

            if (instence == null)
            {
                throw new NotRegisterDriverClassException();
            }

            return instence;
        }
    }
}
