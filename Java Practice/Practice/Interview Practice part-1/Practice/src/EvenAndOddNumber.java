//print the even and odd number from array

public class EvenAndOddNumber {
	public static void main(String[]args) {
		int n[]= {1, 2, 3, 4, 5, 6};
		
		
		/*
		System.out.println("even numbers are........");
		
		for(int i=0; i<n.length;i++) {
			if(n[i]%2==0) {
				System.out.println(n[i]);	
			}
		}		
System.out.println("Odd numbers are........");
		
		for(int i=0; i<n.length;i++) {
			if(n[i]%2!=0) {
				System.out.println(n[i]);	
			}
	}
	*/
// using enhance method
		System.out.println("even numbers are........");
		for(int val:n) {
			if(val%2==0) {
				System.out.println(val);	
			}
		}
		
		System.out.println("odd numbers are........");
		for(int val:n) {
			if(val%2!=0) {
				System.out.println(val);	
			}
		}
		
	}
}
