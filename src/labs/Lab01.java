package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
			//Scanner for user input
			Scanner InKey = new Scanner(System.in);
		
			//Asks for user input
			System.out.println("Enter a Positve integer");
			int input1 = InKey.nextInt();
			System.out.println("Enter another Positve integer");
			int input2 = InKey.nextInt();
			
			//Multiplies the first input to the power of the second input
			double power = Math.pow(input1, input2);
			
			System.out.println(input1+"^"+input2+"="+power);
		
	}
	
	
	
	
	public static void problem02() {
		
		//Scanner for user input
		Scanner InKey = new Scanner(System.in);
		
		//Asks for user input
		System.out.println("Enter a Positve integer");
		int input1 = InKey.nextInt();
		
		//Grabs the square root of the number inputted
		double root = Math.sqrt(input1);
		
		System.out.println("The square root of " + input1 + " is "+ root);
		
		
	}

	
	

	public static void problem03() {
		
		//Scanner for user input
		Scanner InKey = new Scanner(System.in);
		
		//Asks for user input on the sides of the triangle
		System.out.println("Enter side A");
		int input1 = InKey.nextInt();
		System.out.println("Enter side B");
		int input2 = InKey.nextInt();
		
		//Grabs the hypotenuse of the triangle
		double hypot = Math.hypot(input1, input2);
		
		System.out.println("Hypotenuse = "+hypot);
		
	}


	
	
	public static void problem04() {
		
		//Scanner for user input
		Scanner InKey = new Scanner(System.in);
		
		//Initializes our variables
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("Enter a Positve integer: ");
		int input1 = InKey.nextInt();
		
		//Sets up loop for grabbing user input till a "0" is entered
		while(input1 != 0) {
			
		
			
			System.out.println("Enter a Positve integer: ");
			input1 = InKey.nextInt();
			System.out.println(input1);
			
			max = Math.max(max, input1);
			min = Math.min(min, input1);
			
			
			
			
		}
		
			
	
			System.out.println("Greatest Number: " + max);
			System.out.println("Lowest Number: " + min);
		
	}
	
	
	
	
	
	
}
