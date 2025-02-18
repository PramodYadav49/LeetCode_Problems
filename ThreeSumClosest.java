import java.util.Arrays;

public class ThreeSumClosest {
    //leetcode problem no 16. 3Sum Closest



    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int res=threeSumClosest(arr, 1);
        System.out.println(res);
    }
    
    static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int n=nums.length, gap=Integer.MAX_VALUE,ans=0;

        for(int i=0;i<n;i++){
            
            int L=i+1;
            int R=n-1;
            while(L<R){
                int curSum=nums[i]+nums[R]+nums[L];
                if(curSum == target){
                    return target;
                }
                else if(curSum <target){
                    L++;
                }
                else{
                    R--;
                }
                int  curGap=Math.abs(curSum-target);
                if(curGap<gap){
                    ans=curSum;
                    gap=curGap;
                }
            }
        }
        return ans;
        
    }
}
