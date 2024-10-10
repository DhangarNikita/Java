package ArrayDemo;
import java.util.Arrays;
import java.util.Scanner;

public class CopyMethodes {
	static void copy(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");		
		}
	}
		public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int student[]= new int[n];
		
		System.out.println("Enter elements");
		for(int i=0; i<student.length; i++) {
			student[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		copy(student);
		
		System.out.println();
		
		//int[]student_2 = student.clone();
		//int[]student_2 = Arrays.copyOf(student, student.length);
		int[] student_2 = Arrays.copyOfRange(student, 1, 4);
		
		System.out.println("Dublicate Array:");
		copy(student_2);
		
		student_2[0]= 0;
		student_2[1]= 0;
		System.out.println();
		
		System.out.println("Change Original Array:");
		copy(student);
		
		System.out.println();
		
		System.out.println("Change Dublicate Array:");
		copy(student_2);
	}
}
