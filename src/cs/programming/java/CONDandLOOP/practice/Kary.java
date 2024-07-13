package cs.programming.java.CONDandLOOP.practice;

import org.junit.jupiter.api.Test;

/**
 * 1.3.21:
 * 编写一个程序 Kary，接收两个整数命令行参数 i 和 k，并将 i 转换为基数 k。
 * 假设 i 是 Java long 数据类型中的整数，k 是介于 2 和 16 之间的整数。对于大于 
 * 10 的基数，使用字母 A 至 F 分别代表第 11 位至第 16 位数字。
 * 
 * @author Administrator
 *
 */
public class Kary {
    /**
     * 
     * @param i
     * @param k < 16
     */
    public void translateI2BaseK(long i, short k) {
        if (k > 16 || k < 2) {
            throw new IllegalArgumentException("错误的参数k，k 是介于 2 和 16 之间的整数。");
        }
        String res = "";
        while (i > 0) {
            char a = moreThan10((short) (i % k));
            i /= k;
//            System.out.println(a + " : " + i);
            res = a + res;
        }
        System.out.println(res);
    }
    
    /*
     * 映射单个      X
     * X取值范围：   10 < x < 15
     * 对应为：      A - F
     */
    private char moreThan10(short x) {
        if (x < 10) {
            return (char)(x + '0');
        } 
        char c = switch (x) {
        case 10: {
            yield 'A';
        } case 11: {
            yield 'B';
        } case 12: {
            yield 'C';
        } case 13: {
            yield 'D';
        } case 14: {
            yield 'E';
        } case 15: {
            yield 'F';
        }
        default:
            throw new IllegalArgumentException("Unexpected value: " + x);
        };
        return c;
    }
    
    
    /*
     * https://www.jb51.net/program/322292lhs.htm
     */
    @Test
//    public void Test02(){
//        int week = 7;
////        计算结果
//        String memo = switch (week){
//            case 1 : yield "休息日";
//            case 2,3,4,5,6 : yield "工作日";
//            case 7 : yield "星期六";
//            default : yield "无效的日期";
//        };
//        System.out.println(memo);
//    }
    public static void main(String[] args) {
        Kary kary   = new Kary();
        long i      = 8;
        short k     = 2;
        
        kary.translateI2BaseK(i, k);
//        String res;
//        while (i > 0) {
//            char a = kary.moreThan10((short) (i % k));
//            i /= k;
//            System.out.println(a + " : " + i);
//        } 
    }
}
