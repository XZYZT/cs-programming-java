package cs.programming.java.CONDandLOOP.loops;

/* *****************************************************************************
 *  Name:              Sha Quan
 *  Coursera User ID:  123456
 *  Last modified:     07/13/2024
 **************************************************************************** */
 public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        
        // Math.abs(x) < r && Math.abs(y) < r
        while ((Math.abs(x) + Math.abs(y)) < r) {
            System.out.println("(" + x + ", " + y + ")");
            double p = Math.random();
            if      (p <= 0.25) x++;
            else if (p <= 0.50) x--;
            else if (p <= 0.75) y++;
            else if (p <= 1.00) y--;
            steps++;
        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + steps);
    }
}
