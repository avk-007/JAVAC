package session4;
@FunctionalInterface
//can have one abstract , many default and many static methods
interface  A{
   // void m1();
//   void m1(int a ,int b,int c);

    public int getLenght (String s);
}

/*@FunctionalInterface
interface  B extends A {
    void m1();
}*/
class B implements A{
    @Override
    public int getLenght(String s) {
        System.out.println("given String ::"+s);
        return s.length();
    }
/*    @Override
    public void m1() {
        System.out.println("hello ji");
    }*/

  /*  @Override
    public void m1(int a, int b, int c) {
    }*/
}
public class Demo {
    public static void main(String[] args) {

        {

  /*      A a = new B();
        a.m1();*/
/*        //in Lambda Expression  syntax
        A obj =(int a ,int b,int c)-> System.out.println(a+b+c);
        obj.m1(2,4,5);*/
            A obj2 = (s) -> s.length();
            System.out.println(obj2.getLenght("hello abhi"));
        }
    }
}