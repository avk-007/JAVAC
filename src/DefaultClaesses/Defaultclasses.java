package DefaultClaesses;

//generate getter and tostring &equals and hashcode

import java.util.Objects;

class Alien{
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }
//to print the values
    @Override
    public String toString() {
        return "Alien{" +
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
        Alien alien = (Alien) o;
        return getId() == alien.getId() && Objects.equals(getName(), alien.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Defaultclasses {
    public static void main(String[] args) {
        Alien alien=new Alien(1,"abhishek");
        Alien alien2=new Alien(1,"abhishek");
        System.out.println(alien.equals(alien2));

    }
}
