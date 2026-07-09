package Arrays;

public class Studs {

public static void main(String[] args) {
    int nums[] = new int[4];
    nums[0] = 4;
    nums[1] = 3;
    nums[2] = 7;
    nums[3] = 2;

  /*  for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
    }*/

    //better solution for the Arrays and collection
    //so it will iterate btween all the values and give one value at at one time
    for (int n : nums){
        System.out.println(n);

    }
}
}