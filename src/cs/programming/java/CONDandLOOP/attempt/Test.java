package cs.programming.java.CONDandLOOP.attempt;

/**
 * https://www.coursera.org/learn/cs-programming-java/exam/kISlE/conditionals-and-loops/attempt
 * 
 * @author Administrator
 *
 */
public class Test {
    public static void main(String[] args) { 
        question5();
    }
    
    /*
     * 1.下面的程序打印什么？
     */
    private static void question1() {
        int a = 2;
        int b = 3;
        int c = 4;
        if (a < b) {
            if (b < c) {
                if (c < a) System.out.println(a + " " + b + " " + c);
                else System.out.println(c + " " + b + " " + a);
            } else System.out.println(a + " " + c + " " + b);
        } else System.out.println(b + " " + a + " " + c);
    }
    
    /*
     * 2.第 2 个问题
     * 以下哪项会导致编译时错误？请标出所有适用选项。
     */
    private static void question2() {
        int a = 2;
        int b = 3;
        int c = 4;
//        if (a > b) c = 0 else b = 0;
//        if (a > b) c = 0;
//        if a > b { c = 0; }
//        if a > b { c = 0; }
//        if (a > b) { c = 0; }
//        if a > b, then c = 0;
//        if (a > b) ( c = 0; )
    }
    
    private static void question3() {
        
    }
    
    private static void question4() {
        int n = 123456789;
        int m = 0;
        while (n != 0) {
           m = (10 * m) + (n % 10);
           n = n / 10;
        }
        System.out.println(m);
    }
    
    private static void question5() {
        int i = 0, j = 0;
        for (i = 0, j = 0; i < 10; i++)
            j += i;
        System.out.println(j);
    }
}
