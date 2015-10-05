/**
 * <h1>CannotCalcHashException.java</h1><br>
 * Tajoy Create on 2015年10月1日 下午9:22:09
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.exception;

// ===========================================================
// Inner and Anonymous Classes
// ===========================================================
/**
 * <h1>CannotCalcHashException</h1><br>
 * The exception case by can not calculate object hash.
 * <br/>
 * <br/>
 * 由于无法计算hash值时将会抛出该异常.
 * 
 * @author Tajoy
 *
 */
public class CannotCalcHashException extends Exception
{

    private static final long serialVersionUID = -8005916727989149644L;

    CannotCalcHashException()
    {
        super("Can not calculate object hash.");
    }

}
