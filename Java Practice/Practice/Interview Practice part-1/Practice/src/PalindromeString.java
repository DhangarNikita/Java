import java.util.Scanner;

public class PalindromeString {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		String Original_str = str;
		String rev =" ";
		int len = str.length();

		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(Original_str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");

		}
	}

}
