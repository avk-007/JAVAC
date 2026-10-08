package session5;


@FunctionalInterface
public interface D extends C {
    void m2();

    @Override
   default void m1(){
       System.out.println("m1 method from D");

    }
}
