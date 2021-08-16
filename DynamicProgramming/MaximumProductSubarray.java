public class MaximumProductSubarray{
  public static int maxProduct(int[] nums){
    if(nums == null || nums.length == 0){
      return 0; 
    }
    
    int maxVal = nums[0], minVal = nums[0], res = nums[0];
    for(int i = 1; i < nums.length; i++){
      int temp = maxVal * nums[i];
      maxVal = Math.max(Math.max(nums[i] * maxVal, nums[i] * minVal), nums[i]);
      minVal = Math.min(Math.min(temp, nums[i] * minVal), nums[i]);
      res = Math.max(res, maxVal);
    }
    return res; 
  }
}
