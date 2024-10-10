package com.whileloop;
import java.util.Scanner;
public class Sream {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int n = sc.nextInt();
		int sum=0;
		
		
		while(n!=1) {
			sum=sum+n;
			n=sc.nextInt();	
		}
		System.out.println(sum);


	}

}
