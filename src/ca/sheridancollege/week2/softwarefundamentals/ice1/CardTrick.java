package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Chi T. Le - 991185018
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random r = new Random();
            int number = r.nextInt(13);
            int newNum = number + 1;
            c.setValue(newNum);
            //System.out.println(newNum);
            int suit = r.nextInt(4);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[suit]);
            //assign c to magichHand[i] here
            magicHand[i] = c;
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
        
      Scanner scr = new Scanner(System.in); 

      Card player = new Card();
      
      System.out.println("Pick a card! Any card!");
      
      System.out.println("Select card number between 1 to 13");
      
      player.setValue(scr.nextInt()); 
      
      Card luckyCard = new Card();
      luckyCard.setValue(1);
      luckyCard.setSuit(Card.SUITS[1]);

      System.out.println("Select a suit number between 0 to 3");
      player.setSuit(Card.SUITS[scr.nextInt()]);
      
     boolean guessluckyCard = false;
     
     for (int i = 0; i < magicHand.length; i++) { // and search magicHandhere
           if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                guessluckyCard = true;
            break;
         }

         if (guessluckyCard) {
            System.out.println("Your guess " + player.getValue() + " of " + player.getSuit() + " is correct. Congrats!");
         }
         else {
            System.out.println("Your guess " + player.getValue() + " of " + player.getSuit() + " is incorrect. Please try again.");
         }
      /**
        boolean guessMagicHand = false;
        
        for (int i = 0; i < magicHand.length; i++) { 
            if (magicHand[i].getValue() == player.getValue() && magicHand[i].getSuit().equals(player.getSuit())) {
                guessMagicHand = true;
        }
        
        if (guessMagicHand) {
            System.out.println("Your guess " + player.getValue() + " of " + player.getSuit() + " is correct. Congrats!");
        } 
        else {
            System.out.println("Your guess " + player.getValue() + " of " + player.getSuit() + " is incorrect. Please try again.");
         } 
        */
    }
    
}
}
