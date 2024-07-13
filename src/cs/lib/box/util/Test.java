package cs.lib.box.util;


public class Test {
    public static void main(String[] args) {
        int n = 1234567;
        int m = 0;
//        reverseMN(n, m);
//        test1(10); 
        
        
        int         P = 10000;  
        double      r = 0.25;   
        int         t = 12;      
        compoundInterestY(P, r, 1);
        compoundInterestM(P, r, t);
        
    }
    
    /*
     * 1.3.13
     */
    private static void reverseMN(int n, int m) {
        System.out.println("ordinary n=" + n + ", m=" + m);
        while(n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println("compute  n=" + n + ", m=" + m);
    }
    
    /**
     * 1.3.14
     * n >= 1
     * @param n
     */
    private static void test1(int n) {
        int f = 0, g = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "-" + f);
            f = f + g;
            g = f - g;
        }
    }
    
    /**
     * 
     * @param P 本金
     * @param r 年利率
     * @param t 存款年限
     */
    private static void compoundInterestY(int P, double r, int t) {
        double e    = Math.E;  
        double res  = P * Math.pow(e, r*t); 
        System.out.println(res); 
    }
    
    static FormatPrint fp = new FormatPrint("month,amount");
    
    private static void compoundInterestM(int P, double r, int t) {
        double e    = Math.E;
        r           = r / 12;
        fp.printTitles();
        for (int i = 1; i <= t; i++) {
            double monthlyBalance = P * Math.pow(e, r*i);   // 每月余额
//            System.out.println("month" + i + "=" + res);
            fp.loadOneLineData(new Object[]{i, String.format("%.2f", monthlyBalance)});
            fp.printOneLineData();
        }
    }
}
