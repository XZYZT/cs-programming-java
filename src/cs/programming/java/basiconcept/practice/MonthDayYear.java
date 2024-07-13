package cs.programming.java.basiconcept.practice;

import static cs.programming.java.GetArguments.*;
import static cs.programming.java.Transform.*;

/**
 * 1.2.29　星期几。编写程序，将日期作为输入，并输出当天是星期几。你的程序应该假设三个
 * int命令行参数：m（月）、d（日）和y（年）。对于m，1代表一月，2代表二月，以此类推。
 * 对于输出，0为星期天，1为星期一，2为星期二，以此类推。你可以使用以下公式：
 * y0=y–(14-m)/12
 * x=y0+y0/4-y0/100+y0/400
 * m0=m+12×((14-m)/12)-2
 * d0=(d+x+(31×m0)/12)%7
 * 例：2000年2月14日是星期几？
 * y0=2000-1=1999
 * x=1999+1999/4-1999/100+1999/400=2483
 * m0=2+12×1=2=12
 * d0=(14+2483+(31×12)/12)%7=2500%7=1
 * 答：星期一。
 * @author Administrator
 * 
 */
public class MonthDayYear {
    public static void main(String[] args) {
        int m   = transmitInteger(args, 0);
        int d   = transmitInteger(args, 1);
        int y   = transmitInteger(args, 2);
        
        int y0  = y - (14 - m) / 12;
        int x   = y0+y0/4-y0/100+y0/400;
        int m0  = m+12*((14-m)/12) - 2;
        int d0  = (d+x+(31*m0)/12)%7;
        
        String d2w = dayToWeek(d0);
        
        String res = String.format("%d年%d月%d日是星期几? \n回答:%s", y, m, d, d2w);
        System.out.println(res);
    }
    
    
    
    
    public static void test() {
        int i = Integer.MIN_VALUE;
        System.out.println("i = " + i);
        System.out.println("abs(" + i + ") = " + Math.abs(i));
        System.out.println(i + " = b" + Integer.toBinaryString(i));
        int ii = 1;
        System.out.println(ii + " = b" + Integer.toBinaryString(ii));
        System.out.println(-ii + " = b" + Integer.toBinaryString(-ii));
    }
}
