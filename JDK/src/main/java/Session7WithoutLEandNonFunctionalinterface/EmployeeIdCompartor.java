package Session7WithoutLEandNonFunctionalinterface;

import java.util.Comparator;
public class EmployeeIdCompartor implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        if (e1.getId() == e2.getId()) {
            return 0;
        }else if (e1.getId() > e2.getId()) {
            return 1;
        }else
            return -1;
    }

}
