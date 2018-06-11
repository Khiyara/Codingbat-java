public class GroupNoAdj{
	public boolean solution(int start, int[] nums, int target) {
	  if(start >= nums.length) return target==0;
	  if(solution(start+2,nums,target-nums[start])) return true;
	  return solution(start+1,nums,target);
	}
}


