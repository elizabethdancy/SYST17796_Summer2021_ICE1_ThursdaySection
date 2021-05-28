package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Ryan Gilchrist - 991633382
 */
public class CardTrick
{
   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         //Setting the MagicHand's card values and suits
         Random num = new Random();
         int number = num.nextInt(13);
         int cardNum = number + 1;
         c.setValue(cardNum);
         int suitNum = num.nextInt(4);
         c.setSuit(Card.SUITS[suitNum]);
         magicHand[i] = c;
      }
      //Setting the card value and suit for Lucky Card
      Card luckyCard = new Card();
      luckyCard.setValue(5);
      luckyCard.setSuit("Hearts");

      //Searching MagicHand for the Lucky Card
      boolean match = false;
      for (int i = 0; i < magicHand.length; i++) {
         if (luckyCard.getValue() == magicHand[i].getValue()
             && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())) {
            match = true;
         }
      }
      //Reporting whether user chose a card that was in the MagicHand
      if (match) {
         System.out.println("Congrats! Your card is in the Magic Hand!");
      }
      else {
         System.out.println("Sorry, your card is not in the Magic Hand.");
      }
   }
}
