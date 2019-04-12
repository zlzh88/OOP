package Activity5;

public class MethodOverload {
	public static void main(String[] args) {
		System.out.printf("int형 7의 제곱은 : %d%n", square(7));
		System.out.printf("double형 7.5의 제곱은 : %f%n", square(7.5));
	}
	
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument : %d%n", intValue);
		return intValue * intValue;
	}
	
	public static double square(double doubleValue) {
		System.out.printf("%nCalld Square with double argument : %f%n", doubleValue);
		return doubleValue * doubleValue;
	}
}
 