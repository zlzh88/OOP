package p0;

public class PenguinTest {

	public static void main(String[] args) {
		Penguin �Ƿη� = new Penguin(); //�ʰ� ���� Ŭ������ ������ ����� �ϳ� ����! �̶� �� �̸��� �Ƿη�! �۰� ������Ÿ���� Penguin
		//new 00() -> heap�� �ر��� ����. 
		
		�Ƿη�.setHeight(190.5);
		�Ƿη�.setColor("blue");
		�Ƿη�.setHabitat("KOREA");
		�Ƿη�.setKind("�Ƿη���");
		�Ƿη�.setWeight(100);
	
		System.out.println(�Ƿη�.getHeight());
		System.out.println(�Ƿη�.getColor());
		System.out.println(�Ƿη�.getHabitat());
		System.out.println(�Ƿη�.getKind());
		System.out.println(�Ƿη�.getWeight());
		
		
		�Ƿη�.setHeight(2000);
		System.out.println(�Ƿη�.getHeight());

	}

}
