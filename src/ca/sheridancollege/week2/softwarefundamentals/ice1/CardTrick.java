package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * modified by Nghi Vo 991639672
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick
{

   public static void main (String[] args)
   {
      Random rng = new Random();
      Scanner scanner = new Scanner(System.in);
      Card[] magicHand = new Card[7];
      for (int i = 0; i < magicHand.length; i++) {
         Card card = new Card();
         //c.setValue(insert call to random number generator)
         int a = rng.nextInt(13) + 1;
         card.setValue(a);
         //c.setSuit(Card.SUITS[insert call to random number between 0-3])
         int b = rng.nextInt(3);
         card.setSuit(Card.SUITS[b]);
         //assign c to magichHand[i] 
         magicHand[i] = card;
         System.out.println(card);
      }

      //insert code to ask the user for Card value and suit, create their card
      
      String suit = "Hearts";
     
      int value = 7;
// and search magicHand here

      for (int i = 0; i < magicHand.length; i++) {
         if (value == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit())) {
            System.out.println("Your lucky card was found in the magic hand.");
            return;
         }
      }
//Then report the result here
      System.out.println("Your lucky card was not found in the magic hand.");
//follow the remainder of the instructions in the ICE 1 doc
   }
}
