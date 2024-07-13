package cs.programming.java.CONDandLOOP.practice;

import cs.lib.box.util.FormatPrint;

/**
 * 程序Sqrt（程序1.3.6）展示了一种实现方法。这段程序的计算方法
 * 使用的是4000年前巴比伦人所提出的迭代计算方法。这种算法也是17
 * 世纪由Isaac Newton和Joseph Raphson开发的通用求平方根
 * 方法的特殊形式，因此也称为牛顿法。在一般情况下，牛顿法可以用于求解
 * 给定函数f(x)的根，即f(x)值为0时，x的值。对于某个估计值ti，通
 * 过在点（ti，f(ti)）处绘制与曲线y=f(x)相切的线，并将该切线与
 * x轴的交点记为ti+1，ti+1就是新的估计值。从最初的估计值t0开始，
 * 不断迭代这个过程，就会越来越接近函数的根。
 * 
 * f(x) = x2-c
 * 
 * @author Administrator
 * 
 */
public class Sqrt1_3_6 {
    public static void main(String[] args) {
        double c        = Double.parseDouble("5");
        sqrt(c, true);
    }
    
    private static FormatPrint fp = new FormatPrint("c,t");
    public static double sqrt(double c, boolean trace) {
        double EPSILON  = 1e-15;
        double t        = c;
        if (trace) fp.printTitles();
        while (Math.abs(t - c/t) > EPSILON * t) {
            if (trace) {
                fp.loadOneLineData(new Object[] {c, t});
                fp.printOneLineData();
            }
            t = (t + c/t) / 2.0;
        }
        return t;
    }
}
