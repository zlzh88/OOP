import java.util.Scanner;

public class ClassActivity04 {

	public static void main(String[] args) {
		int n;
		String tempA, tempB;
		int k;
		
		Scanner sc = new Scanner(System.in);
		
		n = 5;
		//n = sc.nextInt();
		
		int arr[] = {};
		int arr1[] = {9, 20, 28, 18, 11};
		int arr2[] = {30, 1 ,21, 17, 28};
		
		for(int i = 0; i < n; i++) {
			tempA = Integer.toBinaryString(arr1[i]);
			tempB = Integer.toBinaryString(arr2[i]);
			for(int j = 0; j < n; j++) {
				arr[j] = tempA.charAt(j) | tempB.charAt(j);
				
			}
		}

	}

}
