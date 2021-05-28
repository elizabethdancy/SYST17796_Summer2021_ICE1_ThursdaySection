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
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         Random ra = new Random();
         int numCard = ra.nextInt(13) + 1;
         c.setValue(numCard);

         int numSuit = ra.nextInt(4);
         c.setSuit(Card.SUITS[numSuit]);

         System.out.println(c.getValue() + " of: " + c.getSuit());
         //magicHand[i] = 
         //assign c to magichHand[i] here
      }

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
      //follow the remainder of the instructions in the ICE 1 doc
   }

}
