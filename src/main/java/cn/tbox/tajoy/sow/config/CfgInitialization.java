/**
 * <h1>CfgInitialization.java</h1><br>
 * Tajoy Create on 2015年10月3日 下午2:56:21
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.config;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>CfgInitialization</h1><br>
 * 
 * @author Tajoy
 *
 */
@ConfigurationBean(module = "Initialization")
public class CfgInitialization
{
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================
    private List<String> initializePackages = new ArrayList<String>();

    // ===========================================================
    // Constructors
    // ===========================================================
    CfgInitialization()
    {
    }
    // ===========================================================
    // Getter & Setter
    // ===========================================================

    /**
     * @return the initializePackages
     */
    public synchronized final List<String> getInitializePackages()
    {
        return initializePackages;
    }

    /**
     * @param initializePackages the initializePackages to set
     */
    public synchronized final void setInitializePackages(
        List<String> initializePackages)
    {
        this.initializePackages = initializePackages;
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
