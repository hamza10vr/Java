package myfirstjavaprogram;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World! "); // prints and starts new line
		System.out.print("this is my first java program");
		System.out.print(" ---- seee, it didn't add new line");
		System.out.println("\ncats are robots");
		
		//  Write a program that prints numbers from 0 to 4 inclusive. Each number must be on a new line.
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
        // Add type to these two variables
        int a = 512343;
        int b = 3431231;

        System.out.println("sum of a+b " + a + b);
        
        // automatically assigns the variable type, java11
        var variable = 123456; 

        System.out.println(variable);
		
	}

}
