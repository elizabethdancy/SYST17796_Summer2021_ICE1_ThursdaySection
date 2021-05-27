
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * 
 * @modifier Juyoung Jung
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        // This for loop will create 7 Card object
        for (int i = 0; i < magicHand.length; i++) {
            
            // Create Card object c
            Card c = new Card();
            
            // Assign a value (1~13), suit (clubs, hearts, spades or diamonds)
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            // Assign c to magichHand[i]
            magicHand[i] = c;
        }

        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Create user's Card object
        Card userCard = new Card();
        
        // Ask the user to pick a card and assign it to userCard
        System.out.print("Enter a random number (1 ~ 13) : ");
        int num = input.nextInt();
        System.out.println("Choose a suit: ");
        System.out.println("  1)Heart \n  2)Diamond \n  3)Spade \n  4)Club");
        System.out.print("Enter a suit number (1 ~ 4) : ");
        int suit = input.nextInt();

        userCard.setValue(num);
        userCard.setSuit(Card.SUITS[suit - 1]);
        
        char isGuessed = 'N';
                
        // Search magicHand array if there's matching card with the user's card
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue()
                    && magicHand[i].getSuit().equals(userCard.getSuit())) {
                    isGuessed = 'Y';
                    break;
            }
        }
        
        // Print the result
        if (isGuessed == 'Y') {
            System.out.println("You got it!");
        } else {
            System.out.println("You guessed wrong!");
        }
    
    
        // Display the 7 random cards
        System.out.println("\nThese are the 7 cards.");
        
        for (Card magic: magicHand) {
            System.out.println(magic.getValue() + " of " + magic.getSuit());
        }
    }   
}
