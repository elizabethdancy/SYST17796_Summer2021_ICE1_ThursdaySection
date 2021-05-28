package ca.sheridancollege.week2.softwarefundamentals.ice1;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Chris Jagernath - 991635121
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random rand = new Random();
         int n = rand.nextInt(13);
         int s = rand.nextInt(3);
         c.setValue(n);
         c.setSuit(Card.SUITS[s]);
         c = magicHand;
         Random x = new Random();
      }
      Scanner input = new Scanner(System.In);
      System.out.println("Pick a card ..any card");

      Card u = new Card();
      u.setValue(input.nextInt());
      u.setSuit(input.next()); //insert code to ask the user for Card value and suit, create their card

      for (int i = 0; i < magicHand.length; i++) {
         if (Card[i].getValue == u.getValue && Card[i].getSuit == u.getSuit) {
            System.out.println("Your card is in the magic hand!!!");
         }
         else {
            System.out.println("Your card is not in the magic hand.");
         }
      }
   }
}
