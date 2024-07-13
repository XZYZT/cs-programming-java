package cs.programming.java.CONDandLOOP.program;

/**
 * 
 * @author Administrator
 * 
 */
public class PrintLineNumbers {
    public static void main(String[] args) {
        myFivePerLine();
    }
    
    
    
    /*
     * 1.3.9　编写一个程序，使用一个for循环和一个if语句，打印1000到2000
     * 之间的整数，每行5个数字。提示：使用%操作。
     */
    public static void myFivePerLine() {
        int START = 1000;
        int END   = 2000;
        int PER_LINE = 5;
        for (int i = START; i <= END; i++) {
            System.out.printf("%5d ", i);
            if (i % PER_LINE == 4) {
                System.out.println();
            }
            
//            System.out.printf("%5d ", i);
//            if (PER_LINE <= i%PER_LINE) {
//                System.out.println();
//            }
        }
        System.out.println();
    }
    
    /*
     * 标准答案
     */
    public static void fivePerLine () {
        int START = 1000;
        int END   = 2000;
        int PER_LINE = 5;
        for (int i = START; i <= END; i++) {
            System.out.print(i + " ");
            if ((i + 1) % PER_LINE == 0) System.out.println();
        }
        System.out.println();
    }
}


