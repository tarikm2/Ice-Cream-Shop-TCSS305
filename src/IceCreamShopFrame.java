import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This is the main frame for Monika's Ice Cream Shop.
 * @author Tarik Merzouk
 * @version 4/22/2015
 */
public class IceCreamShopFrame extends JFrame {
    
    /**
     * Default serial ID.
     */
    private static final long serialVersionUID = 1L;

    /*     _               
     *     |_ _     o |   _|     _ 
     *     |    (/_ |  |  (_|  _>                     
     */
    
    /**
     * Used to determine label's font size.
     */
    private static final int FONTSIZE = 24;
    
    /**
     * Text for the title.
     */
    private final String myText;
    
    /**
     * Label that displays the header.
     */
    private JLabel myLabel;
    
    /**
     * Panel for left of the Layout.
     */
    private  final SizePanel myPanelL;
    
    /**
     * Panel for the center items.
     */
    private final CenterFrame myPanelC;
    
    /**
     * Panel for Mix-Ins.
     */
    private final MixInsPanel myPanelR;
    
    /**
     * panel for the order section.
     */
    private final Bottom myPanelB;
    
    /**
     * price update listener.
     */
    private final PriceChanger myPriceListener;
    
    /*_                                               
     *     /     _   _     _   _|_  ._        _  _|_   _   ._ 
     *     \_  (_)  | |  _>   |_  |   |_|  (_   |_  (_)  |   
     */
    
    /**
     * constructor for the frame.
     * @custom.post GUI with components created.
     */
    public IceCreamShopFrame() {
        super();
        myText = "Welcome to MoniKa's Ice-Cream Parlor!";
        
        //instantiate listener
        myPriceListener = new PriceChanger();
        //Instantiate the panels for the page.
        myPanelL = new SizePanel(myPriceListener);
        myPanelC = new CenterFrame(myPriceListener);
        myPanelR = new MixInsPanel(myPriceListener);
        myPanelB = new Bottom(myPriceListener);
        myPriceListener.updateOrderTotal();
        
        buildGUI();
        format();
    }

    /*                                
     *     |\/|   _   _|_  |_    _    _|   _ 
     *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
     */
    
    /**
     * method for building the GUI.
     * @custom.post the GUI for this frame is constructed.
     */
    private void buildGUI() {
        
        //add a label with specific text yea.
        myLabel = new JLabel(myText);
        
        //set font for the label.
        myLabel.setFont(new Font("Comic Sans", Font.BOLD, FONTSIZE));
        
        //center label
        myLabel.setHorizontalAlignment(JLabel.CENTER);
        
        //add this label to JFrame.
        add(myLabel, BorderLayout.NORTH);
        
        //add the west panel (drop-down) to the frame.
        add(myPanelL, BorderLayout.WEST);
        
        //add the center frame (Cone Type & Flavors) to frame.
        add(myPanelC, BorderLayout.CENTER);
        
        //add the east frame (mixes) to the frame.
        add(myPanelR, BorderLayout.EAST);
        
        //add the bottom panel
        add(myPanelB, BorderLayout.SOUTH);
        
        pack();
    }
      
    /**
     * format the frames appearance.
     * @custom.post the frames elements are formatted.
     */
    private void format() {
        //set the foreground color of label
        myLabel.setForeground(Color.RED);
        
        //set the background color of label
        myLabel.setBackground(Color.DARK_GRAY);
        
    }
    
    
 /*                                                        
  *      /\   _ _|_ o _  ._    |  o  _  _|_   _   _   _     _    _ |  _.  _  _ 
  *     /--\ (_  |_ | (_) | |   |_ | _>   |_  (/_ | | (/_  |    (_ | (_| _> _>
  */
    
    /**
     * Represents a price changer.
     * @author Tarik Merzouk
     * @version 4/28/2015
     */
    protected class PriceChanger implements ActionListener {
          
        /*     _               
         *     |_ _     o |   _|     _ 
         *     |    (/_ |  |  (_|  _>                     
         */
        
        /**
         * Running total of size selection.
         */
        private double mySizeCost = Cost.MED;
        
        /**
         * Size selection for order form.
         */
        private String mySizeSelection = Options.OURS;
        
        /**
         * Running total of cone selection.
         */
        private double myConeCost = Cost.PAPER;
        
        /**
         * Cone selection for order form.
         */
        private String myConeSelection = Options.PAPER;
        
        /**
         * Running total of Flavors selection.
         */
        private double myFlavorsCost = Cost.VANILLA;
        
        /**
         * Flavor selection for order form.
         */
        private String myFlavorSelection = Options.VANILLA;
        
        /**
         * Running total for mix in cost.
         */
        private double myMixCost = 0.0;
        
        /**
         * Mix-ins selection for order form.
         */
        private String myMixSelection = "";
        
        /**
         * order total.
         */
        private double myTotal = mySizeCost + myConeCost 
                     + myFlavorsCost + myMixCost; 

