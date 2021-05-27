
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy Tamara Dang 991223558
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            //assign c to magichHand[i] here
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        //Scanner input = new Scanner(System.in);
        
        Card user = new Card();
        user.setValue(8);
        user.setSuit(Card.SUITS[2]);
        
        //System.out.println("Enter a card value from 1-13: ");
        //user.setValue(input.nextInt());
        
        //System.out.println("Enter a card suit from 0-3: ");
        //user.setSuit(Card.SUITS[input.nextInt()]);
        
        // and search magicHand here
        int found = 0;
        
        for (int i=0; i<magicHand.length; i++)   
        {
            if (user.getSuit().equals(magicHand[i].getSuit()) && 
                    user.getValue() == magicHand[i].getValue()) {
                found++;
            }
        }

        //Then report the result here
        if (found >= 1) {
            System.out.println("Yes, your card, " + user.getValue() + " of " + 
                    user.getSuit() + ", was found.");
        } else {
            System.out.println("No, your card, " + user.getValue() + " of " + 
                    user.getSuit() + ", was not found.");
        }

        //follow the remainder of the instructions in the ICE 1 doc
    }
    
}
