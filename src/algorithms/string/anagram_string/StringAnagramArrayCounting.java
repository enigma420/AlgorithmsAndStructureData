package algorithms.string.anagram_string;

public class StringAnagramArrayCounting {

public static boolean isAnagram(String word,String anagram){
    if(word.length() != anagram.length()) return false;
    int count[] = new int[256];
    for(int i = 0 ; i<word.length() ; i++){
        count[word.charAt(i)]++;
        count[anagram.charAt(i)]--;
    }
    for(int i = 0 ; i < 256; i++){
        if(count[i] != 0) return false;
    }
return true;
}


public static void main(String[] args){
    System.out.println("is anagram? => " + isAnagram("likier","kieril"));
}

}
