package cs.programming.java.basiconcept.practice;


/**
 * 1.2.30 均匀随机数。编写一个程序，打印五个介于 0 和 1 之间的均匀随机数、
 * 其平均值、最小值和最大值。使用 Math.random()、Math.min() 和 Math.max()。
 * @author Administrator
 * 
 */
public class AverageRandom {
    public static void main(String[] args) {
        stats();
    }

    private static void stats() {
        int n = 5;
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();
        
        System.out.printf("%.5f %.5f %.5f %.5f %.5f \n", x1, x2, x3, x4, x5);
        
        double sum      = x1 + x2 + x3 + x4 + x5;
        double average  = sum / n;
        double max      = Math.max(x5, Math.max(x4, Math.max(x3, Math.max(x2, x1))));
        double min      = Math.min(x5, Math.min(x4, Math.min(x3, Math.min(x2, x1))));
        
        String res = String.format("average = %.5f\n"
                                 + "max     = %.5f\n"
                                 + "min     = %.5f\n", average, max, min);
        System.out.println(res);
    }
    
    @SuppressWarnings("unused")
    private static void test() {
        int n      = 5;
        double sum = 0.0;
        double max = 0.0;
        double min = 1.0;
        for (int i = 0; i < n; i++) {
            double f    = Math.random();   // greaterthan or equal to 0.0 and less than 1.0.
            max         = Math.max(max, f);
            min         = Math.min(min, f);
            sum         += f;
        }
        String res = String.format("average = %.5f\n"
                                 + "max     = %.5f\n"
                                 + "min     = %.5f\n", sum/n, max, min);
        System.out.println(res);
    }
}
