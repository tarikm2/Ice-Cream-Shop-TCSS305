import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * Runs my sweet little Ice-Cream shop.
 * @author Tarik Merzouk
 * @version 4/24/2015
 */
public final class ShopRunner {
    
    /**
     * private default constructor.
     */
    private ShopRunner() {
    }
    
    /**
     * main method driving the demo.
     * @param theArgs none
     * @custom.post Ice cream shop is launched.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable()
            {
                public void run() {
                    final JFrame frame = new IceCreamShopFrame();
                    frame.setTitle("Create your Ice-Cream");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}
