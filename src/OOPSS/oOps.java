package OOPSS;
//class6
//obj is a class
// everything we use is object
//object-oriented programming
//obj know something obj does something
//obj have properties and behaviour
//jvm is responsible to create the obj give him the blueprint

/*
//example 1
//class created from where class calculator class method addto be called
class Calculator{
    //method created for further use
    //int n1,int n2 are parameters
    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}

public class oOps{

    public static void main(String[] args) {
        int num1=5,num2=6;
        //create object calculator1 is reference variable
        Calculator calculator1=new Calculator();
        //local variable created
        int add1 = calculator1.add(num1,num2);
        System.out.println(add1);
    }
}

*/

class Calcutor1{
    public int add(int num1, int num2, int  num3){
     /* int result=num1+num2+num3;
      return result;*/
      //or
        return num1+num2+num3;
    }
    //a method which accepts 2 values
    public  int add2No(int n1,int n2){
        return n1+n2;
    }

    //a method which accepts 2 values different type
    //called as method overloading
    public  double add2No(int n1,double n2){
        return n1+n2;
    }
}
public  class oOps {
    public static void main(String[] args) {

        Calcutor1 calcutor1=new Calcutor1();
        int add = calcutor1.add(1, 2, 4);
        int add1= calcutor1.add2No( 2, 4);
        System.out.println(add);
        System.out.println(add1);
    }
}
