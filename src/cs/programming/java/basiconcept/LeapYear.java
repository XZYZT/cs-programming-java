package cs.programming.java.basiconcept;

/**
 * 程序1.2.4 闰年
 * 判断是否是闰年：
 * 如果可以被4整除：是
 * 如果还可以被100整除，则还需要被400除尽才是闰年
 * @author Administrator
 *
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeapYear = isLeapYear(year);
        System.out.println(year + "是闰年吗？ " + isLeapYear);
    }
    
    public static boolean isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        return isLeapYear;
    }
}
