package Strings;

import java.util.Stack;

public class DecodeNestedEncodedString {
  public static void main(String[] args) {
    String str = "3[a2[bc]]";                   //result = abcbcabcbcabcbc
    String result = decodeNestedEncodedString(str);
    System.out.println(result);
  }

  public static String decodeNestedEncodedString(String str) {
    Stack<String> stringStack = new Stack<>();
    Stack<Integer> digitStack = new Stack<>();
    int count = 0;
    StringBuilder currentString = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) {
        count = count * 10 + (c - '0');
      } else if (c == '[') {
        digitStack.push(count);
        count = 0;
        stringStack.push(currentString.toString());
        currentString = new StringBuilder();
      } else if (c == ']') {
        StringBuilder decodedString = new StringBuilder();
        decodedString.append(stringStack.pop());
        int loopCount = digitStack.pop();
        for(int i=0;i<loopCount;i++){
           decodedString.append(currentString);
        }
        currentString = decodedString;
      } else {
        currentString.append(c);
      }
    }
    return currentString.toString();
  }
}
