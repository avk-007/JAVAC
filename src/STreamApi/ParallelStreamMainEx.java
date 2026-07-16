package STreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamMainEx {

    public static void main(String[] args) {

        int size = 10_000_000; // Large data to notice the difference

        List<Integer> nums = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 1; i <= size; i++) {
            nums.add(random.nextInt(100));
        }

        // Sequential Stream
        long start1 = System.currentTimeMillis();

        int sum1 = nums.stream()
                .mapToInt(i -> i)
                .sum();

        long end1 = System.currentTimeMillis();

        // Parallel Stream
        long start2 = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .mapToInt(i -> i)
                .sum();

        long end2 = System.currentTimeMillis();

        System.out.println("Sequential Sum : " + sum1);
        System.out.println("Parallel Sum   : " + sum2);

        System.out.println("Sequential Time : " + (end1 - start1) + " ms");
        System.out.println("Parallel Time   : " + (end2 - start2) + " ms");
    }
}

/*
op-->
Sequential Sum : 495158336
Parallel Sum   : 495158336
Sequential Time : 16 ms
Parallel Time   : 30 ms
*/
