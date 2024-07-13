package cs.programming.java.CONDandLOOP.practice;


/**
 * 1.3.31写一个 RelativelyPrime 程序，接收一个整数命令行参数 n，并打印一个 
 * n-by-n 的表格，如果 i 和 j 的 gcd 为 1（i 和 j 是相对素数），则在第 i 
 * 行和第 j 列有一个 *，否则在该位置有一个空格。
 * @author Administrator
 *
 */
public class RelativelyPrime1_3_31 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % i == 0 || i % j == 0) System.out.print("* ");
                else            System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
