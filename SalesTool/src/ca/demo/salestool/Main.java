package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		dispplayGreeting();
		data.display();
	}

	private static void dispplayGreeting() {
		System.out.println("Hello Happy Sales People!");
		System.out.println("This app shows sales data");
		System.out.println("-------------------------");
		
		System.out.println("New line to print: TEST 1 2 3");
		
	}
}
