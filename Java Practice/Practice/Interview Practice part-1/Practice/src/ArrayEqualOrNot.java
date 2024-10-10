import java.util.Arrays;

//check 2 array are equal or not

public class ArrayEqualOrNot {
	public static void main(String[]args) {
		
		int n[]= {1, 2, 3, 4, 5, 6};
		int n1[]= {1, 2, 3, 4, 5, 6};
		/*
		boolean status= Arrays.equals(n, n1);
		if(status==true) {
			System.out.println("Arrays are equal...");	
		}else {
			System.out.println("Arrays are not equal...");	
		}
		*/
		
		boolean status =true;
		
		if(n.length==n1.length) {
			for(int i=0; i<n.length;i++) {
				if(n[i]!=n1[i]) {
					status=false;
				}
			}	
		}
		else {
			status= false;	
		}
		if(status==true) {
			System.out.println("Arrays are equal...");	
		}else {
			System.out.println("Arrays are not equal...");	
		}	
	}
}