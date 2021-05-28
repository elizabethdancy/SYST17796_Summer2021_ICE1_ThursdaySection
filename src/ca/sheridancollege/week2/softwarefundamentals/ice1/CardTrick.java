
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifyedBy emmettlaw10 (991628505)
 * 
 */

import java.util.Scanner;

public class CardTrick {
   
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            //assign c to magichHand[i] here
            magicHand [i] = c;
            System.out.println(c.getValue() + c.getSuit());
            
            
            
            
        }
    Scanner scan = new Scanner(System.in); 
    Card userCard = new Card();
    System.out.println("Choose the number of your card ( number between 1-13(ace is one, jack is 11, Queen 12, King 13))");
    userCard.setValue(scan.nextInt());
    System.out.println("Please choose a number between 0-3 to represent the suit (hearts =0, diamonds = 1, spades = 2, clubs = 3");
    userCard.setSuit(Card.SUITS[scan.nextInt()]);
    
    
    char isThere = 'F';
    for (int i = 0; i < 6; i++) {
        if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit()))
            isThere = 'T';
    }
      
    if (isThere == 'T') {
        System.out.println("Your Card was in the magic hand! your card was: " +userCard.getValue() + " of " + userCard.getSuit() );
    }
    else {
        System.out.println("Your Card was NOT in the magic hand :(. your card was: " +userCard.getValue() + " of " + userCard.getSuit() );
    }
            
        
  //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //follow the remainder of the instructions in the ICE 1 doc
    }
    
}
