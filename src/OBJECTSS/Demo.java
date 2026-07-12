package OBJECTSS;

import java.util.Objects;

class Laptop
{
    String name;
     String brand;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(name, laptop.name) && Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price);
    }

}

public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
      laptop.brand="apple";
      laptop.price=5000;
        laptop.name="m2pro";
/*        System.out.println(
                laptop.brand +" " +
                laptop.price +" "+
                laptop.name);*/
        System.out.println(laptop.toString());

    }
}
