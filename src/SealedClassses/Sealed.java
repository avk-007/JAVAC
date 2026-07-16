package SealedClassses;

//sealed--only the classes listed iis permit can ex tend it
//final nobody canextend it
//non sealed --any classes can extend it
sealed class A extends Thread implements Cloneable permits B,C{

}

non-sealed class B extends A{

}

final class  C extends A{

}

class D{

}


sealed interface X permits Y{

}

non-sealed interface Y extends X{

}
public class Sealed {
    public static void main(String[] args) {
    }
}
