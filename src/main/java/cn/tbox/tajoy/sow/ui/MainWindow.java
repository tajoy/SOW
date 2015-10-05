/**
 * <h1>MainWindow.java</h1><br>
 * Tajoy Create on 2015年10月1日 下午12:15:54
 * 
 * @version 0.1
 * @see
 * @author Tajoy tj328111241@gmail.com
 * 
 */


package cn.tbox.tajoy.sow.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

/**
 * <h1>MainWindow</h1><br>
 * 
 * @author Tajoy
 *
 */
public class MainWindow
{
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    private JFrame frame = null;

    // ===========================================================
    // Constructors
    // ===========================================================
    public MainWindow()
    {
        init();
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
     * @wbp.parser.entryPoint
     */
    public void init()
    {
        setFrame(new JFrame());
        JLabel lblHelloworld = new JLabel("Hello,World!");
        lblHelloworld.setHorizontalAlignment(SwingConstants.CENTER);
        getFrame().getContentPane().add(lblHelloworld, BorderLayout.NORTH);

    }
    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

    /**
     * @return the frame
     */
    public JFrame getFrame()
    {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(
        JFrame frame)
    {
        this.frame = frame;
    }

}
