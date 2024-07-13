package cs.programming.java.CONDandLOOP.practice;

/**
 * 程序1.3.5，即用于计算谐波数——译者注）使用的就是这个模板，
 * 以计算有限个数字的和Hn=1+1/2+1/3+…+1/n。这些数字通常
 * 称为谐波数（harmonic number），在离散数学中会经常用到。
 * 谐波数是对数函数的离散模拟，也可以用于近似计算y=1/x曲线下的
 * 面积。你也可以使用程序1.3.5作为模板来计算其他有限个数字的和
 * （见练习1.3.18）。
 * 
 * @author Administrator
 *
 */
public class HarmonicNumber1_3_5 {
    public static void main(String[] args) {
        int n       = Integer.parseInt(args[0]);
        double sum  = 0.0;
        while (--n >= 1) {
            sum = sum + 1.0/n;
        }
        System.out.println(sum);
    }
}
