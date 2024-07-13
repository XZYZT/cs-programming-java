package cs.programming.java.basiconcept.homework;
/**
 * 1.2.33　大圆（大圆是指过球心的平面和球面的交线，球面上两点的最小距离为经过
 * 两点的大圆的劣弧。航海与航空中利用这一原理而设置了大圆航线。——译者注）。编写
 * GreatCircle程序，它需要四个double型命令行参数，分别是x1、y1、x2和
 * y2，用于表示地球上两点的纬度和经度，以度为单位，计算它们之间的大圆距离。大圆
 * 距离（海里）由下式给出：
 * 
 * @author ShaQuan
 *
 */
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double R_EARTH = 6371.0;
        /*
         * distance=2rarcsin(sin2((x2−x1)/2)+cosx1cosx2sin2((y2−y1)/2)−−−−−−−−−−−−−−−−−−
         * −−−−−−−−−−−−−−−−−√)
         */
        double formal1 = Math.pow(Math.sin((x2 - x1) / 2), 2);
        double formal2 = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);
        double formal3 = Math.sqrt(formal1 + formal2);
        double distance = 2 * R_EARTH * Math.asin(formal3);
        System.out.printf("%.12f kilometers", distance);
    }
}
