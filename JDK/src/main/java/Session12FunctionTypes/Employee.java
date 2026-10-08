package Session12FunctionTypes;
import lombok.Data;
@Data
public class Employee {

    private  int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
