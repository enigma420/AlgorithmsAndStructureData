package algorithms.arrays.search_minimum_and_maximum_element_in_sorted_and_rotated_array;

import java.util.Arrays;

public class MinimumElementSortedAndRotatedArray {

    public static int[] findMinimumAndMaximumElementRotatedSortedArray(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }

    public static void main(String[] args){
        int[] exampleArr = {5,72,12,3,91,53,2,17};
        int[] result = findMinimumAndMaximumElementRotatedSortedArray(exampleArr);
        System.out.println("Minimum element in the array: " + result[0]);
        System.out.println("Maximum element in the array: " + result[1]);
    }

}
