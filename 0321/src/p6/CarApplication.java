package p6;

public class CarApplication {

	public static void main(String[] args) {
		Car morning = new Car("morning", "2019", 100);
		Car sportsCar = new Car("sportsCar", "2020", 1000);
		
		System.out.println(morning.getModel());
		
		
		morning.setPrice(morning.getPrice()*0.95);
		System.out.println(morning.getPrice());
	}

}
