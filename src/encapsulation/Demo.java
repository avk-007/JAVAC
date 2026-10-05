package encapsulation;

class Human{

    //default constructor
    public Human(){
        System.out.println(" constructor ");
    }
   // paramerterized constructors
    public  Human(String n,int a){
        age=a;
        name=n;
    }
    //instance variable
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//or you can generate getter and setters

    /*public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {

        return name;
    }

    public void setName(String n) {
       name = n;
    }*/
}
public class Demo {
    public static void main(String[] args) {
        Human human=new Human();
        human.setAge(50);
        human.setName("abhishek");
        System.out.println(human.getName()+" : " + human.getAge());

    }
}
