package Session7WithoutLEandNonFunctionalinterface;

import java.util.*;
//non functional interface
//withput lambda
public class Demo {
    public static void main(String[] args) {

     {
     /*  List list = new ArrayList();
        list.add(1);list.add(2);list.add(3);
        list.add(4);list.add(4);list.add(4);
        System.out.println(list);*/

        Set set = new HashSet();
        set.add(1);set.add(2);set.add(3);set.add(4);
        set.add(5);set.add(5);
        System.out.println(set.size());

     Map<String ,String> map = new HashMap<String,String>();
     map.put("A","B");
     map.put("C","D");
     map.put("E","F");
        System.out.println(map);

        //Employee Object
        List<Employee> employee =new ArrayList<Employee>();
        employee.add(new Employee(3,"A",555));
        employee.add(new Employee(2,"B",200));
        employee.add(new Employee(1,"C",300));
        employee.add(new Employee(4,"D",666));
        System.out.println("before sorting "+employee);

        //sort the employee based on the emplyee id
      Collections.sort(employee,new EmployeeIdCompartor());
        System.out.println("after sorting based on id"+ employee);


        //sort the employee based on the employee names
        Collections.sort(employee,new EmployeeNameCompartor());
        System.out.println("after sorting based on name "+  employee);

    }
}
}
