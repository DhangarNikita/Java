//IF condition

import java.util.Scanner;
public class EvenOdd {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" number is even");
		}else {
			System.out.println(n+" Number is odd");
		}
		
	}

}
