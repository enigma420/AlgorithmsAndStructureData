package algorithms.string.reverse_string;

public class StringBufferReverse {

    public static String reverse(String wordToReverse){
        StringBuffer sb = new StringBuffer(wordToReverse);
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(reverse("JavaIsTheBestLanguageInMyLife"));
    }

}
