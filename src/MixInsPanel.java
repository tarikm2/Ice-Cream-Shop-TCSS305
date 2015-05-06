import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is the mix ins panel.
 * @author Tarik Merzouk
 * @version 4/24/2015
 */
public class MixInsPanel extends JPanel {
    
    /**
     * default ID.
     */
    private static final long serialVersionUID = 1L;
    
    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */
    
    /**
     * Label for the panel.
     */
    private JLabel myLabel;
    
    /**
     * String for myLabel.
     */
    private String myString;
    
    /**
     * check box for berry lemon.
     */
    private JCheckBox myBerryLemon;
    
    /**
     * check box for banana cherry.
     */
    private JCheckBox myBananaCherry;
    
    /**
     * check box for grape orange.
     */
    private JCheckBox myGrapeOrange;
    
    /**
     * check box for apple coconut.
     */
    private JCheckBox myAppleCoconut;
    
    
    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */
    
    /**
     * Constructor for this panel.
     * @param theListener action listener for events.
     * @custom.post panel is instantiated.
     */
    public MixInsPanel(final IceCreamShopFrame.PriceChanger  theListener) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        //instantiate myLabel
        myString = "Mix-Ins:";
        myLabel = new JLabel(myString);
        
        //instantiate check boxes
        myBerryLemon = new JCheckBox("Berry Lemon");
        myBananaCherry = new JCheckBox("Banana Cherry");
        myGrapeOrange = new JCheckBox("Grape Orange");
        myAppleCoconut = new JCheckBox("Apple Coconut");
        
        //add elements to panel
        addElements();
        //format the panels elements
        format();
        //add listener
        addListeners(theListener);
    }
    
    /*                                
     *     |\/|  _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */
    
    /**
     * adds theListener action listener to page componenets.
     * @param theListener listener for events.
     * @custom.post the panel's components are linked to the actionListener.
     */
    private void addListeners(final IceCreamShopFrame.PriceChanger theListener) {
        myBerryLemon.addActionListener(theListener);
        myBananaCherry.addActionListener(theListener);
        myGrapeOrange.addActionListener(theListener);
        myAppleCoconut.addActionListener(theListener);
    }

    /**
     * this method adds the elements to the panel.
     * @custom.post the panel's elements are added to the panel.
     */
    private void addElements() {
        
        //add the check boxes to the panel
        add(myLabel);
        add(myBerryLemon);
        add(myBananaCherry);
        add(myGrapeOrange);
        add(myAppleCoconut);
        
    }
    
    /**
     * format the panel's elements.
     * @custom.post panel's components are visually formatted.
     */
    private void format() {
        myBerryLemon.setForeground(Color.YELLOW);
        myBananaCherry.setForeground(Color.PINK);
        myGrapeOrange.setForeground(Color.ORANGE);           
    }
    
    /*                                                        
     *      _    _   _|_  _|_   _   ._   _ 
     *     (_|  (/_   |_   |_  (/_  |  _> 
     *      _|                                                              
     */
    
    /**
     * Accessor method for myBerryLemon.
     * @return myBerryLemon object.
     */
    public JCheckBox getBerryLemon() {
        return myBerryLemon;
    }
    
    /**
     * Accessor method for myBananaCherry.
     * @return myBananaCherry object.
     */
    public JCheckBox getBananaCherry() {
        return myBananaCherry;
    }

    /**
     * Accessor menthod for myGrapeOrange.
     * @return myGrapeOrange object.
     */
    public JCheckBox getGrapeOrange() {
        return myGrapeOrange;
    }

    /**
     * Accessor method for myAppleCoconut.
     * @return myAppleCoconut object.
     */
    public JCheckBox getAppleCoconut() {
        return myAppleCoconut;
    }
}
