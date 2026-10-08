package Session16_unaryAndBinaryOperator;

import java.util.function.*;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BiFunction<String,String,String> bf=(s1, s2)->s1.concat(s2);
        System.out.println(bf.apply("BiFunction","world"));

        BinaryOperator<String> f1=(s1, s2)->s1.concat(s2);
        String apply = f1.apply("BinaryOperator", "itIS");
        System.out.println(apply);

        //example of primitive BinaryOperator

        IntBinaryOperator f2=(e1,e2)->e1*e2;
        System.out.println(f2.applyAsInt(5,7));

        DoubleBinaryOperator f3=(e1,e2)->e1*e2;
        System.out.println(f3.applyAsDouble(3d,4d));

        LongBinaryOperator f4=(e1, e2)->e1*e2;
        System.out.println(f4.applyAsLong(5l,7l));




    }
}
