package com.Methods;
class Example{
	int a;
	int b;
	Example(int x,int Y){
		a=x;
		b=Y;
	}
	int sum() {
		return a+b;
		
	}
	int sub() {
		return a-b;
	}
	int mul() {
		return a*b;
	}
}
public class ParameterizeConstructor {
	public static void main(String[]arrgs) {
		Example ex =new Example(5, 7);
		
       System.out.println(ex.sum());
       System.out.println(ex.sub());
       System.out.print(ex.mul());

	}
}
