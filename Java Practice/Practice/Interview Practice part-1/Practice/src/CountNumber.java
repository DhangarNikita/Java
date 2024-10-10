
public class CountNumber {
	public static void main(String[]arrgs) {
		int n =12345;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
