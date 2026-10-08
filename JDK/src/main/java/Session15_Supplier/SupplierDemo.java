package Session15_Supplier;

import java.util.function.Supplier;

public class SupplierDemo {
/*
   1. it is a one of predefined functional interface
   2. if we dont need to provide any input but get something
       i,e get something without passing input

   3.syntax::
       public interface Supplier<R>{
          R get(); //abstract method
    }
  4.consumer and supplier are counter parts
  5.Supplier Interface doesnt have any default and sttaic methods
  6.Supplier interface doesnt have any chaining concept
  7.supplier interface doesnt have two arguments because it will not  expect any input
  8.supplier interface are primitive Supplier interface*/
    public static void main(String[] args) {
        //ex1 otp
        Supplier<String> s=()->{String otp=" ";
        for (int i=0;i<6;i++)
        otp=otp+(int)(Math.random()*10);
            return otp;
        };
        System.out.println(s.get());

        String[] names={"abhishek","kumar","sreenubro"};

    }
}
