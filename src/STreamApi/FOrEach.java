package STreamApi;

import Arrays.Student;

import java.util.Arrays;
import java.util.List;

public class FOrEach {
    public static void main(String[] args) {


/*
    normal for loop
    List<Integer> nums= Arrays.asList(5,8,9,1,4);
        for (int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }*/
/*//enhanced for loop
        List<Integer> nums= Arrays.asList(5,8,9,1,4);
        for (int n :nums){
            System.out.println(n);
        }*/

        //for each
        List<Integer> nums= Arrays.asList(5,8,9,1,4);
        nums.forEach(n -> System.out.println(n));
    }
}
