package generics;

public class CastDriver {

	public static void main(String[] args) {
		
		System.out.println("3! = " + factorial2(3));
		System.out.println("3! = " + factorial(3));
		
		Test<Double> test = new Test<>(3.5);
		
		test.print();
		
		int number = 0;
		print(123);
		print("123");
		print(123.12);
	}
	//A Generic Method that prints the incoming value 
	public static <T> void print(T generic) {
		System.out.println("I recived: " + generic);
	}
	public static int factorial2(int n) {
		if(n < 0) {
			return 
		}else if(n == 1 ) {
			return 1;
		}else {
			return n * factorial2(n-1);			
		}
	}
	public static int factorial(int n){
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result *= i;
		}
		return result;
	}
	//Method that prints the incoming value 
	//It receives 
	/*
	 * public static void print(int number){ System.out.println("I recived: " +
	 * number); } public static void print(String str){
	 * System.out.println("I recived: " + str); } public static void print(Double
	 * doubleNum){ System.out.println("I recived: " + doubleNum); }
	 */
}
