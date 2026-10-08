package Util;
//employee taking from section 11
import Session11withFUnction.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    public static  List<Employee> getEmployeeList(){

        List<Employee> list=new ArrayList<Employee>();
        Employee employee1=new Employee();
        employee1.setEmpId(1);
        employee1.setName("sreenu");
        employee1.setEmpAddress("hyderabad");
        employee1.setSalary(15000);

        Employee employee2=new Employee();
        employee2.setEmpId(2);
        employee2.setName("sumit");
        employee2.setEmpAddress("banglore");
        employee2.setSalary(20000);

        Employee employee3=new Employee();
        employee3.setEmpId(3);
        employee3.setName("karik");
        employee3.setEmpAddress("bhubaneswar");
        employee3.setSalary(30000);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        return list;
    }
}
