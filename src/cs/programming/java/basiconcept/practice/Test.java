package cs.programming.java.basiconcept.practice;

public class Test {
    public static void main(String[] args) {
        boolExpression(true, true);
        boolExpression(true, false);
        boolExpression(false, true);
        boolExpression(false, false);
    }
    
    /*
     * 1.2.3　假设a和b是布尔变量。证明表达式
     * （！（a&&b）&&（a||b））||（（a&&b）||！（a||b））
     * 的计算结果为true。
     */
    private static void boolExpression(boolean a, boolean b) {
        // （！（a&&b）&&（a||b））||（（a&&b）||！（a||b））
        boolean aa = !(a && b) && (a || b);
        boolean bb = (a && b) || !(a || b);
        boolean res = aa || bb;
        System.out.println(res);
    }
    
    /*
     * 求表达式(Math.sqrt(2)*Math.sqrt(2)==2)的值。
     */
    @SuppressWarnings("unused")
    private static void sqrtExpression() {
        System.out.println(Math.sqrt(2)*Math.sqrt(2)==2);
    }
}
