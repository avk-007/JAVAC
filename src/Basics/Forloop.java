package Basics;
//class5
public class Forloop {
    public static void main(String[] args) {
   /*     //initialization // counter
        int i=1;
        //condtion
        while(i<=4)
        {
            System.out.println("hi");
            //increment
            i++;
        }*/

        //write all the above thing in one line which is for loop ,advance version of while loop is for loop
      /*  for(int i=4;i>=1 ;i--)
            System.out.println(" hi " + i);

        //op  hi 4
        // hi 3
        // hi 2
        // hi 1*/

         /*  for(int i=4;i>=1 ;i--)
            System.out.println(" hi " + i);

        //op  hi 4
        // hi 3
        // hi 2
        // hi 1*/

        for(int i=0;i<=4 ;i++)
            System.out.println(" hi " + i);
        //op
        // which is not correct
        // hi 0
        // hi 1
        // hi 2
        // hi 3
        // hi 4

        //above corrected code
       // for(int i=0;i<4 ;i++)


    for(int j=1;j<=5;j++)
            System.out.println("Day " + j);
    for (int k=1;k<=9;k++)
    {
        System.out.println("    " + (k+8) + "-" + (k+9));
    }
}
}