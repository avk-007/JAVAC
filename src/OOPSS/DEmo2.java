package OOPSS;
class Calcutor2{
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
    int num=5;
    public  double add2Nos(int n1,double n2){
        System.out.println(num);
        return n1+n2;
    }
}
public class DEmo2 {
    public static void main(String[] args) {
        Calcutor2 obj=new Calcutor2();
        Calcutor2 obj1=new Calcutor2();
        double add2 = obj1.add2Nos(3,4);
       // System.out.println(add);
        obj.num=8;
        System.out.println(obj.num );
        System.out.println(obj1.num);
    }
}