        /*                                
         *     |\/|   _   _|_  |_    _    _|   _ 
         *     |  |  (/_   |_  | |  (_)  (_|  _>                                  
         */
        
        /**
         * Performs a change in the Final Price 
         * Also updates the information for the order form.
         * @param theEvent is the component that was clicked by user.
         * @custom.post price updated to reflect selections.
         */
        @Override
        public void actionPerformed(final ActionEvent theEvent) {
            
            //object for storing the source of the event
            final Object source = theEvent.getSource();
            
            
            //following is the mix-ins option case.
            if (source == myPanelR.getBananaCherry()
                || source == myPanelR.getBerryLemon()
                || source == myPanelR.getGrapeOrange()
                || source == myPanelR.getAppleCoconut()) {
                updateMixInCost();
            } else if (source == myPanelC.myConeTypePanel.getSugarBtn()) { //cone selection.
                myConeCost = Cost.SUGAR;
                myConeSelection = Options.SUGAR; 
            } else if (source == myPanelC.myConeTypePanel.getWaffleBtn()) {
                myConeCost = Cost.WAFFLE;
                myConeSelection = Options.WAFFLE;
            } else if (source == myPanelC.myConeTypePanel.getPaperBtn()) {
                myConeCost = Cost.PAPER; 
                myConeSelection = Options.PAPER;
            } else if (source == myPanelC.myPanelFlavors.getVaniBtn()) { //options for flavors.
                myFlavorsCost = Cost.VANILLA;
                myFlavorSelection = Options.VANILLA;
            } else if (source == myPanelC.myPanelFlavors.getChocBtn()) {
                myFlavorsCost = Cost.CHOCOLATE;
                myFlavorSelection = Options.CHOCOLATE;
            } else if (source == myPanelC.myPanelFlavors.getStrawBtn())  {
                myFlavorsCost = Cost.STRAWBERRY;
                myFlavorSelection = Options.STRAWBERRY;
            } else if (source == myPanelC.myPanelFlavors.getMangoBtn()) {
                myFlavorsCost = Cost.MANGO;
                myFlavorSelection = Options.MANGO;
            } else if (source == myPanelB.myCenter.getOrderBtn()) {
                //launch the order summary window.
                order();
            } else if (source == myPanelL.getSizesSelection()) {
                final String size = (String) myPanelL.getSizesSelection().getSelectedItem();
                if (size.equals("Mine (16 oz)")) {
                    mySizeCost = Cost.SMALL;
                    mySizeSelection = Options.MINE;
                } else if (size.equals("Ours (32 oz)")) {
                    mySizeCost = Cost.MED;
                    mySizeSelection = Options.OURS;
                } else if (size.equals("Everybody's (48 oz)")) {
                    mySizeCost = Cost.LARGE;
                    mySizeSelection = Options.EVERYBODY;
                }
            }
            
            //update order total
            updateOrderTotal();
        }
        
        /**
         * this method launches the order dialog box.
         * @cusom.post order confrirmation is launched.
         */
        private void order() {
            final String order = "Your Ice Cream Order:" + "\n"
                            + mySizeSelection + "\n"
                            + myConeSelection + "\n"
                            + myFlavorSelection + "\n"
                            + myMixSelection 
                            + "___________________________"
                            + "\n"
                            + String.format(Options.MY_FORMAT, "Total:                "
                                + "                   ", myTotal) + "\n"
                            + "Confirm Order?" + "\n";
  
            JOptionPane.showConfirmDialog(null, order);
            
            
        }

        /**
         * This method passes the updated total to myPanelB.
         * @custom.post the order total is updated.
         */
        protected void updateOrderTotal() {
            myTotal = mySizeCost + myConeCost
                    + myFlavorsCost + myMixCost;
            myPanelB.myCenter.setTotal(String.format("%.2f", myTotal));
           
        }

        /**
         * This method updates the cost of 
         * selected mix-ins when 
         * a mix-in action event occurs.
         * @custom.post the mix in cost is updated.
         */
        private void updateMixInCost() {
            //reset the cost of mix-ins
            myMixCost = 0.0;  
            myMixSelection = "";
            
            //if mix-in selected then add to cost
            if (myPanelR.getBananaCherry().isSelected()) {
                myMixCost += Cost.MIX_IN;
                myMixSelection += Options.BANANA_CHERRY;
            }
            if (myPanelR.getBerryLemon().isSelected()) {
                myMixCost += Cost.MIX_IN;
                myMixSelection += Options.BERRY_LEMON;
            }
            if (myPanelR.getGrapeOrange().isSelected()) {
                myMixCost += Cost.MIX_IN;
                myMixSelection += Options.GRAPE_ORANGE;
            }
            if (myPanelR.getAppleCoconut().isSelected()) {
                myMixCost += Cost.MIX_IN;
                myMixSelection += Options.APPLE_COCONUT;
            }
        }
    }
}
