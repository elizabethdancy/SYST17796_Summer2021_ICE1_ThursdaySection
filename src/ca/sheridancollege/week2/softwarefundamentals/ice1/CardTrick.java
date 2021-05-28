package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Jinyoung (Kayla) Jeon
 *
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card userChoice = new Card();
        userChoice.setValue(1);
        userChoice.setSuit(Card.SUITS[0]);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13));

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);

            //assign c to magichHand[i] here
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }

        //insert code to ask the user for Card value and suit to create their card
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Card value between 1-13: ");
        int userValue = input.nextInt();
        System.out.printf("Your choice is %d.\n", userValue);
        userChoice.setValue(userValue);

        input.nextLine(); // purge the newline out of the input buffer

        System.out.println("Enter Card suit (Clubs, Spades, Diamonds, Hearts): ");
        String userSuit = input.nextLine();
        System.out.printf("You choice is %s.\n", userSuit);
        userChoice.setSuit(userSuit);

        //search magicHand here
        boolean result = true;

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userChoice.getValue() 
            && userChoice.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                result = true;
            } else {
                result = false;
            }
        }

        // show the result to the user
        if (result) {
            System.out.println("You got it!");
        } else {
            System.out.println("Good attempt.");

        }

    }
}
