import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This is a panel which incorporates the OrderPanel and
 * centers it with some padding.
 * @author Tarik Merzouk
 * @version 4/24/2015
 */

public class Bottom extends JPanel {
    
    /**
     * the default id.
     */
    private static final long serialVersionUID = 1L;
    
    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */
    
    /**
     * the element to center.
     */
    protected final OrderPanel myCenter;
    
    /**
     * left padding.
     */
    private final JButton myLeft;
    
    /**
     * right padding.
     */
    private final JButton myRight;
   
    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */
    
    /**
     * The constructor.
     * @param theListener the action listener.
     * @custom.post the panel is instantiated.
     */
    public Bottom(final IceCreamShopFrame.PriceChanger theListener) {
        super();
        
        //Panel with order button and information
        myCenter = new OrderPanel(theListener);
        //right padding
        myRight = new JButton();
        //left padding
        myLeft = new JButton();
        
        addElements();
        setSize();
    }

    /*                                
     *     |\/|   _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */
    
    /**
     * Adds elements to the panel.
     * @custom.post elements are added to the panel
     */
    private void addElements() {
        //add the components
        add(myLeft);
        add(myCenter);
        add(myRight);
    }
    
    /**
     * Formats the size of this panel.
     * @custom.post the panel's elements are formatted to size.
     */
    private void setSize() {
        
        //these are set to not visible and only act as padding.
        myLeft.setVisible(false);
        myRight.setVisible(false);  
    }

}
