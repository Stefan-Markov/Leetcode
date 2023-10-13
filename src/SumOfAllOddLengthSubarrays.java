public class SumOfAllOddLengthSubarrays {

  public static void main(String[] args) {
    int[] arr = {1, 4, 2, 5, 3};
    int i = sumOddLengthSubarrays(arr);
    System.out.println(i);
  }

  public static int sumOddLengthSubarrays(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      //let count out how many times this index takes part in all subarrays
      int allCount = (arr.length - i) * (i + 1);
      //let count how many odd arrays are inside allCount - just divide allCount by 2 and if allCount was odd, just add 1
      int oddCount = allCount % 2 == 0 ? allCount / 2 : allCount / 2 + 1;
      //let find out the sum of all occurrences of this index in odd arrays and add it to res(ult)
      res += oddCount * arr[i];
    }
    return res;
  }
}
// Brutal force approach
//  public int sumOddLengthSubarrays(int[] arr) {
//        int result = 0;
//
//		// i: j is the range of a sub-array
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j <= arr.length; j += 2) {
//				// iterate over sub-array
//                for (int k = i; k < j; k++) {
//                    result += arr[k];
//                }
//            }
//        }
//
//        return result;
//    }