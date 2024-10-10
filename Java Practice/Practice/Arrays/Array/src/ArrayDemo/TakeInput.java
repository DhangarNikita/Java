package ArrayDemo;
import java.util.Scanner;
public class TakeInput {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int age[]=new int[n];
		
		System.out.println("Enter the element");
		for(int i=0; i<age.length; i++) {
			age[i]=sc.nextInt();
		}
		
		for(int i=0; i<age.length; i++) {
			System.out.print(age[i] +" ");
		}
	}

}
