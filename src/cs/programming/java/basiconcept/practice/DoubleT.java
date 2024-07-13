package cs.programming.java.basiconcept.practice;

/**
 * 1.2.21　编写一个程序，命令行参数为double型变量t，输出sin（2t）+sin（3t）的值。
 * @author Administrator
 * 
 */
public class DoubleT {
    public static void main(String[] args) {
        double t    = Double.parseDouble(args[0]);
//        t = Math.toRadians(t);
        double res  = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println(res);
    }
}
