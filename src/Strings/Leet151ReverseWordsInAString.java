package Strings;

public class Leet151ReverseWordsInAString {
  public static void main(String[] args){
    String str = "the sky is blue";
    String result = reverseWordsInAString(str);
    System.out.println(result);
  }
  private static String reverseWordsInAString(String str){
    String[] strArray = str.split(" ");
    StringBuilder reversedString = new StringBuilder();
    for(int i= strArray.length-1;i>=0;i--){
      reversedString.append(strArray[i]);
      reversedString.append(" ");
    }
    return reversedString.toString().trim();
  }
}
