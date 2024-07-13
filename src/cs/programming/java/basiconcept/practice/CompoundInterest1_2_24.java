package cs.programming.java.basiconcept.practice;

import static cs.programming.java.GetArguments.*;

/**
 * 1.2.24　连续复利。假设投资P美元，年利率为r（计算复利）（计算复利是指利息部分仍参与计息。
 * ——译者注）。计算t年后的资产金额。结果可以由公式Pert算出。
 * @author Administrator
 * 
 */
public class CompoundInterest1_2_24 {
    public static void main(String[] args) {
        int P       = transmitInteger(args, 0);     // 本金
        double r    = transmitDouble(args, 1);      // 年利率
        int t       = transmitInteger(args, 2);     // 存款年限
        double e    = Math.E;                       // 自然底数
//        PowFunc pow = (a, b) -> Math.pow(a, b);   
        
        double res  = P * Math.pow(e, r*t); 
        System.out.println(res);
    }
    
}

interface PowFunc {
    double run(double a, double b);
}
