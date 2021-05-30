
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Nadia Ghazal
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
            int newNum = number+1;
            c.setValue(newNum);
            int suitNum = r.nextInt(4);
            c.setSuit(Card.SUITS[suitNum]);
            System.out.println(c.getValue() + " of: "+ c.getSuit());
            magicHand[i] = c;
            //assign c to magichHand[i] here
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //follow the remainder of the instructions in the ICE 1 doc
       
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a card value between 1 and 13:");      
        int cardValue = in.nextInt();
        in.nextLine();
        System.out.print("Enter a card suit:");
        String suit = in.nextLine();
        */
        boolean found = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue() == cardValue && suit.toLowerCase().equals(magicHand[i].getSuit().toLowerCase()))
            {
                found = true;
                break;
            }
        }
        
        if(found) {
            System.out.println("Your card is in the Magic Hand!!");
        } else {
            System.out.println("Your card is NOT in the Magic Hand!");
        }
        
        
    }
    
}
