package cs.programming.java.CONDandLOOP.program;

/**
 * 1.3.12　编写一个函数FunctionGrowth打印logn、n、nlogn、
 * n2、n3、2n的取值表格，其中n的取值是16、32、64、…、2048。使用
 * 制表符（\t字符）来实现对齐。
 * 
 * @author Administrator
 *
 */
public class FunctionGrowth {
    public static void main(String[] args) {
        functionGrowth();
        test();
    }
    
    public static void functionGrowth() {
        System.out.println("logn \tn \tnlogn\tn^2\tn^3");
        for (long i = 2; i <= 2048; i*=2) {
            System.out.print((int)Math.log(i));
            System.out.print("\t");
            System.out.print(i);
            System.out.print("\t");
            System.out.print((int) (i * Math.log(i)));
            System.out.print('\t');
            System.out.print(i * i);
            System.out.print('\t');
            System.out.print(i * i * i);
            System.out.println();
        }
    }
    
    public static void test() {
        System.out.println("logn \tn \tnlogn\tn^2\tn^3");
        long n        = 16;
        while(n <= 2048) {
            long ln   = (long) Math.log(n);      
            long nln  = (long) (n * Math.log(n));           
            long n2   = (long) Math.pow(n, 2);
            long n3   = (long) Math.pow(n, 3);
            System.out.printf("%-1d\t%-5d\t%-5d\t%-7d\t%-10d\n", 
                    ln, n, nln, n2, n3);
            n = n * 2;
        }
    }
}
