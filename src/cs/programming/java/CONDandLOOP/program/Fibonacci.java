package cs.programming.java.CONDandLOOP.program;

/**
 * 1.3.14　运行以下代码，将会打印出什么样的信息？
 * 
 * @author Administrator
 *
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;
        int f = 0, g = 1;
        
        for (int i = 1; i <= n; i++) {
            f = f + g;
            g = f - g;
            System.out.println(f);
        }
    }
}
