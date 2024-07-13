package cs.programming.java.basiconcept;

/**
 * 
 * @author Administrator
 *
 */
public class Ruler {
    public static void main(String[] args) {
        String rule1 = "1";
        String rule2 = rule1 + "2" + rule1;
        String rule3 = rule2 + "3" + rule2;
        String rule4 = rule3 + "4" + rule3;
        System.out.println(rule1);
        System.out.println(rule2);
        System.out.println(rule3);
        System.out.println(rule4);
    }
}
