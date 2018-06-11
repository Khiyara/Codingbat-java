public class Split53{
  public boolean solution(int[] nums) {
    return splitHelper(0,nums,0,0);
  }
  public boolean splitHelper(int start, int[] nums, int target1, int target2){
    if(start==nums.length) {
      return target1 == target2;
    }
    if(nums[start]%5==0){
      return splitHelper(start+1,nums,target1+nums[start],target2);
    }else if(nums[start]%3==0 && !(nums[start]%5==0)){
      return splitHelper(start+1,nums,target1,target2+nums[start]);
    }
    if(splitHelper(start+1,nums,target1+nums[start],target2)) return true;
    return splitHelper(start+1,nums,target1,target2+nums[start]);
  }
}
