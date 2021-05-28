package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modified Yujin Eun 9916533765
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {

         Card c = new Card();
         c.setValue((int) (Math.random() * 13) + 1);
         //c.setValue(insert call to random number generator here)
         c.setSuit(Card.SUITS[(int) Math.random() * 4]);
         //c.setSuit(Card.SUITS[insert call to random numberbetween 0- 3 here])

         magicHand[i] = c;
         //assign c to magichHand[i] here
      }

      Scanner in = new Scanner(System.in);
      Card user = new Card();
      System.out.println("What is the Card number?");
      user.setValue(in.nextInt()); //insert code to ask the user for Card valueand suit, create their card

      System.out.println(" Select a suit number betweem 0 to 3");
      user.setSuit(Card.SUITS[in.nextInt()]);

      boolean guessMagicHand = false;
      for (int i = 0; i < magicHand.length; i++) { // and search magicHandhere
         if (magicHand[i].getValue() == user.getValue() && magicHand[i].getSuit().equals(user.getSuit())) {
            guessMagicHand = true;
         }

         if (guessMagicHand) {
            System.out.println("You got it . your card number is " + user.getValue() + user.getSuit());//Then report the result here
         }
         else {
            System.out.println("Sorry.Your number" + user.getValue() + user.getSuit() + "is Wrong");
         }

      }
   }
}
//follow the remainder of the instructions in the ICE 1 doc
