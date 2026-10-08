package Session16_unaryAndBinaryOperator;

import java.util.function.*;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        //using Function with 2 arg
        Function<Integer,Integer> f1=i->i*i;
        Integer apply1 = f1.apply(3);
        System.out.println(apply1);

        //using unaryOperator which needed same type input and output arg
        UnaryOperator<Integer> f=i->i*i+1;
        Integer apply = f.apply(5);
        System.out.println(apply);

        IntUnaryOperator  iuo=i->i*i;
        System.out.println(iuo.applyAsInt(7));

        LongUnaryOperator  luo= i->i*i;
        System.out.println(luo.applyAsLong(7l));

        DoubleUnaryOperator duo= i->i*i;
        System.out.println(duo.applyAsDouble(8.0));
    }
}
