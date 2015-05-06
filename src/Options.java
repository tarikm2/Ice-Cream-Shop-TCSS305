/**
 * Options is an enum type to store 
 * String representations for order
 * options.
 */

/**
 * @author Tarik Merzouk
 * @version 4/29/2015
 *
 */
public enum Options {;

    /**
     * max width for formatting string.
     */
    private static final int MY_MAX_WIDTH = 30;

    /**
     * formatting string for the options.
     */
    public static final String MY_FORMAT = "%-" + MY_MAX_WIDTH + "s$%.2f";
    
    /**
     * String representing med selection.
     */
    public static final String OURS 
        = String.format(MY_FORMAT, "Ours (32oz):                          ", Cost.MED);

    /**
     * String representing small selection. 
     */
    public static final String MINE 
        = String.format(MY_FORMAT, "Mine (16oz):                           ", Cost.SMALL);
    
    /**
     * String representing large selection.
     */
    public static final String EVERYBODY 
        = String.format(MY_FORMAT, "Everybody's (46oz):", Cost.LARGE);
    
    /**
     * String representing sugar cone selection.
     */
    public static final String SUGAR 
        = String.format(MY_FORMAT, "Sugar Cone:                           ", Cost.SUGAR);
    
    /**
     * String representing waffle cone selection.
     */
    public static final String WAFFLE 
        = String.format(MY_FORMAT, "Waffle Cone:                         ", Cost.WAFFLE);
    
    /**
     * String representing paper cup selection.
     */
    public static final String PAPER 
        = String.format(MY_FORMAT, "Paper Cup:                            ", Cost.PAPER);
    
    /**
     * String representing vanilla selection.
     */
    public static final String VANILLA 
        = String.format(MY_FORMAT, "French Vanilla:                      ", Cost.VANILLA);
    
    /**
     * String representing strawberry selection.
     */
    public static final String STRAWBERRY 
        = String.format(MY_FORMAT, "Strawberry:                           ", Cost.STRAWBERRY);
    
    /**
     * String representing chocolate selection.
     */
    public static final String CHOCOLATE 
        = String.format(MY_FORMAT, "Chocolate:                            ", Cost.CHOCOLATE);
    
    /**
     * String representing mango selection.
     */
    public static final String MANGO 
        = String.format(MY_FORMAT, "Mango:                                   ", Cost.MANGO);
    
    /**
     * String representing berry lemon selection.
     */
    public static final String BERRY_LEMON 
        = String.format(MY_FORMAT + "\n", "Berry Lemon:                        ", Cost.MIX_IN);
    
    /**
     * String representing banana cherry selection.
     */
    public static final String BANANA_CHERRY 
        = String.format(MY_FORMAT + "\n", "Banana Cherry:                    ", Cost.MIX_IN);
    
    /**
     * String representing grape orange selection.
     */
    public static final String GRAPE_ORANGE 
        = String.format(MY_FORMAT + "\n", "Grape Orange:                      ", Cost.MIX_IN);
    
    /**
     * String representing apple coconut selection.
     */
    public static final String APPLE_COCONUT 
        = String.format(MY_FORMAT + "\n", "Apple Coconut:                     ", Cost.MIX_IN);
    
    

}
