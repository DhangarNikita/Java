import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev = 0;
//1st method
	/*
		while(n!=0) {
		rev= rev*10+n%10;
		n=n/10;
		}
		System.out.println(rev);
    */
//method 2
	/*
		StringBuffer bc=new StringBuffer(String.valueOf(n));
		StringBuffer rev1 = bc.reverse();
		System.out.println(rev1);
    */
//method 3
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		StringBuilder rev2 = sb.reverse();
		System.out.println(rev2);
	}
}
