package algorithms.strings.anagram_string;

import java.util.Arrays;

public class StringAnagramArraySort {

    public static boolean isAnagram(String word, String anagram){

        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);

        return sortedWord.equals(sortedAnagram);
    }

    public static  String sortChars(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }


    public static void main(String[] args){
        System.out.println("is anagram ? => " + isAnagram("pinkol","linkop"));
        System.out.println("is anagram ? => " + isAnagram("pinkol","linkol"));
        System.out.println("is anagram ? => " + isAnagram("pinkol","linkoln"));

    }

}
