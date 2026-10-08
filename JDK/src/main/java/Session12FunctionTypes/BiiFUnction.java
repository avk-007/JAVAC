package Session12FunctionTypes;


import java.util.function.BiFunction;
public class BiiFUnction {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunc = (a,b)->{return a+b;};
        System.out.println(biFunc.apply(1,2));

        //ex2
        //BiFunction<T,U,R>
        BiFunction<Integer,String, Employee> employeeBiFunction= (empId,name)->new Employee(empId,name);

        employeeBiFunction.apply(111,"abhishek");
        System.out.println(employeeBiFunction.apply(111,"abhishek"));
        }
    //or
        // BiFunction<Integer,String, Employee> employeeBiFunction= Employee::new;

    //when i should go for primitives Primitive FUnction interface
    //business logic


    }

