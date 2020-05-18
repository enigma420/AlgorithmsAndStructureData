package algorithms.string.reverse_string;

public class StringReverse {

    public static String reverse(String wordToReverse){
        String reverseOutput = "";
        for(int i = wordToReverse.length() - 1 ; i >= 0 ; i--){
            reverseOutput += wordToReverse.charAt(i);
        }
        return reverseOutput;
    }

    public static void main(String[] args){
        System.out.println(reverse("JavaIsTheBestLanguageInMyLife"));
    }

}
