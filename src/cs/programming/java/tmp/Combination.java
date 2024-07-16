package cs.programming.java.tmp;

public class Combination {
    public static int comb(int n, int k) {
        return factorial(n)/(factorial(k) * factorial(n-k));
    }
    
    public static int perm(int n, int k) {
        return fac(n) / fac(k);
    }
    
    public static int fac(int n) {
        return factorial(n);
    }
    
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        System.out.println(fac(6)/2); 
    }
}
