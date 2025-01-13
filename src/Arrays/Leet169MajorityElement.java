package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Leet169MajorityElement {
  public static void main(String[] args){
    int[] arr = {2,2,1,1,1,2,2};
    int result = majorityElement(arr);
  }
  private static int majorityElement(int[] nums){
    Map<Integer,Integer> count = new HashMap<>();
    int result;
    for(int num:nums){
      if(count.containsKey(num)){
        count.put(num,count.get(num)+1);
      } else{
        count.put(num,1);
      }
    }

    return 0;
  }
}
