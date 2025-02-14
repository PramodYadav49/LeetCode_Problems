class Solution {

public static void main(String[] args){
  int arr[]={-4,-1,0,3,10};
  int []res=sortedSquares(arr);
  System.out.println(Arrays.toString(res));


}

  static  int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int l = 0;
        int r = arr.length - 1;
        int i = arr.length - 1;
        while (l <= r) {
            int lr = nums[l] * nums[l];
            int rr = nums[r] * nums[r];
            if (lr > rr) {
                arr[i] = lr;
                l++;
                i--;
            } else {
                arr[i] = rr;
                r--;
                i--;
            }
        }
        return arr;

    }

}
