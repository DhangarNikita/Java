import java.util.Scanner;
public class Example {
	/*public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String s=sc.nextLine();
		System.out.println("enter name is" +" "+s);

	}*/
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		char c=sc.nextLine().charAt(3);
		System.out.println(c);
	}

}