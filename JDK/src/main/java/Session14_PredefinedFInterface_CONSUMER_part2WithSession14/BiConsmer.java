package Session14_PredefinedFInterface_CONSUMER_part2WithSession14;

import Session11withFUnction.Employee;
import Util.EmployeeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;

public class BiConsmer {
    public static void main(String[] args) {

        List<Employee> empList = EmployeeUtil.getEmployeeList();
        BiConsumer<Employee, Double> c =//lE
                (e, increment) -> System.out.println(e.getSalary() + increment);
        for (Employee e : empList) {
            c.accept(e, 7000.0);
        }

        BiConsumer<Employee, Double> biC = (e, increment) -> System.out.println(e.getSalary() + increment);

        Employee employee1 = new Employee();
        employee1.setEmpId(1);
        employee1.setName("sreenu");
        employee1.setEmpAddress("hyderabad");
        employee1.setSalary(15000);

        biC.accept(employee1, 7000.0);

    }
}

