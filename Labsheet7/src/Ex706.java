import javax.swing.JOptionPane;

public class Ex706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexNumber = Integer.parseInt(JOptionPane.showInputDialog("Input index of array : "));
		
		
		
		while(checkIndex(nums,indexNumber)) {
			indexNumber = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again : "));
		}
		int current = currentData(nums,indexNumber);
		JOptionPane.showMessageDialog(null,"Current data,nums["+indexNumber+"]is "+ current+
				((indexNumber-1 < 0)?"\nNo previous data":"\nPrevious data,nums["+(indexNumber-1)+"]is "+ prevData(nums,indexNumber))+
				((indexNumber+1 >= nums.length)?"\nNo next data":"\nNext data,nums["+(indexNumber+1)+"]is "+ nextData(nums,indexNumber)));

	}
	public static boolean checkIndex(int[] number,int index) {
		/* if((index>=number.length)||(index<0)) {
			return true;
		}else {
			return false;
		} */
			return ((index>=number.length)||(index<0))?true:false;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData (int[] nums,int index) {
		return nums[index-1];
	}
	public static int nextData (int[] nums,int index) {
		return nums[index+1];
	}



}
