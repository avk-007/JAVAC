package Session10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
//predicate with one arguments
//predicate with one or more arguments is BiPredicate

//check from line no  63
public class PredicateStaticMethodIsequals {
    public static void main(String[] args) {

        {

            Predicate<Integer> p1 = i -> i > 10;
            Predicate<Integer> p2 = i -> i % 2 == 0;
            Predicate<String> p3 = i -> i.length() > 11;
            Predicate<Collection> p4 = i -> i.isEmpty();

            List list = new ArrayList();
            list.add("abhishek");
            //System.out.println("is empty" + p4.test(list));
            //test is a method mind this
            //System.out.println(p1.test(11));
            //System.out.println(p2.test(11));
            //System.out.println(p3.test("abhishekkumar"));


            //predicate Joinings
            //System.out.println("predicate joining : negate(),and(),or()");
            int[] x = {10, 20, 30, 40, 50, 60, 70, 80};
            //logic for //predicate Joinings

            //1.get the list whose values are >10
            m1(p1, x);
            //2.get the even no from the list
            //System.out.println("even no");
            m1(p1, x);
            //3. given numbers are not >0
            //reverse condtion will come
            //System.out.println("negate");
            m1(p1.negate(), x);
            m1(p2.negate(), x);

            //System.out.println("and() method");
            //>10 will come as op
            m1(p1.and(p2), x);

            //System.out.println("or() method");
            m1(p1.or(p2), x);

            //predicate joining usecase2
            String[] names = {"sreeutech", "solona"};
            Predicate<String> p5 = s -> s != null && s.length() > 7;
            //enhance for loop
            for (String name : names) {
                if (p5.test(name)) {
                    //System.out.println(name);
                }
            }

            //isEquals static method
            Predicate<String> pname=Predicate.isEqual("abhishek");
            System.out.println(pname.test("abhishek")); //true
            System.out.println(pname.test("abhis")); //false

        }
    }
    public static void m1 (Predicate < Integer > p,int[] x){
        for (int x1 : x) {
            if (p.test(x1)) {
                //System.out.println(x1);
            }
        }
    }

}
