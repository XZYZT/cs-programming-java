package cs.programming.java.basiconcept.practice;

/**
 * 1.2.35���������ߡ���дһ������������������������ߵ�ָ�
 * ����ָ����F��L��R���ɵ��ַ���������F��ʾ����ǰ����1����λ��ֱ
 * �ߡ���L��ʾ������ת����R��ʾ������ת����Ҫ�õ�һ��n�׵��������ߣ�
 * ����Խ�ֽ������n/2�κ��ٽ���չ������ÿһ���ۺ�չ��Ϊֱ�ǡ�
 * ����������Ĺؼ���Ҫע�⣬����n������������һ������Ϊn-1������
 * ���ߣ��������һ��L���������һ������Ľ���n-1���������ߣ������
 * �������ߵĻ��Ʒ���������ơ�
 * 
 * https://learning.oreilly.com/library/view/ji-suan-ji-ke-xue-dao-lun-kua-xue-ke-fang-fa/9787111641414/Text/chapter6.xhtml
 * 
 * @author Administrator
 * 
 */
public class Dragon {
    public static void main(String[] args) {
        String dragon0 = "F";
        String nogard0 = "F";
        String dragon1 = dragon0 + "L" + nogard0;
        String nogard1 = dragon0 + "R" + nogard0;
        String dragon2 = dragon1 + "L" + nogard1;
        String nogard2 = dragon1 + "R" + nogard1;
        String dragon3 = dragon2 + "L" + nogard2;
        
        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
    }
}
