package Session7WithoutLEandNonFunctionalinterface;

import java.util.Comparator;

public class EmployeeNameCompartor implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        Employee e1 = o1;
        Employee e2 = o2;
        return e1.getName().compareTo(e2.getName());
    }
}
