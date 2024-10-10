import java.util.Scanner;

public class PrintNaturalNumber {
	
	static void printIncrement(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		printIncrement(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		printIncrement(n);

	}

}
