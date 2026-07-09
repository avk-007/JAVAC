package Arrays;

public class MultDimesionalArray  {

    public static void main(String[] args) {
        int nums[][]=new int [3][4];

        //create to Returns the sum of its arguments random
//        nums[i][j]= (int) (Math.random()*10);
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
//instead of the above for loop we can use the enhanced for loop as well
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
            System.out.println();
        }


        //enhanced for loops
        //first write logic in te for loop then use the enhanced  for loop
        for (int n[] : nums){
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
