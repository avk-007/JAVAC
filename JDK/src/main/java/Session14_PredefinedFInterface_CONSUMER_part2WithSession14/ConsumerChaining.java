package Session14_PredefinedFInterface_CONSUMER_part2WithSession14;

import Session11withFUnction.Employee;
import Util.EmployeeUtil;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {

        Employee emp= new Employee();
        emp.setEmpId(1234);
        emp.setName("abhishek");
        emp.setEmpAddress("blr");
        emp.setSalary(200000);


        Consumer<Employee> c1=e->{System.out.println( emp.getEmpId());};
        Consumer<Employee> c2=e->{System.out.println( emp.getName());};
        Consumer<Employee> c3=e->{System.out.println( emp.getEmpAddress());};
        Consumer<Employee> c4=e->{System.out.println( emp.getSalary());};

        //chaining

        Consumer<Employee> chaining=c1.andThen(c2).andThen(c3).andThen(c4);
        chaining.accept(emp);


    }
}
