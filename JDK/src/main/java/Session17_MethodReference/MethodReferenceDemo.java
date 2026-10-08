package Session17_MethodReference;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //instead of Le we can use Method Refercen
       // Demo d=()-> System.out.println("m1 method");
//ex1
      /*  Demo d=new DemoImpl() ::m1;
        d.m1();*/
/*
//ex2
        Demo d= new DemoImpl()::add;
        int add = d.add(1, 3);
        System.out.println(add);*/

        //ex3 with sttaic

        Demo d =DemoImpl::m2;
        d.m2();


    }
}
