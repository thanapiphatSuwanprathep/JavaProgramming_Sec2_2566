import java.util.*;
public class lab01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int odd = 0;
		int[] num = new int [7];
		for(int i =0;i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			num[i] = scan.nextInt();
			if(num[i]%2==1) {
				odd++;
			}

		}System.out.println("There are "+odd+" of odd number.");
		System.out.print("List of odd number : ");
		for(int _nums:num) {
			if(_nums%2 != 0) {
				System.out.print(_nums+" ");
			}
		}
		
	}

}
