package bhavneet.singh.s991614899;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Bhavneet Singh
 * @version 1.0
 * @date 1 June 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        Card c = new Card();
        for (int i = 0; i < magicHand.length; i++) {
            
//        }
//            
//        for (int j = 0; j < magicHand.length; j++){
            
            
            //total cards in each suit are 13 where Jack is 11, Queen is 12 and King is 13
            int totalCardInDeck = 13;
            
            /* totalCardInDeck to get the random in a range of 0 - 12
                and adding 1 because 0 is not required 
                the desired range is 1 (Ace) to 13 (King) */ 
            c.setValue((int) (Math.random()*(totalCardInDeck)) + 1); 
            
            // random generation of the suit 
            c.setSuit((int)(Math.random()* 4) + 1);
            System.out.println("the value is "+ c.getValue()+" & the suit is "+c.getSuit());
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        
        //user input 
        Card playerChoice = new Card();
        
        //prompt user to input the card value and its Suit 
        System.out.println("Please enter your value from 0-13 ( where Ace is 1, Jack is 11, Queen is 12 and King is 13 ): ");    
        int userValue = in.nextInt();
        checkingValue(userValue);

        System.out.println("Please enter your suit ( 1 for clubs, 2 for spades, 3 for diamonds, 4 for hearts): ");
        playerChoice.setSuit(in.nextInt());

                
        //comparing the playerMove 
          if (playerChoice.getValue() == (c.getValue()) || (playerChoice.getSuit()) == (c.getSuit()) ){
            System.out.println("YEAH, your card is from the hand!");
         }
            else
             System.out.println("Bad luck! your card is not in the hand of cards");
        
    } // end of the main class 

    public static void checkingValue(int userValue){
        
        Scanner in = new Scanner(System.in);
        
        if (userValue > 13 || userValue < 1){
            System.out.println("Please enter your value from 0-13 ( where Ace is 1, Jack is 11, Queen is 12 and King is 13 ): ");    
            userValue = in.nextInt();
        }
    }
    
    public static void checkSuit(int userSuit){
        
        Scanner in = new Scanner(System.in);
        
        if (userSuit >4 || userSuit < 1){
            System.out.println("Please enter your value from 0-13 ( where Ace is 1, Jack is 11, Queen is 12 and King is 13 ): ");    
            userSuit = in.nextInt();
        }
    }     
    
}