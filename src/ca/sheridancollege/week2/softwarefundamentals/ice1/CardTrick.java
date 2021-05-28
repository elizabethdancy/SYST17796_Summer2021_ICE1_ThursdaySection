
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified tehrazeh
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(((int)Math.random()*13 +1));
            c.setSuit(Card.SUITS[(int)Math.random() * 4]);
            c = magicHand[i];
        }
        
        Card luckyCard = new Card();
        c.setValue(12);
        c.setSuit(Card.SUITS[2])
        
        for (Card сard: magicHand) {
           if (сard.getSuit().equals(Card.SUITS[2]) &&
                   сard.getValue() == 12) {
               System.out.println("You got it, the card is " + userValue
                    + " of " + userSuit);
           } else {
                System.out.println("Unfortenately, no matches");
           }
       }  
    }
    
}
