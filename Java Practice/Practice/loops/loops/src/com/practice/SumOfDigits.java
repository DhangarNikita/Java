//sum of digits in the given n


package com.practice;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number");
		 int n = sc.nextInt();
		 int sumOfDigits=0;
		 int original_n=n;
		 
		 while (n>0) {
			 sumOfDigits+= n%10;
			 n=n/10;
			 
		 }
		 System.out.println("Sum of digits "+original_n+" = "+sumOfDigits);

		
	}

}
