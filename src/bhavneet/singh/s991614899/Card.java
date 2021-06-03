package bhavneet.singh.s991614899;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * 
 * @author Bhavneet Singh
 * @version 1.0
 * @date 1 June 2021
 */
public class Card {

   private int suit; // 1 for clubs, 2 for spades, 3 for diamonds, 4 for hearts
   private int value;   //1-13

//   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
   public Card(){
       this.suit = suit;
       this.value = value;
   }
   
   /**
     * @return the suit
     */
    public int getSuit() {
        return suit;
    }
    
    public int getValue(){
        return value;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
   
   
    
}
