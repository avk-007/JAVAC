package practiceX;

class A{

    void show(){
        System.out.println("in A ");
    }
    static class B {

        public void config(){
            System.out.println("in B ");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A.B obj1=new A.B();
        obj1.config();


    }
    }

