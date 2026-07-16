package Optionall;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//java 8
public class OptionalClassDemo {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("abhishek","sumit","kartix","abhik");
        //if no names has x in it ,optional will provid support to compile the peorgam wihout breaking

//ex1
       //without optional
        String name=names.stream()
                .filter(str->str.contains("x"))
                .findFirst()
                .orElse("not found");
        System.out.println(name);
//ex2
        List<String> namess= Arrays.asList("abhishek","sumit","karti","abhik");
      //  String name=names.stream() instead of Stringuse optional
        Optional name2=namess.stream()
                .filter(str->str.contains("x"))
                .findFirst();
        System.out.println(name2.orElse("Not found"));

    }
}
