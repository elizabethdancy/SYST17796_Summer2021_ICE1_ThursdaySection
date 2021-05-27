package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Andraws
 * Student ID: 991407087
 */
public class CardTrick
{
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card[] luckyCard = new Card[1];
        luckyCard.setValue(1);
        luckyCard.setSuit(Card.SUITS[Hearts]);
        Random rand = new Random();
        int low = 1;
        int high = 14;
        
        for (int i=0; i<magicHand.length; i++)
        { 
            int value = rand.nextInt(high-low) + low;
            int suit = rand.nextInt(4);
            Card card = new Card();
           
            card.setValue(value);
            card.setSuit(Card.SUITS[suit]);
            
            magicHand[i]=card;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter your card value (1-13):");
        int cardValue = scanner.nextInt();  // Read user input
        System.out.println("You card value is: " + cardValue);  // Output user input
        
        String empty = scanner.nextLine(); //Empty scanner to read next line
        
        System.out.println("Enter your card suit (Clubs, Spades, Diamonds, Hearts):");
        String cardSuit = scanner.nextLine();  // Read user input
        System.out.println("Your card suit is: " + cardSuit);  // Output user input
        
        for (Card magicHand1 : magicHand)
        {
            if (cardValue == magicHand1.getValue() && cardSuit.equals(magicHand1.getSuit()))
            {
                System.out.println("You guessed the card right! :)");
                break;
            }
        }
    }
}
