package algorithms.arrays.smallest_and_largest_array_value;

public class SmallestAndLargestArrayValue {

    public static int[] findSmallestAndLargestValueInArray(int arr[]){
        int smallest = arr[0];
        int largest = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest) largest = arr[i];
            else if(arr[i] < smallest) smallest = arr[i];
        }
    return new int[]{smallest,largest};
    }

    public static void main(String[] args){
        int[] exampleArray = {2,6,11,12,64,74,128,230,37};
        System.out.println("Largest: " + findSmallestAndLargestValueInArray(exampleArray)[1]
        + "\nSmallest: " + findSmallestAndLargestValueInArray(exampleArray)[0]);
    }
}
