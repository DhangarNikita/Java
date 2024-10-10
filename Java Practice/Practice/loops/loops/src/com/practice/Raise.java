//given 2 number a and b find a raise to the power b

package com.practice;

import java.util.Scanner;

public class Raise {
		public static void main(String[]arrgs) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("Enter number");
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 
			 int ans =1;
			 for(int i=1;i<=b;i++) {
				 ans=ans*a;
			 }
			 System.out.println(ans);

}
}