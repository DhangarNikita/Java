//find the factorial of a number
public class Factorial {
	public static void main(String[]args) {
		int n =5;
		int fact =1;
		
		//1*2*3*4*5
		
		/*for(int i=1; i<=5;i++) {
			fact= fact*i;
		}
		System.out.println(fact);	*/
		
		
		
		
		
		//5*4*3*2*1
		
		for(int i =n;i>=1;i--) {
			fact =fact*i;
		}
		System.out.println(fact);	


	}

}

