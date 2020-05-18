package algorithms.strings.unique_string;

public class UniqueStringIndexOf {

    public static boolean hasWordGotAllUniqueChars(String word){
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            if(word.indexOf(c) != word.lastIndexOf(c)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("is Unique? => " + hasWordGotAllUniqueChars("homer"));
        System.out.println("is Unique? => " + hasWordGotAllUniqueChars("simson"));
    }

}

