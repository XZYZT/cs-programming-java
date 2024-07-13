package cs.programming.java.CONDandLOOP.program;

import cs.lib.box.util.FormatPrint;

public class HomeWork {
    public static void main(String[] args) {
//        PrintLineNumbers.main(args);
//        fun1();
//        fun2();
//        fun3();
//        fun4();
        toBinary2(100);
        toBinary2(101);
        toBinary2(64);
    }
    
    /*
     * 1.3.6
     */
    /*
     * 1.2.25
     */
    
    
    /*
     * 1.3.22
     * 从右往左
     */
    public static void toBinary2(int n) {
        String s = "";
        fp.reloadAndPrintTitles("i,s");
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
            fp.loadOneLineData(new Object[] {i, s});
            fp.printOneLineData();
        }
    }
    
    /*
     * 1.3.22
     * 从左往右 
     */
    private static FormatPrint fp = new FormatPrint("power,n,n<power,s");
    public static void toBinary(int n) {
        String s = "";
        int power = 1;
        while (power <= n/2) power *= 2;
        fp.printTitles();
        fp.loadOneLineData(new Object[] {power, n, n<power, s});
        fp.printOneLineData();
        while (power > 0) {
            if (n < power)  {s += 0;}
            else            {s += 1; n -= power;}
            power /= 2;
            fp.loadOneLineData(new Object[] {power, n, n<power, s});
            fp.printOneLineData();
        }
//        System.out.println(s);
    }
    
    
    /*
     * 1.3.7 
     */
    private static final int END = 10;
    private static void endPrint(int i, int j, String functionName) {
        if (i == END-1) {
            System.out.printf("****%s  END=%d result=", functionName, i);
            System.out.println(j);
        }
    }
    
    public static void fun1() {
        for (int i=0, j=0; i < END; i++) {
            j+=i;
            endPrint(i, j, "fun1");
        }
    }
    
    public static void fun2() {
        for (int i=0, j=1; i<END; i++) {
            j+=i;
            endPrint(i, j, "fun2");
        }
    }
    
    public static void fun3() {
        int i = 0;
        for (int j=0; j<END; j++,i++) {
            j+=j;
            System.out.println(j + "  " + i);
            endPrint(i-1, j, "fun3");
        }
    }
    
    public static void fun4() {
        for (int i=0, j=0; i<END; i++) {
            j+=j++;
            endPrint(i, j, "fun4");
        }
    }
}
