package Session14_PredefinedFInterface_CONSUMER_part2WithSession14;

import Session11withFUnction.Employee;

import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

public class ConsumerPrimitives {
    public static void main(String[] args) {
        //No type cast is required
        IntConsumer c=i-> System.out.println(i*i);
        c.accept(50);

        BiConsumer<Employee, Double> biC = (e, increment) -> System.out.println(e.getSalary() + increment);
        Employee employee1 = new Employee();
        employee1.setEmpId(1);
        employee1.setName("sreenu");
        employee1.setEmpAddress("hyderabad");
        employee1.setSalary(15000);

        biC.accept(employee1, 7000.0);

        /*        for the above we can use  primitive will
         take care of autoboxing unboxing scenarios it will avoid extra typecasting*/
        ObjDoubleConsumer<Employee> objDoubleConsumer=(e, dou)-> System.out.println(e.getSalary()+dou);
        objDoubleConsumer.accept(employee1,7000.0 );
    }
    }

