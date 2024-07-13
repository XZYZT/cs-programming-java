package cs.programming.java;

//import static cs.programming.java.GetArguments.*;
public class GetArguments {
    public static double transmitDouble(String[] args, int i) {
        return Double.parseDouble(args[i]);
    }

    public static int transmitInteger(String[] args, int i) {
        return Integer.parseInt(args[i]);
    }

    public static String transmitString(String[] args, int i) {
        return args[i];
    }

    /**
     * 参数范围检查     double类型 
     * @param a     被检查参数   
     * @param begin 开始值     
     * @param end   结束值     
     */
    public static void checkDouble(double a, double begin, double end) {
        if (begin > a || a > end) {
            String errMsg = String.format("错误的参数%.5f!从%.5f到%.5f", a, begin, end);
            System.out.println(errMsg);
            throw new IllegalArgumentException(errMsg);
        }
    }
}
