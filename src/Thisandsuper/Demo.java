package Thisandsuper;

class A{
    //constructors
public A(){
    super();
    System.out.println("A");
}

//paramertized constructors
    public A(int a){
   super();
        System.out.println("paramertized constructor in A");
    }
}

class B extends A{
public B(){
    super();
    System.out.println("B");
}

    public B(int b){
       this();
       System.out.println("paramertized constructor in B");
    }
}

public class Demo {
    public static void main(String[] args) {
        B b=new B(5);

    }
}


//op with sceanrioss
