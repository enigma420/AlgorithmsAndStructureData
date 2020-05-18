package algorithms.strings.unique_string;

public class UniqueStringByUsingAscii {


    public static boolean hasWordGotAllUniqueChars(String word) {
        boolean[] charMap = new boolean[26];

        for (int i = 0; i < word.length() ; i++){
            int asciiCode = (int) word.toUpperCase().charAt(i) - 64;
            if(!charMap[asciiCode]) charMap[asciiCode] = true;
            else return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("is Unique? => " + hasWordGotAllUniqueChars("homer"));
        System.out.println("is Unique? => " + hasWordGotAllUniqueChars("simson"));
    }
}
