package cs.programming.java.basiconcept.practice;

import static cs.programming.java.GetArguments.*;
/**
 * 1.2.28　顺序检测。编写一个程序，该程序需要输入三个double型的命令行参数x、y和z，
 * 如果值严格上升或下降（x<y<z或x>y>z），则输出true，否则输出false。
 * 
 * @author Administrator
 *
 */
public class SequentialDetection {
    public static void main(String[] args) {
        double x        = transmitDouble(args, 0);
        double y        = transmitDouble(args, 1);
        double z        = transmitDouble(args, 2);
        boolean check   = threeCheck(x, y, z);
        System.out.println(check);
        
        assert threeCheck(1, 2, 3) == true : "由小到大检测失败";    // true
        assert threeCheck(2, 1, 3) == false;    // 
        assert threeCheck(3, 2, 1) == true : "由大到小检测失败";
        assert threeCheck(2, 3, 1) == false;
//        threeCheck(1, 2, 3);
//        threeCheck(2, 1, 3);
//        threeCheck(3, 2, 1);
//        threeCheck(2, 3, 1);
        
    }
    
    public static boolean threeCheck(double x, double y, double z) {
        boolean b;
        b = (x < y && y < z) || (x > y && y > z);
//        System.out.println(b);
        return b;
    }
}
