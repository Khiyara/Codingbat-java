public class SplitArray{
	public boolean solution(int[] nums) {
	  return splitArrayHelp(0,nums,0);
	}
	public boolean splitArrayHelp(int start, int[] nums, int target){
	  if(start==nums.length) return target==0;
	  if(splitArrayHelp(start+1,nums,target-nums[start])) return true;
	  return splitArrayHelp(start+1,nums,target+nums[start]);
	}
}