package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner; //Definitely required for the user input process.
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifiedBy Dan Rios 991560038
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      //TODO: Variable Declarations for the storage of the 7 guessing cards.
      Card[] magicHand = new Card[7];
      Scanner input = new Scanner(System.in);

      //TODO: Store the random values and card suits of the 7 cards.
      for (int i = 0; i < magicHand.length; i++) {
         int randomValue = ((int) (Math.random() * 13) + 1);
         int randomSuitNum = ((int) (Math.random() * 4));

         Card cards = new Card();
         cards.setValue(randomValue);
         cards.setSuit(cards.SUITS[randomSuitNum]);
         magicHand[i] = cards;
      }

      //TODO: Make a user input for the user to enter their card (their values and
      //their card suit).
      System.out.print("Enter a value between 1 - 13: ");
      int cardValue = input.nextInt();

      System.out.print("Enter a suit of cards (Hearts, Diamonds, "
          + "Spades, Clubs): ");
      String userSuit = input.next();



      //TODO: Determine the guessing cards that match the user’s card.
      int equalCards = 0;
      for (int i = 0; i < magicHand.length; i++) {

         if (cardValue == magicHand[i].getValue()
             && userSuit.equalsIgnoreCase(magicHand[i].getSuit())) {


            equalCards++;
         }
      }

      //TODO: Determine if the player wins or looses.
      if (equalCards > 0) {
         System.out.println("Out of 7 random cards, we found " + equalCards
             + " card(s) that matches your card, So Congrats, you won!");
      }
      else {
         System.out.println("Out of 7 random cards, neither of the cards"
             + " matches your card. Unfortunately you lost...");
      }
   }

}
