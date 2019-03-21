package p6;

public class Car {
	String model;
	String year;//string? int??
	double price;//한국판 int하고파ㅠ
	
	public Car(String model, String year, int price) {
		this.model = model;
		this.year = year;
		if(price > 0) {
			this.price = price;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
	
	
}
