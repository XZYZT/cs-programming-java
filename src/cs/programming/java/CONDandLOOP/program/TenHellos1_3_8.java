package cs.programming.java.CONDandLOOP.program;

/**
 * 1.3.8　重写TenHellos来创建一个Hellos程序，该程序采用命令行参数来设置
 * 要打印的行数，你可以假设参数小于1000。提示：使用i%10和i%100来确定打印第
 * i个Hello应该使用st、nd、rd还是th。
 * 
 * @author Administrator
 * 
 */
public class TenHellos1_3_8 {
    public static void main(String[] args) {
//        System.out.println("1st Hello");
//        System.out.println("2nd Hello");
//        System.out.println("3rd Hello");
        int i   = 1;
        int end = 1000;
        while (i <= end) {
            int divisor     = i / 10;   // 除数
            int remainder   = i % 10;   // 余数
            int 除数          = divisor;
            int 余数          = remainder;
            String div = "";
            if (除数 != 0) {
                div = "" + divisor;
            }
            if (余数 == 1) {
                System.out.println(div + "1st Hello");
            } 
            
            if (余数 == 2) {
                System.out.println(div + "2nd Hello");
            }
            
            if (余数 == 3) {
                System.out.println(div + "3rd Hello");
            }
            
            if (余数 > 3 || 余数 == 0) System.out.println(i + "th Hello");
            i = i + 1;
        }
    }

    private static void print123(int divisor, int remainder) {
        String div = "";
        if (divisor != 0) {
            div = "" + divisor;
        }
        switch (remainder) {
        case 1: System.out.println(div + "1st Hello");
        case 2: System.out.println(div + "2nd Hello");
        case 3: System.out.println(div + "3rd Hello");
        }
    }
    
}
