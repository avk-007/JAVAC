package Annotatations;


@FunctionalInterface
interface ABC{

   //method which return a value
  int  add(int i,int j,int k);
}

public class DemoFunctionInterface {

    public static void main(String[] args) {
/*
//annonymous class
        ABC a=new ABC(){
          public void show(){
                System.out.println("in show");
            }
        };
        a.show();
*/
        //with lamdda expression
        ABC obj = (int i,int j ,int k) ->  i + j + k;
        int result = obj.add(5, 2, 8);
        System.out.println(result);
    }
}