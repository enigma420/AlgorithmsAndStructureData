package algorithms.arrays.number_occurring_odd_number_of_times_in_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddTimesNumberInArrayHashing {

    public static List<Integer> getOddTimesElementHashing(int[] arr){
        HashMap<Integer,Integer> elements = new HashMap<>();
        for (int element : arr) {
            if (elements.get(element) == null) elements.put(element, 1);
            else elements.put(element, elements.get(element) + 1);
        }

        List<Integer> listOfOddTimesElements = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : elements.entrySet()){
            if(entry.getValue() % 2 == 1) listOfOddTimesElements.add(entry.getKey());
        }
        if(listOfOddTimesElements.isEmpty()) throw new ArithmeticException("Array don't have odd times elements");
        else return listOfOddTimesElements;
    }

    public static String printElementsFromList(List<Integer> listWithElements){
        StringBuilder listOfElements = new StringBuilder("[ ");
        for(Integer element : listWithElements){
            listOfElements.append(element).append(" ");
        }
        listOfElements.append("]");
        return listOfElements.toString();
    }

    public static void main(String[] args){
        int[] exampleArr = {5,3,3,12,15,85,23,5,9,3,2,8,5};
        List<Integer> result = getOddTimesElementHashing(exampleArr);
        String resultString = printElementsFromList(result);
        System.out.println("Odd Times element: " + resultString);
    }

}
