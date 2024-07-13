package cs.programming.java.CONDandLOOP.practice;

import org.junit.jupiter.api.Test;

/**
 * 1.3.36 计算素数。编写一个 PrimeCounter 程序，接受一个整数命令行参数 
 * n，找出小于或等于 n 的素数。注意：稍有不慎，程序可能无法在合理的时间内完成！
 * @author Administrator
 *
 */
public class PrimeCounter1_3_36 {
    public static void main(String[] args) {
        int n = 2000;
        myAns(n);
//        printPrimes(n);
    }
    
    @Test
    private static void quotientAndRemainder() {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " / " + j + " = ");
                System.out.println(i / j);
                System.out.print(i + " % " + j + " = ");
                System.out.println(i % j);
            }
        }
    }
    
    private static void myAns(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i == j) {
                        boolean isPrime = isPrime(i);
                        if (!isPrime) {
                            System.out.println(i + "is not prime ");
                        } else {
                            System.out.print(i + ", ");
                        }
                    }
                    break;
                }
            }
        }
    }
    
    static boolean isPrime(int check) {
        if (check % 2 == 0) return false;
        for (int i = 3; i*i < check; i += 2) {
            if (check % i == 0) return false;
        }
        return true;
    }
    
    private static void printPrimes(int num) {
        for(int i = 1; i <= num; i++) {
            if(isPrime(i)) System.out.println(i);
        }
    }
}
