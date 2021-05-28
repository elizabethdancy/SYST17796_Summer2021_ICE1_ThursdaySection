package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifiedBy Joy Jieun Jung
 */
public class CardTrick
{

    public static void main (String[] args)
    {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            Random r = new Random();
            int number = r.nextInt(13);
            int newNum = number + 1;
            c.setValue(newNum);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suitNum = r.nextInt(4);
            c.setSuit(Card.SUITS[suitNum]);

            //assign c to magichHand[i] here
            magicHand[i] = c;
            //System.out.println(c.getValue() + " of: " + c.getSuit());
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a card number(1-13): ");
        int userValue = sc.nextInt();
        System.out.print("Pick a card suit(Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = sc.next();

        // and search magicHand here
        //Then report the result here
        for (int i = 0; i < magicHand.length; i++) {

            if (userValue == magicHand[i].getValue() && userSuit.equalsIgnoreCase(magicHand[i].getSuit())) {
                System.out.println("Conglatuation! Your card " + userValue + " of " + userSuit + " is in the magic hand!");
            }
            else {
                System.out.println("Sorry! Your card " + userValue + " of " + userSuit + " is not in the magic hand!");
            }
            return;
        }

        //follow the remainder of the instructions in the ICE 1 doc
    }

}
