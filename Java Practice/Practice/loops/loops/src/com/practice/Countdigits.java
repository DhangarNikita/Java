// Count the number of digits for a given number n

package com.practice;
import java.util.Scanner;
public class Countdigits {
public static void main (String[]arrgs) {
	
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	
	int numberOfDigits =0;
	int original_n =n;
	 while (n>0) {
		 n= n/10;
		 numberOfDigits++;
	 }
	 System.out.println("Number of digits "+original_n+" = "+numberOfDigits);
}
}
