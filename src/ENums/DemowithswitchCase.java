package ENums;
//with switch case

import Basics.Swithch;

enum StatusGiven{
    //fixed or named constants
   Runnning,Failed,Pending,Success;

}
public class DemowithswitchCase {
    public static void main(String[] args) {

        Status stat = Status.Runnning;
        switch(stat){
            case Runnning :
                System.out.println("good");
           break;
            case Failed :
                System.out.println("failed");
                break;
            case Success:
                System.out.println("succes");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                break;
        }
       /* if (stat==Status.Runnning)
            System.out.println("All good");
        else if (stat==Status.Failed) {
            System.out.println("Not All good");

        } else if (stat==Status.Pending) {
            System.out.println("proesccing");
        } else if (stat==Status.Success) {
            System.out.println("success");
        }
        else
            System.out.println("Done");*/
    }

}
