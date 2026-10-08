package Session12FunctionTypes;

import java.util.function.*;

/*Primitive FUnction interface classified into 4 types::

        1.InputPrimitives::
        1.IntFUnction<R> o/p--> R(int i)
    2.LongFunction<R>       R(long  l)
    3.DOuble Function <R>   R(double  d)

2.OutputPrimitives::
        1.IntFUnction<T>  op--> int apply(T t)
    2.LongFunction<T>       long apply(T t)
    3.DOuble Function<T>    double apply(T t)

3.Both Input and output is primitive
  1.IntToLongFUnction<T>  op--> long apply(int i)
  2.IntToDoubleFUnction<T>      double apply(int i)
  3. LongToIntFUnction<T>       int apply(long l)
  4.LongToDoubleFuction<T>      double apply (long l)
  5.doubleToIntFUnction<T>      int apply(double d)
  6.doubletoLongFunction<T>     long apply (double  d)

4.BiFUnction(Bi means 2) output Arguments
i.e output as a primitives int byte etc..
        1.ToIntBiFUnction<T,U>     int apply (T t ,U u)
   2.ToLongBiFUnction<T,U>    long apply (T t ,U u)
   3.ToDOubleFUnction<T,U>    double apply(T t,U u)*/


public class PrimitiveFUcntionDemo {

    public static void main(String[] args) {
//one argument
        Function<Integer,Integer> f = x -> x*x;
        System.out.println(f.apply(6));

        //two argument
        BiFunction<Integer,Integer,Integer> f1 = (x,y) -> x*y*y;
        System.out.println(f1.apply(6,7));

        //intFUnction
        IntFunction<Integer> f2 = x -> x*x;
        System.out.println(f2.apply(4));

        //Long Function
        LongFunction<Long> f3 = x -> x*x;
        System.out.println(f3.apply(3l));

        //double FUnction
        DoubleFunction<Double> f4 = x -> x*x;
        System.out.println(f4.apply(5.5d));


     //***   OutputPrimitives::
        Function<String,Integer> f5 = s->s.length();
        System.out.println(f5.apply("hello"));

        ToIntFunction<String> f6 = s->s.length();
        System.out.println(f6.applyAsInt("abhishekwa"));

          //Both Input and output is primitive ex--intTOLong
    /*    String--as input
          integer as output  */
        Function<String,Integer> f7 = s->s.length();
        System.out.println(f7.apply("helloji"));
        Function<Integer,String> f8 = s-> String.valueOf((s*s));
        System.out.println(f8.apply(7));

        Function<Integer,Double> f9=s->Math.sqrt(s);
        System.out.println(f9.apply(81));


        IntToDoubleFunction f10=i->Math.sqrt(i);
        System.out.println(f10.applyAsDouble(25));
    }
}
