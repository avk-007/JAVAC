package STreamApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,6,9,2);
   //requirement if even no double it and +2

        int sum=0;
        for (int n: nums){
            //even
            if (n%2==0){
                n=n*2;
                sum=sum+n;
            }
        }
        System.out.println(sum);
    }
}
