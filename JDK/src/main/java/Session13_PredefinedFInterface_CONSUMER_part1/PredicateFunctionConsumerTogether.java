package Session13_PredefinedFInterface_CONSUMER_part1;
import Util.EmployeeUtil;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Session11withFUnction.Employee;

public class PredicateFunctionConsumerTogether {
    public static void main(String[] args) {
//all in one PredicateFunctionConsumerTogether
        List<Employee> emplist= EmployeeUtil.getEmployeeList();
   //predicate>
        Predicate<Employee> p=e->e.getSalary()>20000;

   //function
        Function<Employee,String>  f=e-> {
            //business logic
          if (e.getSalary()>   20000){
            return ":"+"upper post";
        }else if (e.getSalary()==20000){
              return " : "+"employee";
          }else
              return " "+ " " + " : "+ "lower post";
          };
  //consumer
        Consumer<Employee> c=e->{
            System.out.println("employee"+e.getName());
            System.out.println("salary "+e.getSalary());
            System.out.println("address "+e.getEmpAddress());
            System.out.println("id "+e.getEmpId()
            +f.apply(e));
        };
        for (Employee employee : emplist) {
            if (p.test(employee)) {
                c.accept(employee);
            }
        }
    }
}
