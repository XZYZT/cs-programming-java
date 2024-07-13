package cs.lib.box.probability;

public class ModelAndAxioms {
    static int power2(int n) {
        return n*2;
    }
    
    static double base2power(int n) {
        return Math.pow(2, n);
    }
    
    interface StringFunction {
        String run(String str);
    }
    
    public static void 格式打印(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
    
    static boolean 是偶数吗(int n) {
        return (n & 1) == 0;
    }
    
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        格式打印("Hello", exclaim);
        格式打印("Hello", ask);
        
        double sum = 0.0;
        for (int i = 2; i <= 16; i ++) {
            if (是偶数吗(i)) {
                sum += 1.0 / base2power(i);
                System.out.println(base2power(i) + " = " + i);
            }
        }
        System.out.println("sum = " + sum);
        int i = 10;
        System.out.printf("%d是偶数吗？%b\n", i, 是偶数吗(i));
    }
}
