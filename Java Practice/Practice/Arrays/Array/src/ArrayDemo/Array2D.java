package ArrayDemo;

class Exammple_2{
	void Amd() {
		int[][]ages = new int[2][3];
		
		ages[0][0]= 5;
		ages[0][1]= 2;
		ages[0][2]= 3;
		
		ages[1][0]= 6;
		ages[1][1]= 7;
		ages[1][2]= 9;
		
		System.out.println(ages.length);
		
		System.out.println(ages[0][0]);
		System.out.println(ages[0][1]);
		System.out.println(ages[0][2]);
		
		System.out.println(ages[1][0]);
		System.out.println(ages[1][1]);
		System.out.println(ages[1][2]);
		}
	}

public class Array2D {
	public static void main(String[]arrgs) {
		Exammple_2 ex = new Exammple_2();
		
		ex.Amd();
	}

}
