package aaa_UoK_Musanze_May_2024.basic.structure;

import java.io.ObjectOutputStream.PutField;
import java.util.Iterator;
import java.util.Scanner;

public class Basic {
	//Basic structure of a java application
	//This is the main methods to help the application to execute
	public static void main(String[]args) {
		//declaration of variables
		String name="";
		String fname,lname;
		//declaration an initialization
		int age=0;
		int dob,currentyear;
		String status="";
		//call to the scanner object to help us interact with the user input
		Scanner keyboad=new Scanner(System.in);
		System.out.println("What is your first name?");
		//assign user input to a variable declared before
		fname=keyboad.next();
		System.out.println("What is your last name?");
		lname=keyboad.next();
		name=fname+" "+lname;

		System.out.println("What is your year of birth?");
		dob=keyboad.nextInt();

		//initialize the variable declared above
		currentyear=2024;
		age=currentyear-dob;
		if(age<16) {
			System.out.println("You can't be in high school, please try again");
			dob=keyboad.nextInt();
			age=currentyear-dob;
		}
		switch (age) {
		case 20: 
			status="Too young";
			break;
		case 30:
			status="young";
			break;
		case 40:
			status="adult";
			break;
		case 50:
			status="old";
			break;
		case 60:
			status="too old";
			break;
		case 70:
			status="Very old";
			break;
		case 80:
			status="You are suposed to be in the class";
			break;
		default:
			status="We don't know your status";
			throw new IllegalArgumentException("Unexpected value: " + age);
		}
		//declare and initialize marks array
		//int marks[]= {67,80,87,20,67};
		//size of array
		int number_of_subjects=0;
		System.out.println("How many subjects have studied ?");
		number_of_subjects=keyboad.nextInt();
		int marks[]= new int[number_of_subjects];
		//Declaration of the array to hold names of the subjects
		String subjects[]=new String[number_of_subjects];
		for(int i=0;i<=subjects.length-1;i++) {
			System.out.println("Write the name of subject "+(i+1));
			subjects[i]=keyboad.next();
		}
		for (int i=0;i<=marks.length-1;i++) {
			System.out.println("What marks have you got in "+subjects[i]);
			marks[i]=keyboad.nextInt();

		}
		/*
		//initializing array
		System.out.println("What marks have you got in C");
		marks[0]=keyboad.nextInt();
		System.out.println("What marks have you got in Java");
		marks[1]=keyboad.nextInt();
		System.out.println("What marks have you got in OOP");
		marks[2]=keyboad.nextInt();
		System.out.println("What marks have you got in Python");
		marks[3]=keyboad.nextInt();
		System.out.println("What marks have you got in C++");
		marks[4]=keyboad.nextInt();
		 */
		//declare and initialize the char for the classification of student marks
		char letter = 0;
		int average=0;
		//for loop for the calculation of the average and the classification of letters
		//System.out.println(marks.length);
		for(int i=0;i<=marks.length-1;i++) {
			average+=marks[i];
		}
		average=average/marks.length;


		//average=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/marks.length;
		/*if(average>=80)
			letter='A';
		else {
			letter='F';
		}*/
		if(average>=80) {
			letter='A';
		}else if(average<80 && average>=70) {
			letter='B';
		}else if(average<70 && average>=60) {
			letter='C';
		}else if (average<60 && average>=50) {
			letter='D';
		}else {
			letter='F';
		}
		System.out.println("My name is: "+name+" and I am "+age+" years old!\n" + "My average marks is "+average+" my performance in the class is "+letter+"\nYour status is ."+status);
	}
}
