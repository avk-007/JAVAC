package String;

//terms to remember
//mutable--changeable
//immutable--not changeable
//thatswhy we are using String buffer and String builder
public class STrinngBuffer {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abhishek");
        System.out.println(sb);
        //capacity
        System.out.println(sb.capacity());
        //length
        System.out.println(sb.length());
        //abhishekkumar
        System.out.println(sb.append("kumar"));
      //to string
        System.out.println(sb.toString()+ " & "); //abhishekkumar &

        //to delete at index //abhshehellokkumar
        System.out.println(sb.deleteCharAt(3));

        //set
        sb.setLength(5);
        System.out.println(sb.length()+"new setted length");
       //insert
        System.out.println(sb.insert(4,"hello"));

    }
}
//note all the methods are same in string builder as well