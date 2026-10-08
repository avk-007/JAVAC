package Session19_MiniProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MiniProject {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Abhishek", 50000.0));
        employees.add(new Employee(102, "Rahul", 65000.0));
        employees.add(new Employee(103, "Kartik", 70000.0));
        employees.add(new Employee(104, "Priya", 55000.0));
        employees.add(new Employee(105, "Neha", 60000.0));
        employees.add(new Employee(106, "Amit", 80000.0));
        employees.add(new Employee(107, "Rohit", 75000.0));

        //display employee names greater than 7000
        employees.stream()
                .filter(employee -> employee.getSalary() > 60000)
                .forEach(employee -> System.out.println(employee));

        //count whose salary is greater than 70000
        System.out.println(employees.stream()
                .filter(employee -> employee.getSalary() > 65000)
                .count());

        //employee name  having highest salary

        Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(max.get().getEname());
        //or we can use
        Optional<String> maxName = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getEname);
        maxName.ifPresent(System.out::println);

        //emp name salary lowest
        Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println(min.get().getEname());

        //emp details in descenning order based on the salary
        //With method reference
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        //with LE
        employees.stream().sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach(x-> System.out.println(x));
    }
}
