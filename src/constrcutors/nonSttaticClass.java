package constrcutors;

class Mobile{
    String brand;
    int price;
    String name;

//cpmstructor
   public Mobile(){
       //default
    }

    //non sttaic method  method
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}


public class nonSttaticClass {

    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.name="iphone";
        mobile.brand="apple";
        mobile.price=5000_00;

        Mobile mobile2=new Mobile();
        mobile2.name="samsungs24";
        mobile2.brand="samsung";
        mobile2.price=6000_00;

//we can change name also
mobile.name="phone";
        mobile.show();
        mobile2.show();
    }
}
/*
///op
apple 500000 phone
samsung 600000 samsungs24*/
