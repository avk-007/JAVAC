package OOPSS;


class Calc{

    int num; //instance varibale
    //n1 local variable
    //add(int n1,int n2 ,int n3) declared inside
    int add(int n1,int n2 ,int n3)
    {
    /*    int result=n1+n2+n3;
        return result;*/
       return n1+n2+n3;
    }

    int add(int n1,int n2 )
    {
    /*    int result=n1+n2+n3;
        return result;*/
        return n1+n2;
    }

}
public class Deo33 {
    public static void main(String[] args) {

        //calc is reference variable
        Calc calc=new Calc();
        int add1 = calc.add(1, 6);
        //this add is variable
        int add = calc.add(1, 28, 4);
        System.out.println(add);
        System.out.println(add1);
    }
}
