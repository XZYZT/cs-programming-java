package cs.programming.java.CONDandLOOP.program;

public class TaxRateCalcul {
    public static void main(String[] args) {
        double income   = Double.parseDouble(args[0]);
        double rate     = 0.35; 
        if      (income < 47450)    { rate = 0.22; } 
        else if (income < 114649)   { rate = 0.25; } 
        else if (income < 174699)   { rate = 0.28; } 
        else if (income < 311949)   { rate = 0.33; } 
        System.out.println(rate);
    }
}
