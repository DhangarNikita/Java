//one file contain multiple class

package com.ClassObject;

import java.util.Scanner;

class Student {
	Scanner sc= new Scanner(System.in);
	int RollNo = sc.nextInt();
	String StudentName = sc.next();
}

// main class

public class Example_3 {
	public static void main(String[]arrgs) {
		
		Student s1 = new Student();
		
		//s1.RollNo=10;
		//s1.StudentName ="Nikita";
		System.out.println("name: " +s1.RollNo);
		System.out.println("ROll No: " +s1.StudentName);
		
	}

}
