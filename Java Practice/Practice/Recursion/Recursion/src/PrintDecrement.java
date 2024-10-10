import java.util.Scanner;

public class PrintDecrement {
	
	static void printIncrement(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		printIncrement(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		printIncrement(n);

	}

}
