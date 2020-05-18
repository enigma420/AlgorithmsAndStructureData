package algorithms.string.reverse_string;

public class StringRecursiveReverse {

    public static String recursiveReverse(String wordToReverse){
        if(wordToReverse.length() == 1) return wordToReverse;
        else return wordToReverse.charAt(wordToReverse.length()-1)+recursiveReverse(wordToReverse.substring(0,wordToReverse.length()-1));
    }
    public static void main(String[] args){
        System.out.println(recursiveReverse("JavaIsTheBestLanguageInMyLife"));
    }
}
