package cs.lib.box.conv;

import java.util.ArrayList;
import java.util.List;      

public class TypeConversions {  
    /****************************************************
     * 1. Automatic Type Casting (Implicit Casting):
     * 自动类型转换（隐式转换） 
     * Widening Conversion:When converting a smaller data 
     * type to a larger data 
     * type     
     * 加宽转换，将较小的数据类型转换为较大的数据类型
     ***************************************************/
    public static long int2Long(int val) {
        return val;
    }
    public static int byte2Int(byte val) {
        return val;
    }
    public static double int2Double(int val) {
        return val;
    }
    /****************************************************
     * 2. Explicit Type Casting (Forced Casting):Explicit 
     * casting can lead to data loss when converting from 
     * a larger data type to a smaller one
     * · Narrowing Conversions: 
     ***************************************************/
    public static int double2Int(double val) {
        return (int)val;
    }
    
    /****************************************************
     * Reference Type Conversions: These conversions involve 
     * converting between reference types (e.g., String, 
     * Object). Reference type conversions can be either 
     * compatible or incompatible
     * Compatible Conversions: 
     ***************************************************/
    public static String obj2String(Object obj) {
        return (String)obj;
    }
    
    
    
    /****************************************************
     * 考虑隐式类型转换：
     * 数据丢失：从较大的数据类型转换为较小的数据类型时，显式强制转换可能导致数据丢失。
     * 
     * 例如，将double强制转换为int可能会导致小数部分被截断。
     * 
     * 类型安全：应谨慎使用显式强制转换，因为如果操作不正确，它可能会绕过类型安全检查，
     * 
     * 并可能导致运行时错误。
     * 
     * 替代方法：考虑使用替代方法，如方法重载或泛型编程，以更安全有效地处理类型转换。
     ***************************************************/
    
    public static String charArr2String(char[] c) {
        return String.valueOf(c);
    }
    public static String charArr2String(Character[] c) {
        return String.valueOf(c);
    }
    
    public static void main(String[] args) {
        Object obj = new ArrayList<>();
        if (obj instanceof List) {
          List<?> list = (List<?>) obj; // Safe casting using instanceof check
        }
        
//        String a = new String("ab");
//        String b = "ab";
//        String c = "a" + "b";
//        String d = c;
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(b == c);
//        System.out.println(b == d);
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("System.out.println(\"%d Hello World\");\n", i);
        }
        System.out.println(0b1111);
    }
}

/**
 * 爱人见我脸发烧，
 * 送你什么，红豆豆。
 * 爱人见我脸发烧，
 * 送你什么，玉如意。
 * 爱人见我脸发烧，
 * 送你什么，山胡桃。
 * 爱人见我脸发烧，
 * 送你什么，甜杏仁。
 * 爱人见我脸发烧，
 * 送你什么，荷包包。
 */
