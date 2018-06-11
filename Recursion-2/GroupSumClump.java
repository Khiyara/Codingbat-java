public class GroupSumClump{
	public boolean solution(int start, int[] nums, int target) {
	  if(start==nums.length) return target==0;
	  if((start<nums.length-1 && nums[start] == nums[start+1])){
		if(solution(start+1,nums,target)) return true;
		return solution(start+1,nums,target-nums[start]-nums[start+1]);
	  }
	  if(start > 0 && nums[start] == nums[start-1]){
		if(solution(start+1,nums,target-nums[start]-nums[start-1])) return true;
		return solution(start+1,nums,target);
	  }
	  if(solution(start+1,nums,target-nums[start])) return true;
	  return solution(start+1,nums,target);
	}
}