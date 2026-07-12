package Pollymorphismm;
/*
//many behaviours
compiletimePollymorphismm --early binding
behvaior defined at compiletime
//overloading
runtime Pollymorphismm-->late binding
behvaior defined at runtime

-->overrriding

//DYnamic method dispatch --->>

*/
//DYnamic method dispatch --->>
class A{

    public void show(){
        System.out.println("show A");
    }
}

class B extends A{
    public void show(){
        System.out.println("show B");
    }

}

class C extends B{
    public void show(){
        System.out.println("show C");
    }

}
public class Demo {
    public static void main(String[] args) {

        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();


    }
}
