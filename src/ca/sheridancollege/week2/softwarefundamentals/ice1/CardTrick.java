package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified tehrazeh
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length ; i++)
        {
            Card c = new Card();
            c.setValue(((int)Math.random()*13 +1));
            c.setSuit(Card.SUITS[(int)Math.random() * 4]);
           magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a card number (1-13): ");
        luckyCard.setValue(input.nextInt());
        
        System.out.print("Enter a card suit (0-3): ");
        int suit = input.nextInt();
        luckyCard.setSuit(Card.SUITS[suit]);
        
        for (Card card: magicHand) {
           if (card.getSuit().equals(luckyCard.SUITS[suit]) &&
                   card.getValue() == luckyCard.getValue()) {
               System.out.println("You got it, the card is " + card.getValue()
                    + " of " + card.getValue());
           } else {
                System.out.println("Unfortenately, no matches");
           }
       }  
    }
    
}
