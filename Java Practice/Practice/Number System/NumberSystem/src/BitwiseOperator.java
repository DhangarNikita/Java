
public class BitwiseOperator {
	
	public static void main(String[]arrgs) {
		
		int p =9, q=10;    // 1001   1010
		
		System.out.println(p|q);   // OR  (|) 
		System.out.println(p&q);   // AND (&)
		System.out.println(p^q);   // Exclusive or (^)

		System.out.println(p<< 1);   // p Left Shift by one (<< 1)
		System.out.println(p<< 2);   // p Left Shift by two (<< 2)

		System.out.println(q>> 1);   // q Right Shift by one (>> 1)
		System.out.println(q>> 2);   // q Right Shift by 2 (>> 2)

		
	}

}
