package WRAPPPER;
/*
----------------------------------
| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| `byte`         | `Byte`  extends to Objects for all      |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |
----------------------------------
* Wrapper classes convert primitive data types into objects.
Autoboxing: Primitive → Wrapper object (automatic).
Unboxing: Wrapper object → Primitive (automatic).
Collections (ArrayList, HashMap, etc.) and Generics work only with objects, so wrapper classes are required.
Wrapper classes provide many utility methods such as parseInt(), valueOf(), max(), min(), and sum().
Wrapper classes are immutable, meaning once an object is created, its value cannot be changed.*/
public class Demo {
    public static void main(String[] args) {
        int num=8;
        //how to store to class or object type
        @Deprecated
        Integer intt=new Integer(8); //boxing
        //or
        Integer intt1=num; //autobxoing

        int num3=intt1; //auto-unboxing
        System.out.println(num3);

        String str="12";
        int num4=Integer.parseInt(str);
        System.out.println(num4*4);



    }
}
