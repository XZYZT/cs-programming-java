package cs.lib.box.util;


public class FormatPrint {
    private int[] lens;                                     // 存放所有标题(字段)名的输出长度
    private static final int DEFAULT_TITLE_LENGTH = 10;     // 默认标题输出长度
    private String[] titles;    
    private String[] oneLineData;                 
    private int numberOfTitles;                             // 标题总数
//    private String[][] table;   
    public  FormatPrint(String titles) {
        String[] titArray = titles.split(",");
        this.numberOfTitles = titArray.length;
        loadTitles(titArray);
    }
    
    private void loadTitles(String...titles) { 
        this.lens   = new int[titles.length];
        this.titles = titles;
    }
    
    public void reloadAndPrintTitles(String titles) {
        String[] titleArray = titles.split(",");
        this.numberOfTitles = titleArray.length;
        loadTitles(titleArray);
        printTitles();
    }
    
    /**
     * 更新输出数据格式长度
     * @param index
     * @param length
     */
    void updateOutputLengths(int index, int length) {
        this.lens[index] = length;
    }
    
    public void loadOneLineData (Object[] set) {
        String[] strArr = new String[set.length];   
        for (int i = 0; i < set.length; i++) {      
            strArr[i] = set[i].toString();          
        } 
        this.oneLineData = strArr; 
    }
    
    public void printOneLineData() {    
        StringBuilder stb   = new StringBuilder();          
        for (int i = 0; i < this.numberOfTitles; i++) {     
            int titleLen    = this.lens[i];
            String s        = String.format("%-"+titleLen+"s", this.oneLineData[i]);
            stb.append(s);
        }
        System.out.println(stb.toString());
    }
    
//    public void loadDataTable (int n, int m, String[][] ordSet) {
//        this.table = new String[n][m];  
//        this.table = ordSet;
//    }
    
    public void printTitles() {     
        StringBuilder stb   = printTitles(this.titles);  
        System.out.println(stb.toString());
    }
    
    private StringBuilder printTitles(String...titles) {     
        StringBuilder stb   = new StringBuilder();          
        int len = DEFAULT_TITLE_LENGTH;                 
        int i   = 0;                                    // 当前标题序数
        for (String title : titles) { 
            int titleLen    = title.length();   
            len             = adaptLength(len, titleLen);   
            String s        = String.format("%-"+len+"s", title);
            updateOutputLengths(i, len);
            stb.append(s);
            i++;
        }
        return stb;
    }
    
    /**
     * 
     * @param len       初始字段长度
     * @param fieldLen  实际字段长度
     * @return
     */
    private int adaptLength(int len, int fieldLen) {
//        if (fieldLen > len)                         // 标题长度判断
//            len = (fieldLen / len + 1) * len;       
//        else 
//            len = DEFAULT_TITLE_LENGTH;
//        return len;
        
        return fieldLen > len 
                ? (fieldLen / len + 1) * len 
                : DEFAULT_TITLE_LENGTH;
    }
    
    public static void main(String[] args) {
        FormatPrint fp = new FormatPrint("month,TotalAmount,balance");
        fp.printTitles();
        fp.loadOneLineData(new Object[] {"213", "4", "245"}); 
        fp.printOneLineData();
        
    }
}
