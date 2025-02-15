import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// leetcode Problem 3Sum problem no 15
public class ThreeSumProblem {
    public static void main(String[] args) {
        int arr[] = {-2, 0, 1, 1, 2};
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list);
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        int n = nums.length;
        if (n < 3) {
            return res;
        }
        for (int i = 0; i < n - 2; i++) { 
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int L = i + 1;
            int R = n - 1;

            while (L < R) {
                int curSum = nums[i] + nums[L] + nums[R];
                if (curSum == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    L++;
                    R--; 

                   
                    while (L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }
                  
                    while (L < R && nums[R] == nums[R + 1]) {
                        R--;
                    }
                } 
                else if (curSum < 0) {
                    L++;
                } 
                else {
                    R--;
                }
            }
        }
        return res;
    }
}
