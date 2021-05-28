package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
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

      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to the Magic Hand!");
      System.out.println("Please pick a card!");

      //Taking user input for their Card value and suit
      System.out.println("Enter your card value.");
      int userNum = input.nextInt();
      while (userNum < 1 || userNum > 13) {
         System.out.println("Error: Enter a valid card value!");
         System.out.println("Enter your card value again.");
         userNum = input.nextInt();
      }
      input.nextLine();
      System.out.println("Enter the suit of your card.");
      String userSuit = input.nextLine();
      while (!userSuit.equalsIgnoreCase("Clubs") && !userSuit.equalsIgnoreCase("Hearts")
          && !userSuit.equalsIgnoreCase("Spades") && !userSuit.equalsIgnoreCase("Diamonds")) {
         System.out.println("Error: Enter a valid suit!");
         System.out.println("Enter the suit of your card again.");
         userSuit = input.nextLine();
      }

      // Searching MagicHand for the user's chosen card
      boolean match = false;
      for (int i = 0; i < magicHand.length; i++) {
         if (userNum == magicHand[i].getValue()
             && userSuit.equalsIgnoreCase(magicHand[i].getSuit())) {
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
