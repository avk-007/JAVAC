package session5;
@FunctionalInterface
public interface C extends B {
    void m2();
    @Override
    default void m1(){
        System.out.println("m1 method from C");
    }
}
