package List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicate {
  public static void main(String[] args){
    Integer[] arr = {1,3,3,4,4,5,5,6,6};
    List<Integer> numbers = Arrays.asList(arr);
    int result = countDuplicate(numbers);
    System.out.println(result);
  }
  public static int countDuplicate(List<Integer> numbers){
    int resultCount = 0;
    Map<Integer,Integer> count = new HashMap<Integer, Integer>();
    for(int num:numbers){
      if(count.containsKey(num)){
        count.put(num,count.get(num)+1);
      } else{
        count.put(num,1);
      }
    }

    for(int num: count.values()){
      if(num>1){
        resultCount++;
      }
    }

    return resultCount;
  }
}
