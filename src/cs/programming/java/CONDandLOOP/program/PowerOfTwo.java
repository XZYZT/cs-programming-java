package cs.programming.java.CONDandLOOP.program;

import static cs.programming.java.MathU.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        example4(Integer.MAX_VALUE);
        example3(30);
    }
    
    public static void example1(int n) {
        for (int i = 0; i < n; i++) {
            double p = pow(2, i);
            System.out.println(p);
        }
    }
    
    public static void example3(int n) {
        int power = 0;
        System.out.println("i    power");
        System.out.println("——————————");
        
        while (n-- >= 0) {
            String f = String.format("%-5d%-10d", power, (int)pow(2, power++));
            System.out.println(f);
        }
    }
    
    public static void example4(int n) {
        int power = 1;
        while(power <= n/2) {
            power = 2*power;
            System.out.println(power);
        }
    }
    
    public static void example2(int n) {
        int power   = 1;
        int i       = 0;
        while(i < n) {
            power   = power * 2;
            i       = i + 1;
            System.out.println(power);
        }
    }
}
