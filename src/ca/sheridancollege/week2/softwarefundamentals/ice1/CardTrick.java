
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier MihyeBang  991617334
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1); 
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]); 
            magicHand[i] = c;
        }
        
        Card userCard1 = new Card();
        Scanner in = new Scanner(System.in);
        System.out.println("Please pick a card value:");
        userCard1.setValue(in.nextInt());
        System.out.println("Please pick a card suit number (random number between 0 and 3):");
        userCard1.setSuit(Card.SUITS[in.nextInt()]);
        
        Boolean isInMagicHand = false;
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue() == userCard1.getValue() && magicHand[i].getSuit().equals(userCard1.getSuit())){
                isInMagicHand = true;
            }
        }
        
        if(isInMagicHand) {
            System.out.println("You Won! Your card is in the magic hand.");
        } else {
            System.out.println("You Lost. Your card is not in the magic hand.");
        }
        

    }
    
}
