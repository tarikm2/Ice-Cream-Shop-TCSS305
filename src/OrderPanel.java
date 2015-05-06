import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The panel displaying the order totals and order button.
 * @author Tarik Merzouk
 * @version 4/24/2015
 */
public class OrderPanel extends JPanel {
    
    /**
     * default id.
     */
    private static final long serialVersionUID = 1L;
    
    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */

    /**
     * label for order.
     */
    private final JLabel myLabelP;
    
    /**
     * label for showing order total.
     */
    private final JLabel myLabelO;
    
    /**
     * label for line delimiter.
     */
    private final JLabel myLabelL;
    
    /**
     * string for label.
     */
    private String myString;
    
    /**
     * button for ordering. 
     */
    private final JButton myOrderBtn;
    
    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */
    
    /**
     * main constructor for order panel.
     * @param theListener the listener to add.
     * @custom.post the panel is instantiated.
     */
    public OrderPanel(final IceCreamShopFrame.PriceChanger theListener) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        myString = "Price:";
        
        //jLabels for the total sales
        myLabelP = new JLabel(myString);
        myLabelO = new JLabel("8.99");
        myLabelL = new JLabel("-----------------");
        myOrderBtn = new JButton("Order");

        //add the components to the panel
        addButtons();
        //add action listener
        addListeners(theListener);
    }

    /*                                
     *     |\/|  _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */
    
    /**
     * adds action listener to order button.
     * @param theListener listener to add.
     * @custom.post action listener is added to order button.
     */
    private void addListeners(final IceCreamShopFrame.PriceChanger theListener) {
        myOrderBtn.addActionListener(theListener);
    }

    /**
     * method for setting order total.
     * @param theTotal updated total
     * @custom.post myLabelO is updated to reflect total
     */
    protected void setTotal(final String theTotal) {
        myLabelO.setText(theTotal);
    }

    /**
     * adds buttons.
     * @custom.post the elements are added to the panel.
     */
    private void addButtons() {
        add(myLabelP);
        add(myLabelO);
        add(myLabelL);
        add(myOrderBtn);
    }
    
    /*                                                        
     *      _    _   _|_  _|_   _   ._   _ 
     *     (_|  (/_   |_   |_  (/_  |  _> 
     *      _|                                                              
     */
    
    /**
     * Getter method for order button.
     * @return myOrderBtn
     */
    public JButton getOrderBtn() {
        return myOrderBtn;
    }
}
