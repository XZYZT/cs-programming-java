package cs.programming.java.basiconcept.practice;

public class SumOfTwoRandom {
    public static void main(String[] args) {
       sumOfTwoDice();
       test();
    }
    
    private static void sumOfTwoDice() {
        int SIDES = 6;
        int a = (int)(Math.random() * SIDES) + 1;
        int b = (int)(Math.random() * SIDES) + 1;
        int sum = a + b;
        System.out.println(sum);
    }
    
    
    private static void test() {
        int a      = (int)Math.round(Math.random() * 6);
        int b      = (int)Math.round(Math.random() * 6);
        int sum    = a + b;
        System.out.printf("a = %d, b = %d, sum = %d", a, b, sum);
    }
}
