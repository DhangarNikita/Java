import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int temp=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println(n+" prime no");
		} else {
			System.out.println(n+" Not prime no");
		}
	}
}


