//given number is prime or not
public class PrimeOrNot {
	public static void main(String[] args) {
		int n=3;
		int count = 0;
		
		if(n>1) {
			for(int i =1;i>=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2){
				System.out.println(n+"A prime number");
			}else {
				System.out.println(n+" Not a prime number");
			}
			
		}else {
			System.out.println(n+" Not a prime number");
		}	
		}
}
