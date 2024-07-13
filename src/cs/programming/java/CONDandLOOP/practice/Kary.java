package cs.programming.java.CONDandLOOP.practice;

import org.junit.jupiter.api.Test;

/**
 * 1.3.21:
 * ��дһ������ Kary�������������������в��� i �� k������ i ת��Ϊ���� k��
 * ���� i �� Java long ���������е�������k �ǽ��� 2 �� 16 ֮������������ڴ��� 
 * 10 �Ļ�����ʹ����ĸ A �� F �ֱ����� 11 λ���� 16 λ���֡�
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
            throw new IllegalArgumentException("����Ĳ���k��k �ǽ��� 2 �� 16 ֮���������");
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
     * ӳ�䵥��      X
     * Xȡֵ��Χ��   10 < x < 15
     * ��ӦΪ��      A - F
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
////        ������
//        String memo = switch (week){
//            case 1 : yield "��Ϣ��";
//            case 2,3,4,5,6 : yield "������";
//            case 7 : yield "������";
//            default : yield "��Ч������";
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
