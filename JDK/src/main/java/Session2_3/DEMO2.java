package Session2_3;
@FunctionalInterface
interface AB {
    public void m1();
}

interface B extends AB {
    public void m1();//it is a valid but not a Functional interface
//    public void m2;//it is a valid but not a Functional interface
 //   public void m2(); ///not to be present here so its wrong
}
public class DEMO2 {
}
