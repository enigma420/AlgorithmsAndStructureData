package algorithms.arrays.search_element_in_sorted_and_rotated_array;

public class SearchElementSortedAndRotatedArray {

    public static int findElementRotatedSortedArray(int[] arr,int low,int high,int number){
        int mid;
        while(low <= high){
            mid = low + ((high-low)/2);
            if(arr[mid] == number) return mid;
            if(arr[mid] <= arr[high]){
                /*Right part is sorted*/
                if(number > arr[mid] && number <= arr[high]) low = mid++;
                    else high = mid--;
            }
            else {
                /*Left part is sorted*/
                if(arr[low] <= number && number < arr[mid]) high = mid--;
                else low = mid++;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] exampleArr = {5,3,9,31,12,78,92,7,1,11};
        int index = findElementRotatedSortedArray(exampleArr,0,exampleArr.length-1,92);
        System.out.println("Index of element 92: " + index);
    }

}
