import java.util.Scanner;

public class classAvtivity01 {

	public static void main(String[] args) {
		// XOR 연산
		// k ^ k = 0
		// 0 ^ k = k
		int x1, y1;
		int x2, y2;
		int x3, y3;
		int x4, y4;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(x1, y1) 입력: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		
	
		System.out.print("(x2, y2) 입력: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();		
		
		System.out.print("(x3, y3) 입력: ");
		x3 = sc.nextInt();
		y3 = sc.nextInt();		
		
		x4 = x1 ^ x2 ^ x3;
	    y4 = y1 ^ y2 ^ y3;
		System.out.print("(x4, y4)는  (" + x4 + ", " + y4 +") 입니다.");
		
	}

}
