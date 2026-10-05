package Arrays;

public class arrayDemo {
    public static void main(String[] args) {
//create a fixed size array
//multiple values
//  int nums[]={5,6,7,8};
        //to make it dynamic
        int nums[]=new int[4];   //by default all the values are zero

        //you can change the value at index
         nums[0]=2;
         nums[1]=92 ;
         nums[2]=33;
         nums[3]=12;

         for (int i=0;i<4;i++) {

             System.out.println(nums[i]);
         }
    }
}
