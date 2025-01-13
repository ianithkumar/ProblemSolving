package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leet2215FindDifferenceBetweenTwoArray {
  public static void main(String[] a) {
    int[] num1 = {1, 2, 3};
    int[] num2 = {2, 4, 6};
    List<List<Integer>> result = findDifference(num1, num2);
    System.out.println(result);
  }

  private static List<List<Integer>> findDifference(int[] num1, int[] num2) {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    for (int num : num1) {
      set1.add(num);
    }

    Set<Integer> set2 = new HashSet<>();
    for (int num : num2) {
      set2.add(num);
    }
    List<Integer> list1 = new ArrayList<>();

    for (int num : set1) {
      if (!set2.contains(num)) {
        list1.add(num);
      }
    }

    List<Integer> list2 = new ArrayList<>();

    for (int num : set2) {
      if (!set1.contains(num)) {
        list2.add(num);
      }
    }

    result.add(list1);
    result.add(list2);
    return result;
  }
}
