package cs.programming.java.Lect1_4_arrays.quize;

public class Coupon {
    public static void main(String[] args) {
        int M           = 10;
        int cards       = 0;
        int distinct    = 0;
        
        boolean[] found = new boolean[M]; 
        while (distinct < M) {
            int r = (int) (Math.random() * M);
            cards++;
            if (!found[r]) {
                distinct++;
                found[r] = true;
            }
        } 
    }
}
