
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random; // Package inclusion for Random class

import java.util.Scanner; // Package inclusion for Scanner class

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 * 
 * @author dancye
 * @modifiedBy Matthew Dorie
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        String[] hand = { "Placeholder 1", "Placeholder 2", "Placeholder 3", "Placeholder 4", "Placeholder 5",
                "Placeholder 6", "Placeholder 7" }; // array declaration
        
        String luckyCard = "5 of Diamonds"; // Lucky card declaration 

        for (int i = 0; i < magicHand.length; i++) {

            Random rn = new Random(); // random card number and suit selection
            int cardNum = rn.nextInt(14 - 0) + 1;
            int suitDecider = rn.nextInt(4 - 0) + 0;

            String[] suit = { "Hearts", "Diamonds", "Spades", "Clubs" };
            hand[i] = cardNum + " of " + suit[suitDecider]; // assign the cards to an array

            // System.out.println(hand[i]); // used to cheat and see what cards are given

        }

        Scanner inData = new Scanner(System.in);

        String userPick; // variable declaration

        System.out.print("Pick any card (Format: # of SUIT): ");
        userPick = inData.nextLine(); // gets user input
        for (int j = 0; j < 8;) {
            if (userPick.equalsIgnoreCase(hand[j])) { // scans array for card
                System.out.println("Your card is in your deck");
                break;
            } else if (j == 6) { // reached end of array so card isnt in deck
                System.out.println("Your card isn't in your deck");
                break;
            } else { // iterates array
                j++;
            }
        }
    }

}
