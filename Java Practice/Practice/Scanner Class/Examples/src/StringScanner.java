import java.util.Scanner;
public class StringScanner {

	public static void main(String[]arrg) {
Scanner sc = new Scanner(System.in);

//for one sigle word

	System.out.println("Enter a String");
	String a =sc.next();
	System.out.println("String is: "+a);

	//for char
	
	System.out.println("Enter a String");
    char ch = sc.next().charAt(2);
	System.out.println("2nd char is : "+ch);

	
	//for hole line
	
	System.out.println("Enter a String");
	String str =sc.nextLine();
	System.out.println("String is: "+str);

	
	}
	
}