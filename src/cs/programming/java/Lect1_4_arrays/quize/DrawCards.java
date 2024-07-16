package cs.programming.java.Lect1_4_arrays.quize;

/**
 * 绘制52张扑克牌，并能全部打印出来
 * 
 * @author Administrator
 *
 */
public class DrawCards {
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    String[] suit = { "♣", "♦", "♥", "♠" };
    String[] deck = new String[52];
    // put all the cards in the deck.
    private void putCardsInDeck() { 
        for (int j = 0; j < 4; j++) 
            for (int i = 0; i < 13; i++)
                deck[i + 13 * j] = rank[i] + suit[j];
    }
    
    public DrawCards() {
        putCardsInDeck();
    }
    
    public void printAllDecks () {
        for (int i = 0; i < 52; i++) {
            System.out.print(deck[i] + " ");
            if (i % 7 == 6) 
                System.out.println(); 
        }
    }
    
    public static void main(String[] args) {
        DealCards card = new DealCards();
        card.shuffleDeck();
        card.printAllDecks();
    }
}
