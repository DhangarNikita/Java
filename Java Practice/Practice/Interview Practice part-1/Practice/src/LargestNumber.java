import java.util.Scanner;

public class LargestNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		System.out.println("Enter a number");
		int b = sc.nextInt();
		
		System.out.println("Enter a number");
		int c = sc.nextInt();
		
//1st method
 /*
		if(a>b&&a>c) {
			System.out.println("Largest number is "+a);
		}else if(b>a&&b>c) 
		{
		System.out.println("Largest number is "+b);
		}else
			 {
				System.out.println("Largest number is "+c);
			}
 */
		
//method 2nd
	/*	
		int large1=a>b?a:b;
		int large2=c>large1?c:large1;
		System.out.println("Largest number is "+large2);
  */
		
		// or single statement
		int large=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest number is "+large);

	}
}
