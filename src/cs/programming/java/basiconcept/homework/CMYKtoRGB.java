package cs.programming.java.basiconcept.homework;

/**
 * https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php
 * 4. Type conversion. Several different formats are used to represent color.
 * For example, the primary format for LCD displays, digital cameras, and web
 * pages—known as the RGB format—specifies the level of red (R), green (G), and
 * blue (B) on an integer scale from 0 to 255. The primary format for publishing
 * books and magazines—known as the CMYK format—specifies the level of cyan (C),
 * magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0. Write
 * a program CMYKtoRGB.java that converts from CMYK format to RGB format using
 * these mathematical formulas: white=1−black red =255*white*(1−cyan) green
 * =255*white*(1−magenta) blue =255*white*(1−yellow) Your program must take four
 * double command-line arguments cyan, magenta, yellow, and black; compute the
 * corresponding RGB values, each rounded to the nearest integer; and print the
 * RGB values, as in the following sample executions:
 * 
 * 1.2.32　颜色转换。表示颜色的数据格式有多种。例如，在RGB格式中，使用三个整数分别表示红（R）、绿（G）和蓝（B）
 * 的级别，整数的取值范围是从0到255。这种格式主要用于LCD显示器、数码相机和网页配色。出版书籍和杂志主要使用的格式
 * 是CMYK格式，使用4个实数分别表示青色（C）、品红色（M）、黄色（Y）和黑色（K）的等级，实数的取值范围是从0.0到
 * 1.0。编写一个程序RGBtoCMYK，将RGB转换为CMYK。从命令行取三个整数r、g和b并打印出等价的CMYK值。如果RGB
 * 值全部为0，则CMY值全部为0，K值为1；否则，使用下面这些公式：
 * w=max(r/255，g/255，b/255)
 * c=(w-(r/255))/w
 * m=(w-(g/255))/w
 * y=(w-(b/255))/w
 * k=1-w
 * @author ShaQuan
 * 
 */
public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan         = Double.parseDouble(args[0]);
        double magenta      = Double.parseDouble(args[1]);
        double yellow       = Double.parseDouble(args[2]);
        double black        = Double.parseDouble(args[3]);
        int white           = (int) Math.round(1 - black);
        int red             = (int) Math.round(255 * white * (1 - cyan));
        int green           = (int) Math.round(255 * white * (1 - magenta));
        int blue            = (int) Math.round(255 * white * (1 - yellow));
        System.out.println("red       = " + red);
        System.out.println("green     = " + green);
        System.out.println("blue      = " + blue);
    }
}
