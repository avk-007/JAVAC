package Session2_3;

@FunctionalInterface
interface A{
    //FI has one abstract method
    void m1();
// default
   default void m2(){
    }
   //static method
    static  void m3(){
    }
}
public class DEmo {
    static void main() {
        A a = System.out::println;

    }
}
