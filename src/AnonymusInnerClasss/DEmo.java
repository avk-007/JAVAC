package AnonymusInnerClasss;


class A{
    public void show(){
        System.out.println("in A show");
    }
}
public class DEmo {
    public static void main(String[] args) {

        A a=new A(){
            public void show(){
                System.out.println("in new innerclass annomynous    Show");
            }
        };
        a.show();



    }
}
