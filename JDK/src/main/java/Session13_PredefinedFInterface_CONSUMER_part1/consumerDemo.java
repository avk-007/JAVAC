package Session13_PredefinedFInterface_CONSUMER_part1;
import Session11withFUnction.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumerDemo {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<Employee>();

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

        emplist.add(employee1);
        emplist.add(employee2);
        emplist.add(employee3);

        //Requirement Print all emplyoee names
        Consumer<Employee> c=e->
        {
            System.out.println("---- employee Details----");
            System.out.println("emp id"+e.getEmpId());
            System.out.println("emp name"+e.getName());
            System.out.println("emp EmpAddress"+e.getEmpAddress());
            System.out.println("emp salary"+e.getSalary());
        };
       for (Employee employee : emplist){
           c.accept(employee);
       }
    }
}
