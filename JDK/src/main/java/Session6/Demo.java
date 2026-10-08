package Session6;

public class Demo implements staticMethodDemo {
    public static void main(String[] args) {
        {
            // static methods will not inherit into impl classes ,so if we want to call staticMethods we need to call direcly from classname
            //.overriding concepts are not applicable of interface static methods .
            //we can write main method inside interface because it suppports static methods
            staticMethodDemo.m1();
        }
    }
}