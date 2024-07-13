package cs.programming.java.basiconcept.practice;

/**
 * 1.2.35　龙形曲线。编写一个程序，用于输出绘制龙形曲线的指令。
 * 绘制指令是F、L和R构成的字符串，其中F表示“向前画出1个单位的直
 * 线”，L表示“向左转”，R表示“向右转”。要得到一个n阶的龙形曲线，
 * 你可以将纸条对折n/2次后，再将它展开并把每一个折痕展开为直角。
 * 解决这个问题的关键是要注意，阶数n的龙形曲线是一个阶数为n-1的龙形
 * 曲线，后面跟着一个L，后面跟着一个反序的阶数n-1的龙形曲线，反序的
 * 龙形曲线的绘制方法与此类似。
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
