package cs.lib.box.conv;

public class TypeConversion<T, S> implements Conversion<T, S> {
    @Override
    public S fromTypeToType(T t) {
        return (S) conversionObjectToString((Object)t);
    }
    
    private String conversionObjectToString(Object o) {
        return o.toString();
    }
    
    public static void main(String[] args) {
        Conversion<Object, String> conv = new TypeConversion<Object, String>();
        System.out.println(conv.fromTypeToType("1234"));
    }
}
