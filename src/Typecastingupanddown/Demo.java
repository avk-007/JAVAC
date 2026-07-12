package Typecastingupanddown;


class A{
public void showA(){
    System.out.println("show A");
}
}

class B extends A{
    public void showB(){
        System.out.println("show B");
    }
}
public class Demo {

    public static void main(String[] args) {
        //upcasting
        A obj=new B();
        obj.showA();

        //downcasting
        B obj1= (B) obj;
        obj1.showB();




    }
}
