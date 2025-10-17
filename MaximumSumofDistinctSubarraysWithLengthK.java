class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        long currSum=0;
        long maxSum=0;
        int left=0;
        for(int right=0;right < nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum+=nums[right];
            if(right -left +1 > k){
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }
            if(right - left+1 == k){
                maxSum=Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}
