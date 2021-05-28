package ca.sheridancollege.week2.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Ryan Gilchrist
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         //assign c to magichHand[i] here
         Random num = new Random();
         int number = num.nextInt(13);
         int cardNum = number + 1;
         c.setValue(cardNum);

         int suitNum = num.nextInt(4);
         c.setSuit(Card.SUITS[suitNum]);

         magicHand[i] = c; //??This correct??
         //System.out.println(c.getValue() + " of: " + c.getSuit()); //Dont think need to keep this line
      }

      //insert code to ask the user for Card value and suit, create their card
      Scanner input = new Scanner(System.in);
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

      // and search magicHand here
      //Then report the result here
      //follow the remainder of the instructions in the ICE 1 doc
      boolean matchNum = false;
      for (int i = 0; i < magicHand.length; i++) {
         if (userNum == magicHand[i].getValue()) {
            matchNum = true;
         }
      }
      boolean matchSuit = false;
      for (int i = 0; i < magicHand.length; i++) {
         if (userSuit.equalsIgnoreCase(magicHand[i].getSuit())) {
            matchSuit = true;
         }
      }
      if (matchNum == true && matchSuit == true) {
         System.out.println("Its a match!");
      }
      else {
         System.out.println("Its not a match.");
      }
   }
}
