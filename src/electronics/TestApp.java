package electronics;

public class TestApp {
    public static void main(String[] args) {

      String name = "hello world to java";
//
//      // split - array
//      // reverse each individual word
//      // Store into string result.
//
//      String[] words = name.split(" ");
//
//      String finalString = "";
//      for(String word : words){
//          String reverseWord = reverse(word);
//          finalString = finalString + " " + reverseWord;
//      }
//        System.out.println(finalString);
//    }
//
//    private static String reverse(String word) {
//        if(word.length() == 0){
//            return "";
//        }
//      // return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
//        return reverse(word.substring(1)) + word.charAt(0);


        StringBuilder outpur = new StringBuilder();
        outpur.append(name);
        outpur.reverse();
        System.out.println(outpur);


    }

}
