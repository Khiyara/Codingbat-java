public class GroupSum6{
	public boolean solution(int start, int[] nums, int target) {
	  if(start == nums.length) return target==0;
	  if(nums[start] == 6) return solution(start+1, nums, target - 6);
	  if(solution(start+1,nums,target-nums[start])) return true;
	  return solution(start+1,nums,target);
	}
}

