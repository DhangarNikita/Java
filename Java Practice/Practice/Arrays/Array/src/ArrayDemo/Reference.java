// if we change 2nd array then 1st array also change
package ArrayDemo;
import java.util.Scanner;
public class Reference {
	static void PrintArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");		
		}
	}
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int age[]= new int[n];
		
		System.out.println("Enter elements");
		for(int i=0; i<age.length; i++) {
			age[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		PrintArray(age);
		
		System.out.println();

		int[] age_2=age;
		System.out.println("Dublicate Array:");
		PrintArray(age_2);
		age_2[0]= 0;
		age_2[1]= 0;
		System.out.println();
		
		System.out.println("Change Original Array:");
		PrintArray(age);
		
		System.out.println();
		
		System.out.println("Change Dublicate Array:");
		PrintArray(age_2);
	
	}
}
