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
        luckyCard.setSuit(4)    // 4 -> Hearts 
        
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
        
        /*
        //user input 
        Card playerChoice = new Card();
        
        //prompt user to input the card value 
        System.out.println("Please enter your value from 0-13 ( where Ace is 1, Jack is 11, Queen is 12 and King is 13 ): ");    
        int userValue = in.nextInt();
        
        //to check the user input if user input is invalid then ask again
        if (isValidMove(userValue)){
            playerChoice.setValue(userValue);
        }
        else{
             System.out.println(userValue + " is invalid card");
             checkValue(userValue,in);
             playerChoice.setValue(userValue);
        }
       
        //prompt user to input the suit
        System.out.println("Please enter your suit ( 1 for clubs, 2 for spades, 3 for diamonds, 4 for hearts):  ");    
        int userSuit = in.nextInt();
            
        //to check the user input if user input is invalid then ask again
        if (isValidSuit(userSuit)){
                playerChoice.setSuit(userSuit);
        }
        else{
               System.out.println(userSuit + " is invalid suit");
                checkSuit(userSuit,in);
                playerChoice.setSuit(userSuit);
        }

        //comparing the playerchoice with the magicHand 
        for (int i= 0; i < magicHand.length; i++){
            if (playerChoice.getValue() == (magicHand[i].getValue()) && (playerChoice.getSuit()) == (magicHand[i].getSuit()) ){
              System.out.println("You win, your card is from the hand!");
              break;
           }
            else{
                System.out.println("You lose, your card is not in the hand");
                break;
            }      
        }
        
        //closing Scanner
        in.close();
        */
        
    } // end of the main class 

    /*
    public static void checkValue(int userValue,Scanner in){
        if (userValue >13 || userValue < 1){
            System.out.println("Please enter your value from 0-13 ( where Ace is 1, Jack is 11, Queen is 12 and King is 13 ): ");
            userValue = in.nextInt();
        }
    }
    
    public static void checkSuit(int userSuit,Scanner in){
        if (userSuit >4 || userSuit < 1){ 
            System.out.println("Please enter your suit ( 1 for clubs, 2 for spades, 3 for diamonds, 4 for hearts): ");   
            userSuit = in.nextInt();
        }
    }        
    
    public static boolean isValidMove(int userValue) {
        switch (userValue) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return true;
            case 13:
                return true;
            default:
                return false;
        }  
    }
    
    public static boolean isValidSuit(int userSuit) {
        switch (userSuit) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return false;
        }
    }
    */
    
}
