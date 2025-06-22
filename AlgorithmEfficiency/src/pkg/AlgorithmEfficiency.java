package pkg;

public class AlgorithmEfficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		
		getTime(1000000);
	}
	public static void getTime(long n) {
		long startTime = System.currentTimeMillis();
		
		long k = 0;
		for( long i = 1; i <= n; i++) {
			k = k + 5;
		}
		
	}

}
