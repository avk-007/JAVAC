package session5;

public class Test implements A,B,C,D{
    @Override
    public void m2() {
        //child has all the details   from all of its parent classes or interfaces..
       D.super.m1();
    }
    //we will get ambiguity
    //how to ovverride ambiguity
}
