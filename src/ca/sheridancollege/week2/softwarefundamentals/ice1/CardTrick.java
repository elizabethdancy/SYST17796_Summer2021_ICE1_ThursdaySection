package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ochereti
 * studID: 991601490
 */
public class CardTrick {
    private static int RandomGenerator(int min, int max){
        return (int)Math.floor(Math.random()*(max-min+1)+min); 
    }
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        boolean show = false;
        // press F and it WILL NOT SHOW YOU CARDS. Press T and it WILL show you the generated cards
        System.out.println("Are you here for fun or are you testing this app? F/T");
        if(sc.next().toLowerCase().equals("t")){
            show = true;
        }
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(RandomGenerator(1, 14));
            c.setSuit(Card.SUITS[RandomGenerator(0, 3)]);
            //assign c to magichHand[i] here
            magicHand[i] = c;
            if(show == true){
                System.out.println(c.getValue() + " " + c.getSuit() + " ");
            }
        }
        //insert code to ask the user for Card value and suit, create their card
        Card userCard = new Card();
        /*System.out.println("Choose the card value 1 - 13");
        userCard.setValue(sc.nextInt());
        System.out.println("Choose the card suit 0-3");
        userCard.setSuit(Card.SUITS[sc.nextInt()]);*/
        userCard.setValue(13);
        userCard.setSuit(Card.SUITS[1]);
        // and search magicHand here
        //Then report the result here
        boolean guessed = false;
        for(Card c : magicHand){
                System.out.print(c.getValue() + " " + c.getSuit() + " - ");
            if(userCard.getValue() == c.getValue() &&
                    userCard.getSuit().equals(c.getSuit())){
                guessed = true;
                
            }
        }
        if(guessed == true{
            System.out.println("YOU ARE RIGHT THIS CARD"
                        + " IS IN THE MAGIC HAND, CONGRATS!!!!");
        }
    }
}
