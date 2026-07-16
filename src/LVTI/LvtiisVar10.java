package LVTI;

import constrcutors.A;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

//Local variable type inference
//Var keyword

//var num=10; error
//var cannot be used as class name
public class LvtiisVar10 {
    public static void main(String[] args) {
        //var is only applicable fo rocal variables

        int a = 8;
        var b = 9;

        int c;
        //it is necessary to assign a value in var
        var d = 11;

        int nums[] = new int[10];
        //can also be declared as in arrays
        var num = new int[6];


        //on class (object of ALien)

        var obj = new Alien();
    }
}
