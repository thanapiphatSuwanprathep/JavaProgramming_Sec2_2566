
public class ExLab01 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i=0;i<nums.length;i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		System.out.println("using foreach to display value from array nums ");
		int n=0;
		for(int _number:nums) {
			System.out.println("nums["+n+"]="+nums);
			n=n+1;
		}
		printArray(nums);//method no return

	}//end of main()
	public static void printArray(int[] _num) {
		System.out.println("using mrthod to display value from array _num");
		for(int i=0;i<_num.length;i++) {
			System.out.println("nums["+i+"]="+_num[i]);
		}
	}

}
