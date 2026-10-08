package Session7WithoutLEandNonFunctionalinterface;

import java.util.Objects;

//use lombok annotations
//getter setter defaullt comstructors
/*@setter
@gtter
@required
@Data*/
public class Employee {
    private int id;
    private String name;
    private double address;

    public Employee(int id, String name, double address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(address, employee.address) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAddress() {
        return address;
    }

    public void setAddress(double address) {
        this.address = address;
    }

}
