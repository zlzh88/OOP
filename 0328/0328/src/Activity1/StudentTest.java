package Activity1;

public class StudentTest {

	public static void main(String[] args) {
		Student hyo = new Student("��ȿ��", 100.0, 208104123);
		Student jung = new Student("hyojung", 44.44, 2020104584);
		
		System.out.printf("%s�� ������ : %s%n", hyo.getName(), hyo.getLetterGrade());
		System.out.printf("%s�� ������ : %s%n", hyo.getName(), jung.getLetterGrade());
		System.out.printf("%s�� �й��� : %d%n", hyo.getName(), hyo.getStuNumber());
		System.out.printf("%s�� �й��� : %d%n", jung.getName(), jung.getStuNumber());
	}

}
