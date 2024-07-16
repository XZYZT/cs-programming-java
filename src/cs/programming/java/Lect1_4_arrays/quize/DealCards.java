package cs.programming.java.Lect1_4_arrays.quize;

/**
 * 处理卡牌，进行卡牌操作
 * 操作：
 *      洗牌
 *      随机发牌
 * @author Administrator
 *
 */
public class DealCards extends DrawCards {
    public void printRandomDeck(int N) {
        for (int i = 0; i < N; i++) {
            int r = (int) (Math.random() * 52);
            System.out.print(deck[r] + " ");
        }
    }
    
    public void shuffleDeck() {
        for (int i = 0; i < 52; i++) {
            int r = (int) (Math.random() * (52 - i));
            swapDeck(i, r);
        }
    }
    
    private void swapDeck(int i, int r) {
        String temp  = this.deck[i];
        this.deck[i] = this.deck[r];
        this.deck[r] = temp;
    }
}
