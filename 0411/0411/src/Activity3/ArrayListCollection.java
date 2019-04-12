package Activity3;

import java.util.ArrayList;

public class ArrayListCollection {
	/*
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red");
		items.add(0, "yellow");
		
		System.out.print("Display list contents with counter-controlled loop: ");
		
		for(int i = 0; i < items.size(); i++) {
			System.out.printf(" %s", items.get(i));
		}
		
		display(items, "%nDisplay list contents with enhanced for statement: ");
		items.add("green");
		items.add("yellow");
		display(items, "List with two new elements: ");
		
		items.remove("yellow");
		display(items, "Remove first instance of yellow");
		
		items.remove(1);
		display(items, "Remove second list element (green): ");
		
		System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");
		System.out.printf("Size: %s%n", items.size());
	}
	*/
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("빨");
		items.add("주");
		items.add("노");
		items.add("초");
		items.add("파");
		items.add("남");
		items.add("보");

		System.out.print("일곱가지 색을 보여줘!:");
		
		for(int i = 0; i < items.size(); i++) {
			System.out.printf(" %s", items.get(i));
		}
		
		
		System.out.printf("%n\"노란색\" 은 리스트에 %s%n", items.contains("노") ? "있다" : "없다");
	
	}
	
	public static void display(ArrayList<String> items, String header) {
		System.out.printf(header);
		for (String item : items) {
			System.out.printf("%s", item);
		}
		System.out.println();
	}
}
