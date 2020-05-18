package algorithms.arrays.missing_number_in_array;

public class MissingNumberInArray {

    public static int missingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int restSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            restSum += arr[i];
        }
        return sum-restSum;
    }

    public static void main(String[] args){
        int[] exampleArr = {1,5,7,4,3,6,2,10,9};
        System.out.println("missing Number: [" + missingNumber(exampleArr) + "]");
        int[] exArr = {1,5,7,8,3,6,2,10,9};
        System.out.println("missing Number: [" + missingNumber(exArr) + "]");

    }

}
