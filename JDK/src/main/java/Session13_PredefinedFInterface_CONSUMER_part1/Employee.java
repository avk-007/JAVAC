package Session13_PredefinedFInterface_CONSUMER_part1;
import lombok.Data;

@Data
public class Employee {
    private int empId;
    private String name;
    private String empAddress;
    public Integer salary;

    public Employee(int empId, String name, String empAddress, Integer salary) {
        this.empId = empId;
        this.name = name;
        this.empAddress = empAddress;
        this.salary = salary;
    }
}
