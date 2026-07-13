package Interfacess;
//with interface
interface  Computer{
   void code();
}
class Laptop implements Computer{
   public void code(){
        System.out.println("code compile run with laptop");
    }
}

class Desktop implements Computer{
 public  void code(){
        System.out.println("code compile run with desktop");
    }
}

class Developer {
    void develop(Computer comp)
    {
        comp.code();
    }
}

public class DEmoEx {
    public static void main(String[] args) {
        //trick for dealing with classes with inheritance
        //parent to child
        //interfaces refenences
        Computer laptopp=new Laptop();
        Computer desktopp=new Desktop();
        Developer abhishek=new Developer();
        abhishek.develop(laptopp);
    }
}
