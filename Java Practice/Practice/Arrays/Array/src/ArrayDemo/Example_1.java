package ArrayDemo;

class Demo1{
	void demo(){
	int[] age= new int[4];
	
	age [0]= 1;
	age [1]= 2;
	age [2]= 3;
	age [3]= 4;
	
	System.out.println(age.length);

	System.out.println(age [0]);
	System.out.println(age [1]);
	System.out.println(age [2]);
	System.out.println(age [3]);
	}
}
public class Example_1 {
	public static void main(String[]arrgs) {
		Demo1 de= new Demo1();
		de.demo();
		
	}

}
