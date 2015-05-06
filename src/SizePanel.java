import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This represents a drop-down menu with radio 
 * options for selecting ice cream cone sizes.
 * @author Tarik Merzouk
 * @version 4/22/2015
 *
 */
public class SizePanel extends JPanel {
    /**
     * Default serial number for the class.
     */
    private static final long serialVersionUID = 1L;
    
    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */
    
    /**
     * myLabel is the label for size selection.
     */
    private JLabel myLabel;
    
    /**
     * text for the JLabel.
     */
    private final String myText;
    
    /**
     * JComboBox for cone sizes.
     */
    private final JComboBox mySizes;
    
    /**
     * List of options for mySizes selection.
     */
    private final String[] mySizeStrings = 
    {"Mine (16 oz)", "Ours (32 oz)", "Everybody's (48 oz)"};

    /*      _                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |    
     */
    
    /**
     * SizePanel represents a JComboBox for size selection.
     * @param theListener the action listener.
     * @custom.post the panel is instantiated.
     */
    public SizePanel(final IceCreamShopFrame.PriceChanger theListener) {
        super();
        //layout for size panel
        setLayout(new BoxLayout(this, 1));
        
        //instantiate myLabel
        myText = "Ice Cream Size:";
        myLabel = new JLabel(myText);
        
        //instantiate mySizes
        mySizes = new JComboBox(mySizeStrings);
        mySizes.setSelectedIndex(1);

        //add elements to panel
        addButtons();
        //format elements
        format();
        //add action listener to elements
        addListeners(theListener);
    }
       
    /*                                
     *     |\/|  _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */
    
    /**
     * This method adds the action listener to mySizes elements.
     * @param theListener action listener to add to elements
     * @custom.post the panel elements have the action listener.
     */
    private void addListeners(final IceCreamShopFrame.PriceChanger theListener) {
        mySizes.addActionListener(theListener);
    }

    /**
     * Adds page elements.
     * @custom.post elements are added to the panel.
     */
    private void addButtons() {
        add(myLabel);
        add(mySizes); 
    }
    
    /**
     * format panel elements.
     * @custom.post the panel elements are formatted.
     */
    private void format() {
        //invisible label for formating size of mySizes
        final JLabel format = new JLabel("                                ");
        final int fontSize = 20;
        format.setFont(new Font("comic sans", Font.BOLD, fontSize));
        
        //max size for mySizes
        final Dimension max = new Dimension(format.getMaximumSize());
        //min size for mySizes
        final Dimension min = new Dimension(format.getMinimumSize());
        //pref size
        final Dimension pref = new Dimension(format.getPreferredSize());
        
        //set size for my dropdowm
        mySizes.setMaximumSize(max);
        mySizes.setMinimumSize(min);
        mySizes.setPreferredSize(pref);
        
        myLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mySizes.setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    
    /*                                                        
     *      _    _   _|_  _|_   _   ._    _ 
     *     (_|  (/_   |_   |_  (/_  |   _> 
     *      _|                                                              
     */
    
    /**
     * this is the accessor method for the JComboBox.
     * @return mySizes (size selection combo box).
     */
    public JComboBox getSizesSelection() {
        return mySizes;
        
    }
}
