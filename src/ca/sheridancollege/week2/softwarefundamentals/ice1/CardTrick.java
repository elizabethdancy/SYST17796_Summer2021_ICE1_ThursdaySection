
package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedby Denise Gutierrez in class
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random rv = new Random();
            int vNumber = rv.nextInt(13);
            int valuenum = vNumber + 1;
            c.setValue(valuenum);
            //System.out.print(c.getValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random rs = new Random();
            int sNumber = rs.nextInt(4);
            int suitnum = sNumber;
            c.setSuit(Card.SUITS[suitnum]);
            //System.out.println(c.getSuit());
            System.out.println(c.getValue() + " of " + c.getSuit());
            
            //assign c to magichHand[i] here
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner userCardv = new Scanner(System.in);
        System.out.println("Please pick a card value from 1 - 13.");
        int userValue = userCardv.nextInt();
        
        Scanner userCards = new Scanner(System.in);
        System.out.println("Please pick a suit from 1-4. 1 is Hearts, 2 is Diamonds, 3 is Spades, 4 is Clubs.");
        int userSuit = userCards.nextInt();
        
        // and search magicHand here
        
        for (int i = 0; i < magicHand.length ; i++){
            //if (userValue == c.getValue()){
            //i couldn't get this part to work.. but i tried to iterate through the cards and see if it matches
            //what the user picked
                System.out.println("yes");
            //}
            System.out.println("no");
    }
        
        //Then report the result here
        //follow the remainder of the instructions in the ICE 1 doc
    }
    
}
