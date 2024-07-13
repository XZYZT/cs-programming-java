package cs.programming.java.basiconcept.practice;

import static cs.programming.java.MathU.*;
/**
 * 1.2.27　高斯随机数。编写一个程序RandomGaussian，用于
 * 显示一个服从高斯分布的随机数r。实现这一功能的一种有效方法是使用
 * Box-Muller公式：
 * 
 * r=sin(2πv)(-2 ln u)1/2
 * 
 * 其中u和v是由Math.random()方法随机生成的0到1之间的实数。
 * 
 * @author Administrator
 *
 */
public class RandomGaussian {
    public static void main(String[] args) {
        double u = random();
        double v = random();
        double r = Math.sin(2*Pi*v) * pow((-2 * ln(u)), 1/2);
        
        System.out.println(r);
    }
}
