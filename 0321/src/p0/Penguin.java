package p0;

/*----일종의 설계도!! 붕어빵 틀!---*/
public class Penguin {
	
	/*
	# 객체 = 속성 + 연산
	# 몇 가지 속성 나열 -> 추상화과정
	# ex.팽귄의 숙성 -> height, 색깔, 종류, 몸무게, 서식지 등등
	*/
	
	/*---------속성---------*/
	double height;
	String color;
	String kind;
	double weight;
	String habitat;
	
	/*----------메소드--------*/

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	

	
	
}
