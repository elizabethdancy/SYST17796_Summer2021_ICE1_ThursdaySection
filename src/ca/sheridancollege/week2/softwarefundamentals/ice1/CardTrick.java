
package ca.sheridancollege.week2.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy Shokopogo or Quin 991632608
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            
            System.out.println(c.getValue() + " : " + c.getSuit());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //assign c to magichHand[i] here
        }
        
        Card luckyCard = new Card();
        
        luckyCard.setValue(1);
        luckyCard.setSuit(Card.SUITS[0]);
        
        boolean isCardInMagicHand = false;
        
        for(Card c : magicHand){
            if(c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())){
                isCardInMagicHand = true;
            }
        }
        
        if(isCardInMagicHand){
            System.out.println("Winner");
        }else{
            System.out.println("Loser");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //follow the remainder of the instructions in the ICE 1 doc
    }
    
}
