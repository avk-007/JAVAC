package Session11withFUnction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*Ques..can we use both   Predicate and FUnction??
ans--yes*/
public class PredciateFunctionDemoo {
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

        //required whose salary is greater than 10000
        //wherever condtion is there use Predicate

        Predicate<Employee> p=e->e.getSalary()<20000;
  /*      for (Employee e:emplist){
            System.out.println(p.test(e));
        } //op true false because of test method which return boolean
*/
    //add extra salary +8000
        Function<Employee,Employee> f=e->{e.salary=e.getSalary()+5000;
                                                    return e;
                                                   };
        List<Employee> emplist2= new ArrayList<>();
        for (Employee e:emplist){
            if (p.test(e)){
               f.apply(e);
               emplist2.add(e);
            }
        }
        System.out.println("new salary based on the condtion"+emplist2);
    }
}
