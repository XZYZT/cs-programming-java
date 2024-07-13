package cs.programming.java.CONDandLOOP.program;

/**
 * Probability of winning = stake �� goal. 
 * Expected number of bets = stake �� desired gain 
 * ��ͽ��Ϸ����
 * @author Administrator
 *
 */
public class Gambler {
    public static void main(String[] args) {
        gambler3Args(args);
    } 
    
    public static void gambler3Args(String[] args) {
        if (args.length != 3) { System.out.println("������3�����ֲ������磺10 50 20"); }
        int stake   = Integer.parseInt(args[0]);    // ��ע
        int goal    = Integer.parseInt(args[1]);    // Ŀ��
        int trials  = Integer.parseInt(args[2]);    // ʵ��
        
        int wins   = 0;
        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                if (Math.random() < 0.5) { cash++; }
                else                     { cash--; }
            }
            if (cash == goal) wins++;
        }
        System.out.println(wins + " wins of " + trials);
    }
    
    public static void gambler2Args(String[] args) {
        if (args.length != 2) { System.out.println("������2�����ֲ������磺10 50"); }
        int stake   = Integer.parseInt(args[0]);    // ��ע
        int goal    = Integer.parseInt(args[1]);    // Ŀ��
        
        int cash = stake;
        @SuppressWarnings("unused")
        int wins = 0;
        while (stake > 0 && stake < goal) {
            if (Math.random() > 0.5) stake++;
            else                     stake--;
        }
        if (cash == goal) wins++;
    }
    
}
