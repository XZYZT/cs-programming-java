package cs.programming.java.basiconcept.homework;
/**
 * 判断三个数是否能构成执教三角�?
 * 
 * @author ShaQuan
 *
 */

public class RightTriangle {
    public static void main(String[] args) {
        long a = Integer.parseInt(args[0]);
        long b = Integer.parseInt(args[1]);
        long c = Integer.parseInt(args[2]);
        /*
         * if (a > b) { if (a > c) {
         * 
         * } } else if (b > c) {
         * 
         * } else {
         * 
         * }
         */
        boolean r = a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
        System.out.println(a > 0 && b > 0 && c > 0 && r);
    }
}
