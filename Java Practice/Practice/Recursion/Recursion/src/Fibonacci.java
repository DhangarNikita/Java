
public class Fibonacci {

	static int factorial(int n) {
		if(n==0|| n==1) {
			return n;
		}
		int prev=factorial(n-1);
		int prevPrev= factorial(n-2);
		return prev+prevPrev;
	}
	

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(factorial(i));
		}

	}

}