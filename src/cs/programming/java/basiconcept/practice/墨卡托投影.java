package cs.programming.java.basiconcept.practice;

import static cs.programming.java.MathU.*;
import static cs.programming.java.GetArguments.*;
/**
 * 1.2.31　墨卡托投影。墨卡托投影是一个保形（能够保留角度）投影法，
 * 经常用于将球坐标（纬度φ和经度λ）映射到直角坐标（x，y）。该方法常用
 * 于处理海图和地图。投影由方程x=λ-λ0，（（1+sinφ）/（1-sinφ））
 * 定义，其中λ0是地图中心点的经度。编写一个程序，从命令行获取λ0和点的
 * 经纬度并打印其投影。
 * 
 * @author Administrator
 * 
 */
public class 墨卡托投影 {
    public static void main(String[] args) {
        double 纬度      = transmitDouble(args, 0);
        double 经度      = transmitDouble(args, 1);
        double lambda0  = transmitDouble(args, 2);
        double fai      = 纬度;
        double lambda   = 经度;
        
        double item  = (1 + sin(fai)) / (1 - sin(fai));
        double y     = 1/2 * ln(item);
        
        double x = lambda - lambda0;
        
        System.out.println(x + ", "  + y);
    }
}
