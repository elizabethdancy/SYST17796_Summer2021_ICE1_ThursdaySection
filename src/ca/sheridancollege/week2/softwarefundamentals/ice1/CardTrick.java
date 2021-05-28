package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);

      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         Random ra = new Random();
         int numCard = ra.nextInt(13) + 1;
         c.setValue(numCard);

         int numSuit = ra.nextInt(4);
         c.setSuit(Card.SUITS[numSuit]);

         //System.out.println(c.getValue() + " of: " + c.getSuit());
         magicHand[i] = c;
         //assign c to magichHand[i] here
      }



      System.out.print("Enter the name of Suit(Hearts, Diamonds, Spades, Clubs): ");
      String userSuit = input.nextLine();
      System.out.print("Enter the number of card(1 to 13): ");
      int userValue = input.nextInt();


      if (userSuit.equals("Clubs") || userSuit.equals("Diamonds") || userSuit.equals("Hearts") || userSuit.equals("Spades")) {
         if (userValue < 13 && userValue > 1) {
            System.out.println("\nYou entered: " + userValue + " of:  " + userSuit);
         }
         else {
            System.out.println("Enter valid value of card!");
         }
      }
      else {
         System.out.println("Enter valid Suit name!");
      }

      /* for ( ) {
       *
       * } */

      // and search magicHand here
      //Then report the result here
      //follow the remainder of the instructions in the ICE 1 doc
   }

}
