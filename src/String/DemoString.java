package String;

public class DemoString {

    public static void main(String[] args) {

        //str is variable here or ref variable
        String str=new String("abhishek");
        //hashcode
        System.out.println(str.hashCode() );
        //string concatenate
        System.out.println("hello"+ str );
        //char at particular location i.e --a
        System.out.println(str.charAt(0));
        //concatenate with str
        System.out.println(str.concat(" kumar "));

        //directly
        String name="sumit";
        String name2="sumit";
        System.out.println(name==name2 + "*" );
        //change name
        //in string actually you are not changing the name internally it is because of string pool constant is already there as a same refence address to save memory
        name=name+ " thakur ";
        System.out.println(name);

//terms to remember
        //mutable
        //immutable
        //thatswhy we are using String buffer and String builder




    }
}
