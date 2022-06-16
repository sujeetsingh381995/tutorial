package electronics;

public class ReverseString {
    public static void main(String[] args) {
        String name = "sujeet kumar singh";

        String[] words = name.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            reverse(words[i]);
            System.out.print(" ");
        }

    }

    private static void reverse(String word){
        char[] words = word.toCharArray();
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
        }
    }


}
