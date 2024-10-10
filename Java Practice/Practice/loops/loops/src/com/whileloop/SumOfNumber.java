package com.whileloop;
import java.util.Scanner;
public class SumOfNumber {
	public static void main(String[]arrgs) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum =0;
		int num =1;
		while(num<=n) {
			System.out.println(num);
			sum=sum+num;
			num++;
			
		}
		System.out.println(sum);
	}

}
