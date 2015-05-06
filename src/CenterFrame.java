import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class represents a panel
 * which centers the flavors and 
 * cones panels in the main frame.
 * @author Tarik Merzouk
 * @version 4/24/2015
 */
public class CenterFrame extends JPanel {
    
    /**
     * Default serial ID.
     */
    private static final long serialVersionUID = 1L;
    
    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */

    /**
     * number of elements on this frame.
     */
    private final int myElements = 5;
    
    /**
     * Panel for flavor.
     */
    protected final FlavorsPanel myPanelFlavors;
    
    /**
     * Panel for the size.
     */
    protected final ConeTypePanel myConeTypePanel;
    
    /**
     * center padding for dynamic adjustment.
     */
    private final JLabel myCenter;
    
    /**
     * left padding for dynamic adjustment.
     */
    private final JLabel myLeft;
    
    /**
     * right padding for dynamic adjustment.
     */
    
    private final JLabel myRight;
    
    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */

    /**
     * constructor for center  frame.
     * @param theListener action listener for elements.
     * @custom.post the panel is instantiated.
     */
    public CenterFrame(final IceCreamShopFrame.PriceChanger theListener) {
        super();
        setLayout(new GridLayout(0, myElements));
        
        //instantiate the padding and panels
        myLeft = new JLabel();
        myRight = new JLabel();
        myCenter = new JLabel();
        myPanelFlavors = new FlavorsPanel(theListener);
        myConeTypePanel = new ConeTypePanel(theListener);
        
        //add elements to panel
        addElements();
        //Format the appearance of the elements
        format();
    }

    /*                                
     *     |\/|  _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */
    
    /**
     * method which adds the components.
     * @custom.post elements are added to the panel.
     */
    private void addElements() {
        add(myLeft);
        add(myConeTypePanel);
        add(myCenter);
        add(myPanelFlavors);
        add(myRight);
    }
    
    /**
     * format the size and visibility of elements. 
     * @custom.post the panel elements are formatted.
     */
    private void format() {
        
        //make all padding elements invisible
        myLeft.setVisible(false);
        myRight.setVisible(false);
        myCenter.setVisible(false);
         
    }
   
}
