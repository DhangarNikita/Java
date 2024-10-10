//palindrome means when we rwvwrsr the the number we get original number
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]arrgs) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = sc.nextInt();
	int original_num =n;
	int rev=0;
	
	while(n!=0) {
		rev = rev*10+ n%10;
		n= n/10;
	}
	if(original_num==rev) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
	}
}
