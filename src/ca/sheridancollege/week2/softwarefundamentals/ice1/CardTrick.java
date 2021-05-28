
package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Winston Martinez 991602676
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            Random r = new Random();
            int number1 = r.nextInt(13);
            int valueNum = number1 + 1;           
            
            int suitNum = r.nextInt(4);
            
            c.setValue(valueNum);
            c.setSuit(Card.SUITS[suitNum]);
            magicHand[i] = c;           
        }
        
        /*
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter card value(between 1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter suit(Clubs, Spades, Diamonds, Hearts): ");
        String userSuit = input.next();
        Card userCard = new Card(userSuit, userValue); */
        
        // and search magicHand here
        boolean guess = true;
        for (int i = 0; i < 7; i++) {
            if (luckyCard.getSuit().equals(magicHand[i].getSuit()) && 
            luckyCard.getValue() == magicHand[i].getValue()) {
                guess = true;
            }else{
                guess = false;
            }
        }
        
        //Then report the result here
        if (guess) {
                System.out.printf("You guessed the %d of %s..... It's a match! "
                        + "Yer a wizard Harry!", userValue, userSuit);
            }else{
                System.out.printf("You guessed the %d of %s..... Umm no... You "
                        + "are banned from the Alliannce of Magicians", 
                        userValue, userSuit);
            }
        //follow the remainder of the instructions in the ICE 1 doc
        Card luckyCard = new Card("Diamonds", 12);
    }
    
}
