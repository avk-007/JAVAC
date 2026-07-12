package Typecastingupanddown;

// Parent class
class Animal {

    // Parent method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Method overriding
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Child-specific method
    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class TypeCastingExample {

    public static void main(String[] args) {

        // ===========================
        // UPCASTING (Implicit)
        // ===========================

        // Child object is assigned to Parent reference
        Animal animal = new Dog();

        // Calls overridden method in Dog
        animal.sound();

        // animal.fetch(); // ❌ Compile-time error
        // Parent reference cannot access child-specific methods


        // ===========================
        // DOWNCASTING (Explicit)
        // ===========================

        // Parent reference is explicitly converted to Child reference
        Dog dog = (Dog) animal;

        // Child can access both parent and child methods
        dog.sound();
        dog.fetch();
    }
}



/*
output::

Dog barks
Dog barks
Dog is fetching the ball

Dog Object
+----------------------+
| sound() -> Dog       |
| fetch()              |
+----------------------+
         ▲
         │
 Animal animal = new Dog();   ← Upcasting

         │
         ▼
Dog dog = (Dog) animal;       ← Downcasting

*/
