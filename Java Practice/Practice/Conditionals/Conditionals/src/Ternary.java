import java.util.Scanner;
public class Ternary {
	public static void main(String[]arrgs) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		
		/*
		String ans;
		
		ans = (num%2==0)? "Even":"Odd";
		System.out.println(ans);
		*/
		
		
		// write a program to print the value if it is even ansd divisible by 3
		
		if(num %2 ==0&& num%3==0) {
			System.out.println("Number Found "+num);
		}else {
			System.out.println("Invalid number "+num);

		}
		
	}

}
