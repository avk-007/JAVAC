package MEthodOverrridng;


class A{

    public String show(){
        System.out.println("A show");
        return "";
    }
    public void config(){
        System.out.println("in config");
    }
}
class B extends A{
    @Override
    public String show(){
        //when we want both same methods of parent ana child class
        //wehen we want to resue the method of parent implemenation
        super.show();
        System.out.println("B show");
        return "";
    }

}
public class Demo {
    public static void main(String[] args) {
        B a=new B();
        String show = a.show();
        System.out.println(show );
        a.config();

    }
}
