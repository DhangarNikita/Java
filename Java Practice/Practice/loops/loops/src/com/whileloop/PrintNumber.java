// print 1 to 10 number

package com.whileloop;
import java.util.Scanner;
public class PrintNumber {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
        
		int n= sc.nextInt() ;
		 int num = 10;
		
		while(n<= num) {
			System.out.println(n);
			n++;
		}
	}

}
