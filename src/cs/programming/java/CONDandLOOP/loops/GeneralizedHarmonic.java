package cs.programming.java.CONDandLOOP.loops;

/* *****************************************************************************
 *  Name:              Sha Quan
 *  Coursera User ID:  123456
 *  Last modified:     07/13/2024
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n       = Integer.parseInt(args[0]);
        int r       = Integer.parseInt(args[1]);
        double h    = 0;
        for (int i = 1; i <= n; i++) {
            double item = 1 / (Math.pow(i, r));
            h += item;
        }
        System.out.println(h);
    }
}
