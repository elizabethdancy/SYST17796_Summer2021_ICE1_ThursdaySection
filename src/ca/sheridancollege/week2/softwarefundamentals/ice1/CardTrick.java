
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Yash Patel 
 * Student Number: 991387715
 */
import java.util.*;

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
            int suitNum = r.nextInt(4);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[suitNum]);

            //assign c to magichHand[i] here
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Value:");
        int value = in.nextInt();
        System.out.print("Enter Suit:");
        int suit = in.nextInt();
        Card usercard = new Card();
        usercard.setSuit(Card.SUITS[suit]);
        usercard.setValue(value);
        
        // and search magicHand here
        boolean cardInHand = false;
        for (int i=0; i<magicHand.length; i++)
        {
        	if(usercard.getValue() == magicHand[i].getValue() && usercard.getValue() == magicHand[i].getValue()) {
        		cardInHand = true;
        		break;
        	}
        	cardInHand = false;
        }
        //Then report the result here
        if(cardInHand == true) {
        	System.out.print("Card is in the Hand");
        }
        else {
        	System.out.print("Card is not in the Hand");
        }

    }
    

