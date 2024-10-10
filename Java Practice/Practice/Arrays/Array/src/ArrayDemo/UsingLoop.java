package ArrayDemo;

class Example_3{
	
	void loop() {
		int age []= new int[4];
		
		age [0]= 1;
		age [1]= 2;
		age [2]= 3;
		age [3]= 4;
		
		/*//for loop
		 
		for(int i=0; i<4;i++) {
			System.out.println(age[i]);
		}
		//for each loop
		 
		for(int abc:age) {
			System.out.println(abc);
		}*/
		
		//while loop
		
		int i=0;
		while(i<4) {
		System.out.println(age[i]);
		i++;
	}
	}
}

public class UsingLoop {
	public static void main(String[]arrgs) {
		Example_3 exp = new Example_3();
		
		exp.loop();
		
	}

}
