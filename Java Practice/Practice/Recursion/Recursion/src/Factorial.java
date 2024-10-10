
public class Factorial {
	
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int small=factorial(n-1);
		int ans=n*small;
		return ans;
	}
	

	public static void main(String[] args) {
		factorial(10);
	}

}
