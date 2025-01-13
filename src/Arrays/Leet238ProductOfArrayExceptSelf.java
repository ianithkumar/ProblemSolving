package Arrays;

public class Leet238ProductOfArrayExceptSelf {
  public static void main(String[] args){
    int[] arr = {1,2,3,4};                      //result[] = {24,12,8,6};
//    int[] arr = {-1,1,0,-3,3};                      //result[] = {0,0,9,0,0};
    int[] result = productOfArrayExceptSelf(arr);
    for(int num:result){
      System.out.print(num+" ");
    }
  }
  private static int[] productOfArrayExceptSelf(int[] arr){
    int[] result = new int[arr.length];

    for(int i=0;i< arr.length;i++){
      result[i] = 1;
    }

    int left = 1;
    for(int i=0;i<arr.length;i++){
      result[i]*=left;
      left *= arr[i];
    }

    int right = 1;
    for(int i=arr.length-1;i>=0;i--){
      result[i]*=right;
      right *= arr[i];
    }

    return result;
  }
}
