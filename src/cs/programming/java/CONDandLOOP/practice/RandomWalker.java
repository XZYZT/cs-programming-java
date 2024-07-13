package cs.programming.java.CONDandLOOP.practice;

import cs.lib.box.util.FormatPrint;

/**
 *  1.3.37 二维随机行走二维随机行走模拟粒子在网格点中移动的行为。每走一步，
 *  随机漫步者向北、向南、向东或向西移动的概率等于 1/4 ，与之前的移动无关。
 *  请编写 RandomWalker 程序，该程序接受一个整数命令行参数 n，并估算
 *  随机漫步者到达以起点为中心的 2n×2n 正方形边界所需的时间。
 * 
 * @author Administrator
 *
 */
public class RandomWalker {
    public static void main(String[] args) {
//        randomWalkers(false);
        randomWalker();
    }
    
    /*
     * 通过这段代码，我学习到简化问题的重要性。它把一些更加简单的内容抽象出来了。
     * 从而使得解决问题和问题本身变得更清晰。
     */
    private static void randomWalker() {
        int n = 10;
        int x = 0;
        int y = 0;
        int steps = 0;
        
        while (Math.abs(x) < n && Math.abs(y) < n) {
            System.out.println("(" + x + ", " + y + ")");
            double p = Math.random();
            if      (p <= 0.25) x++;
            else if (p <= 0.50) x--;
            else if (p <= 0.75) y++;
            else if (p <= 1.00) y--;
            steps++;
        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + steps);
    }
    
    private static void randomWalkers(boolean trace) {
        int n = 10;
        int[] x = new int[n];         // x positions
        int[] y = new int[n];         // y positions
        int cellsToVisit = n*n;       // cells left to visit
        int steps = 0;                // number of steps taken 
        double r;
        boolean[][] visited = new boolean[n][n];  // has the i-j been visited?
        
        for (int i = 0; i < n; i++) {
            x[i] = n/2;
            y[i] = n/2;
        }
        visited[n/2][n/2] = true;
        cellsToVisit--;
        
        FormatPrint fp = new FormatPrint("i,x[i],y[i],cellsToVisit,steps");
        if (trace) fp.printTitles();
        // repeat until all cells have been visited 
        while (cellsToVisit > 0) {
            steps++;
            
            // move random walker i
            for (int i = 0; i < n; i++) {
                r = Math.random();
                if      (r <= 0.25) x[i]++;
                else if (r <= 0.50) x[i]--;
                else if (r <= 0.75) y[i]++;
                else if (r <= 1.00) y[i]--;
                
                if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
                    if (trace) {
                        fp.loadOneLineData(new Object[] {i, x[i], y[i], cellsToVisit, steps});
                        fp.printOneLineData();
                    }
                    cellsToVisit--;
                    visited[x[i]][y[i]] = true;
                }
            }
        }
        System.out.println(steps);
    }
}
