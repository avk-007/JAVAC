package ENums;



enum Laptop{
    Macbook(1000),latitude(),xps(899),thinkpad(799);

    private int price;

    Laptop() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Laptop(int price) {
        this.price=price;
    }
}

public class DemoLaptopEx {

    public static void main(String[] args) {

        //cant be used this
      //  Laptop laptop= new Laptop();


        //for each
        for (Laptop lap : Laptop.values()){
            System.out.println(lap+ " " +lap.getPrice());
        }


    }
}
