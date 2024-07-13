package cs.lib.box.conv;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeTest {
    public static void main(String[] args) {
        List<String> stringList     = new ArrayList<>();
        List<Integer> integerList   = new ArrayList<>();
 
        System.out.println(isGenericType(stringList, List.class, String.class)); // true
        System.out.println(isGenericType(integerList, List.class, Integer.class)); // true
        System.out.println(isGenericType(stringList, List.class, Integer.class)); // false
    }

    public static boolean isGenericType(Object obj, Class<?> baseClass, Class<?>... genericParams) {
        System.out.println(obj.getClass().getInterfaces()[0]);  
        if (baseClass.isInterface()) {  
            return obj.getClass().getInterfaces()[0].equals(baseClass);
        } else {
            return obj.getClass().getSuperclass().equals(baseClass);
        }
    }
}
