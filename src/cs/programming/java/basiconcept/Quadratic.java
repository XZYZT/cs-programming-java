package cs.programming.java.basiconcept;

/**
 * 程序1.2.3 求解一元二次方程
 * @author Administrator
 *
 */
public class Quadratic {
    public static void main(String[] args) {
        double a = +1.0;
        double b = -3.0;
        double c = +2.0;
        double discriminant = b*b - 4.0*a*c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b - d) / 2*a);
        System.out.println((-b + d) / 2*a);
    }
}
