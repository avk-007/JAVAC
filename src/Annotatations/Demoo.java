package Annotatations;

class A{
    public void showthedatawhichbelongstothisclass(){
        System.out.println("in show A");
    }
}

class B extends A{
    @Override
    public void showthedatawhichbelongstothisclass(){
        System.out.println("in show B");
    }
}


//metaData
public class Demoo {

    public static void main(String[] args) {
B obj=new B();
obj.showthedatawhichbelongstothisclass();
    }
}
