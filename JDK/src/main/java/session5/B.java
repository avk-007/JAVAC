package session5;

@FunctionalInterface
public interface B extends A{

    void m2();
    @Override
    default void m1() {
        System.out.println("m1 method from B");
    }
}
