
package ca.sheridancollege.week2.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card luckyCard = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //assign c to magichHand[i] here
        }
        
          if(card.getSuit().equales(luckyCard.Card.SUITS[suitNum])&& card.getValue()== luckyCard.getValue;)){
      System.out.println("you won!");
    }else{
            System.out.println("game over");
    }
    
}
