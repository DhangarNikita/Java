// IF-ELSE Condition

import java.util.Scanner;
public class AgeGroup {
	public static void main(String[] arrgs) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Age");
		
		int age = sc.nextInt();
		
		if (age <=12) {
			System.out.println("Enter Age is child");
		}else if (age>12 && age<18) {
			System.out.println("Enter Age is teenager");

		}else if(age >18){
			System.out.println("Enter Age is adult");

		}
	}

}


//

