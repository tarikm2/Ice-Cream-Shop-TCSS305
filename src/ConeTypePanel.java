import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * this is the panel for cone type.
 * @author Tarik Merzouk
 * @version 4/24/2015
 */

public class ConeTypePanel extends JPanel {
    
    /**
     * Default serial ID.
     */
    private static final long serialVersionUID = 1L;

    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */
    
    /**
     * JLabel for header.
     */
    private JLabel myLabel;
       
     /**
      * text for myLabel.
      */
    private String myText;
       
     /**
      * Jbutton for sugar cone.
      */
    private JButton mySugarBtn;
        
     /**
      * JButton for waffle cone.
      */
    private JButton myWaffleBtn;
     
     /**
      * JButton for paper cone.
      */
    private final  JButton myPaperBtn;
    
    /**
     * radio group for cone types.
     */
    private final ButtonGroup myGroup;
   
    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */
    
    /**
     * constructor for this panel.
     * @custom.post the panel is instantiated.
     */
    public ConeTypePanel(IceCreamShopFrame.PriceChanger theListener) {
        super();
        
        //layout for panel
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        //instantiate myLabel
        myText = "Cone Type:";
        myLabel = new JLabel(myText);
        
        //instantiate buttons and group
        myGroup = new ButtonGroup();
        mySugarBtn = new JButton("Sugar Cone");
        myWaffleBtn = new JButton("Waffle cone");
        myPaperBtn = new JButton("Paper cup");
        
        //add buttons to panel
        addButtons();
        //format panel elemets
        format();
        //add listener to panel components
        addListeners(theListener);
    }
    
    /*                                
     *     |\/|  _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */

    /**
     * Add the buttons.
     * @custom.post elements are added to the panel.
     */
    private void addButtons() {
        //add buttons to radio group.
        myGroup.add(mySugarBtn);
        myGroup.add(myWaffleBtn);
        myGroup.add(myPaperBtn);
        
        //add buttons and label to panel
        add(myLabel);
        add(mySugarBtn);
        add(myWaffleBtn);
        add(myPaperBtn);
    }
    
    /**
     * Formats the panel elements.
     * @custom.post panel elements are visually formatted.
     */
    private void format() {
        
        //conform Sugar cone btn to size of Waffle Cone btn
        mySugarBtn.setPreferredSize(myWaffleBtn.getPreferredSize());
        mySugarBtn.setMaximumSize(myWaffleBtn.getMaximumSize());
        mySugarBtn.setMinimumSize(myWaffleBtn.getMinimumSize());
        
        //conform paper cup btn to size of waffle cone Btn
        myPaperBtn.setPreferredSize(myWaffleBtn.getPreferredSize());
        myPaperBtn.setMaximumSize(myWaffleBtn.getMaximumSize());
        myPaperBtn.setMinimumSize(myWaffleBtn.getMinimumSize());
        
        //set font color for cone selection buttons
        mySugarBtn.setForeground(Color.RED);
        myWaffleBtn.setForeground(Color.PINK);
        myPaperBtn.setForeground(Color.GRAY);
        
        myPaperBtn.requestFocusInWindow();
    }
    
    /**
     * This method adds the action listener to page components.
     * @param theListener the actionlistener for the buttons.
     * @custom.post the action listener is added to panel elements.
     */
    private void addListeners(final IceCreamShopFrame.PriceChanger theListener) {
        mySugarBtn.addActionListener(theListener);
        myWaffleBtn.addActionListener(theListener);
        myPaperBtn.addActionListener(theListener);
    }

    /*                                                        
     *      _    _   _|_  _|_   _   ._    |\/|   _   _|_  |_    _    _|   _ 
     *     (_|  (/_   |_   |_  (/_  |     |   |  (/_   |_  | |  (_)  (_|  _> 
     *      _|                                                              
     */
    
    /**
     * Accessor method for mySugarBtn.
     * @return the mySugarBtn
     */
    public JButton getSugarBtn() {
        return mySugarBtn;
    }

    /**
     * Accessor method for myWaffleBtn.
     * @return the myWaffleBtn
     */
    public JButton getWaffleBtn() {
        return myWaffleBtn;
    }

    /**
     * Accessor method for myPaperBtn.
     * @return the myPaperBtn
     */
    public JButton getPaperBtn() {
        return myPaperBtn;
    }
}
