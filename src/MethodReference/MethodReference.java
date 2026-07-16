package MethodReference;

import java.util.Arrays;
import java.util.List;

//MethodReference java 8
//syntax className::methodName
public class MethodReference {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("navin","kumar","bharti","bihari");
        List<String> upperCaseNames=names.stream()
                //varibale to method call here
             //   .map(name->name.toUpperCase())

                //method Reference real example

                //syntax className::methodName
                .map(String::toUpperCase)
                .toList();
//or
      /*  for (String upperCaseName : upperCaseNames) {
            System.out.println(upperCaseName);
        }*/
//or used in this example
        upperCaseNames.forEach(System.out::println);
//or
        //System.out.println(upperCaseNames);

    }
}
