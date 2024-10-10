import java.util.Random;

//How to generate random number
public class RandomNumber {
	public static void main(String[]args) {

		Random random = new Random();
		int n=random.nextInt(10);
		System.out.println(n);	

 /*    
    	Random ran =new Random();
		double n=ran.nextDouble();
		System.out.println(n);	
*/
		
		// using math class random method
		//print only decimal number
/*
		System.out.println(Math.random());
*/
		
		
		
		
		
	}

}
