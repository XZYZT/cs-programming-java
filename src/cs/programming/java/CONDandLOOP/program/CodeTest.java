package cs.programming.java.CONDandLOOP.program;

/**
 * 1.3.13　执行以下代码后，m和n的值是多少？
 * @author Administrator
 *
 */
public class CodeTest {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        System.out.println("n       m");
        System.out.println(n + " " + m);
        while (n!=0) {
            m = (10 * m) + (n % 10);
            n /= 10;
        }
        System.out.println(n + " " + m);
    }
    
    public static void digitReverser(int n, int m) {
        while (n!=0) {
            m = (10 * m) + (n % 10);
            n /= 10;
        }
    }
}
