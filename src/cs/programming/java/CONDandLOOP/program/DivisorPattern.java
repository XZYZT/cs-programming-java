package cs.programming.java.CONDandLOOP.program;

/**
 * 程序1.3.4  你的第一个嵌套循环程序
 * n|行和列的数目
 * i|行的索引值
 * j|列的索引值
 * @author Administrator
 * 
 */
public class DivisorPattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % j == 0) || (j % i == 0)) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
