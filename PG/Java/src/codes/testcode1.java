package codes;

public class testcode1 {

	public static void main(String[] args) {
		testcode1 x = new testcode1();
		int[] arr = {1, 2, 7, 1};
		System.out.println(x.has271(arr));
	
//		has271([1, 2, 7, 1]) → true
//		has271([1, 2, 8, 1]) → false
//		has271([2, 7, 1]) → true
    }

	public boolean has271(int[] nums) {
		boolean ret = false;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 1] == nums[i] + 5 
				&& nums[i] - 3 <= nums[i + 2] 
				&& nums[i + 2] < nums[i] + 2) {
					return ret = true;
			}
		}
		return ret;
	}
}
