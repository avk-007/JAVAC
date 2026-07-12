package AbstractMethod;

abstract class Car {
    //abstract method can have any methods
    public abstract void drive();
    public abstract void fly();

    public void playmusic() {
        System.out.println("music is playing");
    }

}

class Wagonr extends Car{

        public  void drive(){
            System.out.println("drivving wagonr");

        }

    @Override
    public void fly() {
        System.out.println("flly");
    }
}


public class Demo {
    public static void main(String[] args) {
    Car car=new Wagonr();
    car.drive();
    car.fly();

    }
}
/*Rules of Abstract Class
An abstract class is declared using the abstract keyword.
You cannot create an object of an abstract class.
It can contain abstract methods and concrete methods.
It can have constructors.
It can have instance variables and static methods.
A child class must implement all abstract methods, unless the child class is also declared abstract.
-----------------------
Rules of Abstract Method
Declared with the abstract keyword.
Has no method body.
Must be inside an abstract class (or an interface).
Must be overridden by the first concrete subclass.*/