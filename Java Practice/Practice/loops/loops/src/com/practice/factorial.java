// factorial of number

package com.practice;

import java.util.Scanner;

public class factorial {
		public static void main(String[]arrgs) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("Enter number");
			 int n = sc.nextInt();
			 
			 int fact =1;
			 for(int i=1;i<=n;i++) {
				 fact =fact*1;
			 System.out.println("factorial of"+i+":"+fact);
			 }

}
}