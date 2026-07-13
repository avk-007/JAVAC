package Interfacess;



interface   A{

    int age = 10; //final and static
    String name = "bengaluru";
    void show();
    void config();
}
interface X{
   void run();
}
//inheritance
interface Y extends X{
}
class B implements A,Y{

    @Override
    public void show() {
        System.out.println("show 1");
    }

    @Override
    public void config() {
        System.out.println("config 2");
    }
//it can come from Y interface as well parent child interface
    @Override
    public void run() {
        System.out.println("run abstract method");
    }
}
public class Demo {
    public static void main(String[] args) {
         A obj; //refernce obj of A
         obj=new B();
        obj.show();
        obj.config();
        //to call run
        X x=new B();
        x.run();
        System.out.println( A.age);
        System.out.println(A.name);


    }
}
