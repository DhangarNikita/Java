
public class SwapNumber {
	public static void main(String[]arrg) {
		int a=10;
		int b=20;
	
// first method using third variable
       
		int temp=0;
		System.out.println("Number before swap: "+"A="+a +" B="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after swap: "+"A="+a +" B="+b);
        
		
//method 2 using +,-
		
		System.out.println("Number before swap: "+"A="+a +" B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swap: "+"A="+a +" B="+b);
		
		
//method 3 using *,/ this method is use when none of the variable is 0.
		
		System.out.println("Number before swap: "+"A="+a +" B="+b);
        a=a*b;
        b=a/b;
        a=a/b;
		System.out.println("Number after swap: "+"A="+a +" B="+b);
        
		
//method 4 using ^ operator
		
		System.out.println("Number before swap: "+"A="+a +" B="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Number after swap: "+"A="+a +" B="+b);
		
		
//method 5 using single statement
		System.out.println("Number before swap: "+"A="+a +" B="+b);
		b=a+b-(a=b);
		System.out.println("Number after swap: "+"A="+a +" B="+b);	
	}
}
