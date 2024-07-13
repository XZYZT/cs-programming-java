package cs.lib.box.conv;

public interface Conversion<T, S> {
   public S fromTypeToType(T t);
}
