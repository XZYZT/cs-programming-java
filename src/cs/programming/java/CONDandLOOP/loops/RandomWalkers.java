package cs.programming.java.CONDandLOOP.loops;

/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     07/13/2024
 **************************************************************************** */
public class RandomWalkers {
    public static void main(String[] args) {
        int r           = Integer.parseInt(args[0]);
        int trials      = Integer.parseInt(args[1]);
        int sum         = 0;
        for (int i = 0; i < trials; i++) {
            int x       = 0;
            int y       = 0;
            int steps   = 0;
            // Math.abs(x) < r && Math.abs(y) < r
            while ((Math.abs(x) + Math.abs(y)) < r) {
                double p = Math.random();
                if      (p > 0.75) x++;
                else if (p > 0.50) x--;
                else if (p > 0.25) y++;
                else if (p > 0.00) y--;
                steps++;
            }
            sum += steps;
        }
        double average = (double)sum/trials;
        System.out.println("average number of steps = " + average);
    }
}
