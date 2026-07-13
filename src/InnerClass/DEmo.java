package InnerClass;
class A {

    int age;

    public void show() {
        System.out.println("in show");
    }
    //inner class

    class B {
        //  class B {
        public void config() {
            System.out.println("in config");
        }
    }
    //static can be used in inner class only
    static class C {
        public void values() {
            System.out.println("in values");
        }
    }
}
    public class DEmo {
        public static void main(String[] args) {
            A obj = new A();
            obj.show();
          //trick to call inner object of class B
            A.B obj2 = obj.new B();
            obj2.config();

            //for static class B
            A.C obj3 = new A.C();
            obj3.values();
        }
    }

