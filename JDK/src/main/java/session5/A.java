package session5;
@FunctionalInterface
interface A {
    void m2();
    //defaukt methods are concreate methods
    //lE are used to replacethe implemementation classes

    default void m1() {
        System.out.println("m1 method from A");
    }
}
