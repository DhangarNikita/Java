// find missing number in an array

public class MissingNumber {

	public static void main(String[] args) {
		int n[]= {1, 3, 4, 5, 6};
		int sum1=0;
		int sum2 =0;
		for(int i=0; i<n.length;i++) {
			sum1=sum1+n[i];
		}
		for(int i=1;i<=6;i++) {
			sum2=sum2+i;
		}
		System.out.println("missing number is: "+(sum2 -  sum1));	

	}

}
