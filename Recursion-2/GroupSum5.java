public class GroupSum5{
	public boolean solution(int start, int[] nums, int target) {
	  if(start == nums.length) return target==0;
	  if(nums[start]%5==0) {
		if(start < nums.length-1&&nums[start+1]==1){
		  return solution(start+2,nums,target-nums[start]);
		} 
		else{
		  return solution(start+1, nums, target - nums[start]);
		}
	  }
	  if(solution(start+1,nums,target-nums[start])) return true;
	  return solution(start+1,nums,target);
	}
}