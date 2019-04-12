package Activity1;

public class Student {
	private String name;
	private double average;
	private int stuNumber;
	private double beforeGrade;
	
	public Student(String name, double average, int stuNumber) {
		this.name = name;
		if(average > 0.0)
			if(average <=100.0)
				this.average = average;
		this.stuNumber = stuNumber;
	}
	
	public int getStuNumber() {
		return this.stuNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAverage(double studentAverage) {
		if(average > 0.0)
			if(average <= 100.0)
				this.average = studentAverage;
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getLetterGrade() {
		String letterGrade = "";
		if (average >= 90.0)
			 letterGrade = "A";
			else if (average >= 80.0)
			 letterGrade = "B";
			else if (average >= 70.0)
			 letterGrade = "C";
			else if (average >= 60.0)
			 letterGrade = "D(재이수를 하셔야 합니다.)";
			else
			 letterGrade = "F(재이수를 하셔야 합니다.)";
		
		return letterGrade;
	}
	

}
