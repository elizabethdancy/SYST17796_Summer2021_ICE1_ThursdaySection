
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * @ModifiedBy Camila_Miranada_Barbosa. 
 * Student ID: 991622796

 */
public class CardTrick {
    
    public static void main(String [] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setSuit("Clubs");
        luckyCard.setValue(6);
        
        //Generating the magic cards. 
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int suit = generateRandomIntIntRange(0,3);
            
            int cardNumber = generateRandomIntIntRange(1,13);
            
            c.setSuit(Card.SUITS[suit]);
            
            c.setValue(cardNumber);
            
           magicHand [i] = c;
           
           System.out.println(c);  // Here its just to check if the random numer was the same or not  that user typed.
           
             //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //assign c to magichHand[i] here
        }
        
        Scanner  input = new Scanner (System.in);
        System.out.println("Please type your card (Value and Suit): ");
        int value = input.nextInt( );
        String suit = input.next();
        
         hasCard (magicHand, value, suit) ;
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //follow the remainder of the instructions in the ICE 1 doc
    }
    
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
        
    }
    
    
    public static boolean hasCard ( Card[] magicHand, int value, String suit) {
        
        //for (int i = 0; i < magicHand.length; i++){
        
        for (Card card: magicHand){
        
            if ( card.getValue()== value && card.getSuit().equalsIgnoreCase(suit)){
                System.out.println("You got the magic card. Congratulations!!!");
                return true;
                
            }
            
        }
        
        System.out.println("Sorry! you dind't get the magic card.");
        return false;
    
    }
    
    
}
