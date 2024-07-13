package cs.programming.java.basiconcept.practice;

/**
 * 1.2.23　编写一个程序，该程序需要两个整型命令行参数m和d，
 * 如果以这两个值作为日期，即m月d日在3月20日和6月20日之间，
 * 则输出true，否则返回false。
 * 
 * @author Administrator
 *
 */
public class MonthDay {
    public static void main(String[] args) {
        int month           = Integer.parseInt(args[0]);
        int day             = Integer.parseInt(args[1]);
        boolean isSpring    = isSpring(month, day);
        System.out.println(isSpring);
    }
    
    private static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) 
            || (month == 4 && day >=  1 && day <= 30)
            || (month == 5 && day >=  1 && day <= 31)
            || (month == 6 && day >=  1 && day <= 20);
    }
}





enum Month {
    January, February;
}
