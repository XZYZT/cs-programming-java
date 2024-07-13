package cs.programming.java.basiconcept.practice;

import static cs.programming.java.GetArguments.*;
/**
 * 1.2.26　极坐标。编写程序将笛卡儿坐标转换为极坐标。你的程序应该假设
 * 两个double型命令行参数x和y，并输出极坐标r和θ。使用Math.atan2
 * （y，x）方法计算y/x的反正切值，其值在-π到π的范围内。
 * 
 * @author Administrator 
 * 
 */
public class PolarCoordinates {
    public static void main(String[] args) {
        double x        = transmitDouble(args, 0);
        double y        = transmitDouble(args, 1);
        double r        = Math.sqrt(x*x + y*y);
        double theta    = Math.atan2(y, x);
        
        System.out.println("r       = " + r);
        System.out.println("theta   = " + theta);
        cartesianToPolar(100, 0);
        cartesianToPolar(100, 100);
        cartesianToPolar(0, 100);
        cartesianToPolar(-100, 0);
        cartesianToPolar(-100, 10);
    }
    
    public static void cartesianToPolar(double x, double y) {
        double r        = Math.sqrt(x*x + y*y);
        double theta    = Math.atan2(y, x);
        System.out.println("r       = " + r);
        System.out.println("theta   = " + theta);
    }
}
