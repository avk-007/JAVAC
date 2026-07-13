package ENums;


enum Status{

    //fixed or named constants
   Runnning,Failed,Pending,Success;

}
public class Demo {
    public static void main(String[] args) {

;
        Status[] ss=Status.values();
        System.out.println(Status.Runnning);

        //enhanced for loop
        for (Status s:ss){
            System.out.println(s +" " +s.ordinal());
        }
//s.ordinal method will print the constants in order
    }

}
