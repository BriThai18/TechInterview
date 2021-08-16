public class MaximumSubarray{
  public static int maxSubarray(int[] nums){
    int maxCur = nums[0];
    int maxGlobal = nums[0];
   
    for(int i = 1; i < nums.length; i++){
      maxCur = Math.max(nums[i], maxCur + nums[i]);
      maxGlobal = Math.max(maxCur, maxGlobal);
    }
    return maxGlobal; 
  }
}
