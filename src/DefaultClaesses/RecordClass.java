package DefaultClaesses;

//data carrier class is record class
//generate getter and tostring &equals and hashcode

/*import java.util.Objects;

class Alienn{
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }
    //to print the values
    @Override
    public String toString() {
        return "Alienn{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alienn Alienn = (Alienn) o;
        return getId() == Alienn.getId() && Objects.equals(getName(), Alienn.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    Alienn(int id, String name) {
        this.id = id;
        this.name = name;
    }
}*/

//all these line can be written in one line of code i,e with recored
//all variable in record is final
//record is to create to carry data
record Alienn(int id,String name){
    //canonical consctructor
    //compact constrctuir
}
public class RecordClass {
    public static void main(String[] args) {
        Alienn Alienn=new Alienn(1,"abhishek");
        Alienn Alienn2=new Alienn(1,"abhishek");
        System.out.println(Alienn.equals(Alienn2));
        System.out.println(Alienn.name());
    }
}
