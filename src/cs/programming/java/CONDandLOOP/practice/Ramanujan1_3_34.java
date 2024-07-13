package cs.programming.java.CONDandLOOP.practice;

/**
 * 1.3.34 拉马努扬的出租车Srinivasa Ramanujan 是印度数学家，因其对数字的直觉而闻名。
 * 有一天，英国数学家哈代（G. H. Hardy）来拜访他，哈代说他出租车的车牌号是 1729，这是一个
 * 相当沉闷的数字。拉马努扬回答说："不，哈代！这是一个非常有趣的数字。它是可以用两种不同方式表示
 * 为两个立方之和的最小数字。为了验证这一说法，请编写一个程序，接受一个整数命令行参数 n，并打印
 * 出所有小于或等于 n 的整数，这些整数可以用两种不同的方式表示为两个立方之和。换句话说，找出不
 * 同的正整数 a、b、c 和 d，使得 a^3 + b^3 = c^3 + d^3。使用四个嵌套 for 循环。
 * @author Administrator
 *
 */
public class Ramanujan1_3_34 {
    public static void main(String[] args) {
        myAnswer(10000);
        myAnswer(1729);
    }
    
    private static void myAnswer(int n) {
        for (int a = 1; a <= n; a++) {
            int a3 = a*a*a;
            if (a3 > n) break;
            
            for (int b = 1; b <= n; b++) {
                int b3 = b*b*b;
                int front = a3 + b3;
                if (front > n) break;
                
                for (int c = a+1; c <= n; c++) {    // 从 a+1 算起，避免打印重复项
                    int c3 = c*c*c;
                    if (c3 > front) break;
                    
                    for (int d = c; d <= n; d++) {
                        int d3 = d*d*d;
                        int behind = c3 + d3;
                        if (behind > front) break;
                        
                        if (behind == front) {
                            System.out.print(behind + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
    
    private static void std(int n) {
        for (int a = 1; a <= n; a++) {
            int a3 = a*a*a;
            if (a3 > n) break;

            // start at a to avoid print out duplicate
            for (int b = a; b <= n; b++) {
                int b3 = b*b*b;
                if (a3 + b3 > n) break;

                // start at a + 1 to avoid printing out duplicates
                for (int c = a + 1; c <= n; c++) {
                    int c3 = c*c*c;
                    if (c3 > a3 + b3) break;

                    // start at c to avoid printing out duplicates
                    for (int d = c; d <= n; d++) {
                        int d3 = d*d*d;
                        if (c3 + d3 > a3 + b3) break;

                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
