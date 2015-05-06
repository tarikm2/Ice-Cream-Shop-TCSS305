import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * This is the panel for Flavor options.
 * @author Tarik Merzouk
 * @version 4/24/2015
 *
 */
public class FlavorsPanel extends JPanel {
    
    /**
     * Default serial ID.
     */
    private static final long serialVersionUID = 1L;
    
    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */

    /**
     * JLable for header.
     */
    private JLabel myLabel;
    
    /**
     * text for myLabel.
     */
    private String myText;
    
    /**
     * radio button for French vanilla.
     */
    
    private final JRadioButton myVaniBtn;
    
    /**
     * radio button for Chocolate.
     */
    private  final JRadioButton myChocBtn;
    
    /**
     * radio button for Strawberry.
     */
    private final JRadioButton myStrawBtn;
    
    /**
     * radio button for Mango.
     */
    private final JRadioButton myMangoBtn;
    
    /**
     * JButton group for radio buttons.
     */
    private final ButtonGroup myGroup;
    
    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */

    /**
     * constructor for this panel.
     * @param theListener the listener for the buttons.
     * @custom.post the panel is instantiated.
     */
    public FlavorsPanel(final IceCreamShopFrame.PriceChanger theListener) {
        super();
        //Layout for this panel
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        //instantiation for JLabel
        myText = "The Flavors of Your Choice:";
        myLabel = new JLabel(myText);
        
        //instantiate button group and buttons
        myGroup = new ButtonGroup();
        myVaniBtn = new JRadioButton("French Vanilla", true);
        myChocBtn = new JRadioButton("Chocolate");
        myStrawBtn = new JRadioButton("Strawberry");
        myMangoBtn = new JRadioButton("Mango");
        
        //add buttons to group and panel
        addElements();
        //add action listener
        addListeners(theListener);
    }
    
    /*                                
     *     |\/|  _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */

    /**
     * This method adds action listeners to panel elements.
     * @param theListener the action listener
     * @custom.post the panel's elements are linked to action listener.
     */
    private void addListeners(final IceCreamShopFrame.PriceChanger theListener) {
        myVaniBtn.addActionListener(theListener);
        myChocBtn.addActionListener(theListener);
        myStrawBtn.addActionListener(theListener);
        myMangoBtn.addActionListener(theListener);
    }

    /**
     * this method adds the elements to the group and panel.
     * @custom.post the elements are added to myGroup and the panel.
     */
    private void addElements() {
        //add buttons to myGroup
        myGroup.add(myVaniBtn);
        myGroup.add(myStrawBtn);
        myGroup.add(myChocBtn);
        myGroup.add(myMangoBtn);
        
        //add buttons to panel
        add(myLabel);
        add(myVaniBtn);
        add(myStrawBtn);
        add(myChocBtn);
        add(myMangoBtn); 
        
        //format the panels elements
        format();
    }

    /**
     * this method formats this panels buttons.
     * @custom.post the panel elements are visually formatted.
     */
    private void format() {
        
        //set size of the buttons
        
        //the maximum size
        final Dimension max = new Dimension(myVaniBtn.getMaximumSize());
        //the minimum size
        final Dimension min = new Dimension(myVaniBtn.getMinimumSize());
        //the preferred size
        final Dimension pref = new Dimension(myVaniBtn.getPreferredSize());
        
        //set sizes of elements
        myStrawBtn.setPreferredSize(pref);
        myStrawBtn.setMaximumSize(max);
        myStrawBtn.setMinimumSize(min);
        myChocBtn.setPreferredSize(pref);
        myChocBtn.setMaximumSize(max);
        myChocBtn.setMinimumSize(min);
        myMangoBtn.setPreferredSize(pref);
        myMangoBtn.setMaximumSize(max);
        myMangoBtn.setMinimumSize(min);
        
        //set background color for flavor buttons
        myVaniBtn.setBackground(Color.WHITE);
        myStrawBtn.setBackground(Color.DARK_GRAY);
        myChocBtn.setBackground(Color.RED);
        myMangoBtn.setBackground(Color.ORANGE);
        
        //set text colors for flavor buttons
        myVaniBtn.setForeground(Color.GRAY);
        myStrawBtn.setForeground(Color.GREEN);
        myChocBtn.setForeground(Color.BLUE);
        myMangoBtn.setForeground(Color.MAGENTA);
    }
    
    /*                                                        
     *      _    _   _|_  _|_   _   ._    _ 
     *     (_|  (/_   |_   |_  (/_  |   _> 
     *      _|                                                              
     */

    /**
     * Accessor for myVaniBtn.
     * @return the myVaniBtn
     */
    public JRadioButton getVaniBtn() {
        return myVaniBtn;
    }

    /**
     * Accessor for myChocBtn.
     * @return the myChocBtn
     */
    public JRadioButton getChocBtn() {
        return myChocBtn;
    }

    /**
     * Accessor for myStrawBtn.
     * @return the myStrawBtn
     */
    public JRadioButton getStrawBtn() {
        return myStrawBtn;
    }

    /**
     * Accessor for myMangoBtn.
     * @return the myMangoBtn
     */
    public JRadioButton getMangoBtn() {
        return myMangoBtn;
    }
}
