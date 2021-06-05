package bhavneet.singh.s991614899;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Bhavneet Singh
 * @version 1.3
 * @date 4 June 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        // for the random genertion 
        Card c = new Card();
        
        for (int i = 0; i < magicHand.length; i++) {
            
            // change for the memory allocation needed
            magicHand[i] = new Card();
            
            //total cards in each suit are 13 where Jack is 11, Queen is 12 and King is 13
            int totalCardInDeck = 13;
            
            /* totalCardInDeck to get the random in a range of 0 - 12
                and adding 1 because 0 is not required 
                the desired range is 1 (Ace) to 13 (King) */ 
            c.setValue((int) (Math.random()*(totalCardInDeck)) + 1); 
            
            // random generation of the suit 
            c.setSuit((int)(Math.random()* 4) + 1);
            
            //assigning the value of [i] = c 
            magicHand[i] = c;
            
        }      
        
        // hard coded on the github
        Card luckyCard = new Card();
        luckyCard.setValue(1);   // 1 -> Ace
        luckyCard.setSuit(4);    // 4 -> Hearts 
        
        //comparing the luckyCard with the magicHand 
        for (int i= 0; i < magicHand.length; i++){
            if (luckyCard.getValue() == (magicHand[i].getValue()) && (luckyCard.getSuit()) == (magicHand[i].getSuit()) ){
              System.out.println("You win, your card is the hand!");
              break;
           }
            else{
                System.out.println("You lose, your card is not in the hand");
                break;
            }      
        }
        
    }   // end of the main Class
}