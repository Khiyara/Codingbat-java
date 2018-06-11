public class SPlitOdd{
  public boolean solution(int[] nums) {
    return splitOddHelp(0,nums,0,0);
  }
  public boolean splitOddHelp(int start, int[] nums, int target1, int target2){
    if(start==nums.length) return (target1%10==0 && target2%2==1) || (target1%2==1 && target2%10==0);
    if(splitOddHelp(start+1,nums,target1+nums[start],target2)) return true;
    return splitOddHelp(start+1,nums,target1,target2+nums[start]);
  }
}
