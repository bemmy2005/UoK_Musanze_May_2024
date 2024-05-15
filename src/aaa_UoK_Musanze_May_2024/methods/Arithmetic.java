package aaa_UoK_Musanze_May_2024.methods;

import java.util.Scanner;

public class Arithmetic {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		//variables declaration
		int a,b,add;
		//Scanner input=new Scanner(System.in);
		//System.out.println("Write the first number");
		//Calling the method for displaying the prompt
		display();
		//initializing the variable
		a=input.nextInt();
		//System.out.println("Write the second number");
		//Calling the method for displaying the prompt
		display();
		//initializing the variable
		b=input.nextInt();
		//add=a+b;
		//Displaying the answer
		//System.out.println("The sum is "+add);
		//call the method to display the answer
		summation(a, b);
		summation();

	}
	//The method for displaying the prompt
	static void display() {
		System.out.println("Write the number");
	}
	//parametric method for operations
	static void summation(int a, int b) {
		//int add=a+b;
		System.out.println("The sum is "+(a+b));
	}
	/*
	int summation1(int a, int b) {
		return (a+b);
	}*/

	static void summation() {
		System.out.println("Please write one number(From the method)");
		int a=input.nextInt();
		System.out.println("Please write one number (From the method)");
		int b=input.nextInt();
		System.out.println("The sum is "+(a+b));
	}
	/*
	int summation1() {
		System.out.println("Please write one number(From the method)");
		int a=input.nextInt();
		System.out.println("Please write one number (From the method)");
		int b=input.nextInt();
		
		return (a+b);
	}*/


}
