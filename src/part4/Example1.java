package part4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        float median;
        int [] nums1 = new int [2];
        int [] nums2 = new int [1];

        nums1[0] = 1;
        nums1[1] = 3;
        nums2[0] = 2;

        int[] result = Arrays.stream(IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray())
                .sorted().toArray();

        int medianIndex = result.length/2;
        if (result.length % 2 == 0)
            median = (float) (result[medianIndex - 1] + result[medianIndex]) / 2;
        else
            median = result[medianIndex];

        System.out.println(median);
    }
}
