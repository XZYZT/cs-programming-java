package cs.programming.java.CONDandLOOP.practice;

public class DigitReverser1_3_12 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        int m = 0;
        
        // 算术方法倒序
        while (n != 0) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        System.out.println(m);
        
        // 字符串连接
        String s = "";
        while(m != 0) {
            int digit = m % 10;
            s = s + digit;
            m /= 10;
        }
        System.out.println(s);
    }
}
