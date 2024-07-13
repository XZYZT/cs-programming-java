package cs.programming.java.CONDandLOOP.program;

/**
 * （程序1.3.9）可以用于计算任何给定正整数的素因子分解。
 * @author Administrator
 *
 */
public class Factors {
    public static void main(String[] args) {
        long n = 123;
        long a = n;
        for (long factor = 2; factor <= a; factor++) {
            while (a % factor == 0) {
                a /= factor;
                System.out.println(factor + " ");
            }
        }
        if (a > 1) System.out.print(a);
        System.out.println();
    }
}
