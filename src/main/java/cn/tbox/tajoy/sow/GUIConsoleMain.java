/**
 * <h1>GUIConsoleMain.java</h1><br>
 * Tajoy Create on 2015年10月1日 下午9:25:08
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow;

import java.awt.EventQueue;

import cn.tbox.tajoy.sow.ui.MainWindow;

/**
 * <h1>GUIConsoleMain</h1><br>
 * 
 * @author Tajoy
 *
 */
public class GUIConsoleMain
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
    GUIConsoleMain()
    {
        // TODO add Constructor body statements
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

    /**
     * Launch the application.
     */
    public static void main(
        String[] args)
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    MainWindow window = new MainWindow();
                    window.getFrame().setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
