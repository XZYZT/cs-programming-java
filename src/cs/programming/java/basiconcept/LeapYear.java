package cs.programming.java.basiconcept;

/**
 * ����1.2.4 ����
 * �ж��Ƿ������꣺
 * ������Ա�4��������
 * ��������Ա�100����������Ҫ��400������������
 * @author Administrator
 *
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeapYear = isLeapYear(year);
        System.out.println(year + "�������� " + isLeapYear);
    }
    
    public static boolean isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        return isLeapYear;
    }
}
