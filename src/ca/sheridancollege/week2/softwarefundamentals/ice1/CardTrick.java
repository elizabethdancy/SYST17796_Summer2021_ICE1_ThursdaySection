package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 *
 * @modifier Reem Abdulnoor
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            //assign c to magichHand[i] here
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
       /* Card userCard = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a card value from 1-13: ");
        userCard.setValue(input.nextInt());
          input.nextLine();
        System.out.println("Pick a suit: \"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\" ");

        userCard.setSuit(input.nextLine());*/
        
        //new changes
        Card luckyCard= new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit("Diamonds");
  
        // search magicHand here and display
       /* int youGotIt=1;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit())) {
                youGotIt++;
                System.out.println("congrats! you won ");
            }  else {
            System.out.println("Good luck for the next time! you lost ");
        }break;

        }*/
        
        // search magicHand here and display
        int youGotIt=1;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                youGotIt++;
                System.out.println("congrats! you won ");
            }  else {
            System.out.println("Good luck for the next time! you lost ");
        }break;

        }
       
        
    }
}
