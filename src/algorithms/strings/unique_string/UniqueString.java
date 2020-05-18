package algorithms.strings.unique_string;

import java.util.HashSet;

public class UniqueString {

    public static boolean hasWordGotAllUniqueChars(String word){
        HashSet set = new HashSet();

        for(int i = 0 ; i < word.length(); i++){
            char c = word.charAt(i);
            if(!set.add(c)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.printf("is Unique? => " + hasWordGotAllUniqueChars("homer"));
        System.out.printf("is Unique? => " + hasWordGotAllUniqueChars("simson"));
    }
}
