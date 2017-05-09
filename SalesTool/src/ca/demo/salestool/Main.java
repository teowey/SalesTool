package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		dispplayGreeting();
		data.display();
	}

	private static void dispplayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("New line to print: TEST 1 2 3");
	}
}
