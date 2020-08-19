package nats;

public class Factorial {

	public static int compute(int n) {
		if(n<2) {
			return 1;
		}
		return n * compute(n-1);
	}
	
	public static boolean even(int n) {
		if (n % 2 == 0)
			return true;
		else 
			return false;
	}

}
