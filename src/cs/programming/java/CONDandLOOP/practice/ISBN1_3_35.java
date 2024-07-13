package cs.programming.java.CONDandLOOP.practice;

import cs.lib.box.util.FormatPrint;

/**
 *  Determines the check digit of an ISBN-10 number given the first 9 digits.
 *
 *  An ISBN-10 number is valid if it consists of 10 digits and
 *  d_1 + 2*d_2 + 3*d_3 + ... + 10*d_10 is a multiple of 11.
 *  For example, 0-201-31452-5 is valid since
 *  0201314525
 *  1*5 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 = 88
 *  and 88 is a multiple of 11.
 *  
 *  % java ISBN 013407642
 *  The full ISBN number is 0134076427
 *
 *  % java ISBN 067233784
 *  The full ISBN number is 0672337843
 *
 *  % java ISBN 032157351
 *  The full ISBN number is 032157351X
 *  
 * @author ShaQuan
 *
 */
public class ISBN1_3_35 {
    public static void main(String[] args) {
//        char c1 = '1';
//        System.out.println((int)c1 - 48);    // = 2
//        
//        String s  = "0134076427";
//        String s2 = "0134076420";
//        char[] c  = s.toCharArray();
//        System.out.println(String.valueOf(c));
//        System.out.println(calculateExpress(s2));
        
        int n = Integer.parseInt("032157351");
        isbn(n);
    }
    
    protected static char[] inverse(char[] c) {
        int cIndex = c.length - 1;
        char[] c2 = new char[c.length];
        for (int i = cIndex; i >= 0; i--) {
            c2[i] = c[cIndex-i];
        }
        return c2;
    }
    
    protected static int calculateExpress(String n) {
        char[] nums = n.toCharArray();
//        int x = 0;      
        int sum = 0;    
        for (int i = 10; i >= 1; i--) {
            int a = nums[i - 1] - 48;
            int b = a * (11 - i);
            sum += b;
//            System.out.print(a + " * " + (11 - i) + ", ");
        }
//        System.out.println();
        return sum;
    }
    
    private static FormatPrint fp = new FormatPrint("n,i,sum,digit");
    
    protected static void isbn(int n) { // calculateExpress
        int sum = 0;
        fp.printTitles();
        // compute the weighted sum of the digits, from right to left
        for (int i = 2; i <= 10; i++) {
            int digit = n % 10;         // rightmost digit
            fp.loadOneLineData(new Object[] {n, i, sum, digit});
            fp.printOneLineData();
            n = n / 10;
            sum = sum + i * digit;
        }
        
        // print out check digit, use X for 10
        System.out.print("The full ISBN number is " + n);
        if      (sum % 11 == 1) System.out.println("X");
        else if (sum % 11 == 0) System.out.println("0");
        else                    System.out.println(11 - (sum % 11));
    }
}
