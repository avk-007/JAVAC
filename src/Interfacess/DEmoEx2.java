package Interfacess;

//with abstracts method and class
abstract class Computer1{
    abstract void code();
}
class Laptop1 extends Computer1{
    void code(){
        System.out.println("code compile run with laptop");
    }
}

class Desktop1 extends Computer1{
    void code(){
        System.out.println("code compile run with desktop");
    }
}

class Developer1 {
    void develop(Computer1 comp)
    {
        comp.code();
    }
}

public class DEmoEx2 {
    public static void main(String[] args) {
        //trick for dealing with classes with inheritance
        //parent to child
        Computer1 laptopp=new Laptop1();
        Computer1 desktopp=new Desktop1();
        Developer1 abhishek=new Developer1();
        abhishek.develop(laptopp);
    }
}
