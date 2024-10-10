// find the sum of an array element
public class SumOfElementInArray {

	public static void main(String[] args) {
		int n[]= {1, 2, 3, 4, 5};
		int sum=0;
		
/*
		for(int i=0; i<n.length; i++) {
			sum=sum+n[i];
		}
		System.out.println(sum);	

*/
		
		//for each loop
		for(int value:n) {
			sum=sum+value;
		}
		System.out.println(sum);	

	}

}
