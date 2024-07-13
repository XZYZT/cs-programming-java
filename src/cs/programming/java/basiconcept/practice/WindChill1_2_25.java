package cs.programming.java.basiconcept.practice;

import static cs.programming.java.GetArguments.*;
/**
 * 1.2.25　风寒指数。国家气象部门对风寒指数的定义如下式，其中T为温度（华氏度），
 * v为风速（英里[3]每小时）。
 * 
 * w=35.74+0.6215 T+(0.4275 T-35.75)v0.16
 * 
 * 写一个程序，输入两个double型命令行参数，分别表示温度和速度，计算风寒指数。
 * 使用Math.pow(a，b)来计算ab。注意：如果T的绝对值大于50，或者v大于120
 * 或者小于3公式是无效的，为了简单起见，可以假设你得到的输入值一定是在这个范围内的。
 * 
 * @author Administrator
 *
 */
public class WindChill1_2_25 {
    public static void main(String[] args) {
        double T = transmitDouble(args, 0);
        double v = transmitDouble(args, 1);
        checkDouble(T, -50, 50);
        checkDouble(v, 30, 120);
//        double w = 35.74 + 0.6215*T + (0.4275*T - 35.75) * Math.pow(v, 0.16);
        double w = 35.74 + 0.6215*T + (0.4275*T - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + T);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }
}
