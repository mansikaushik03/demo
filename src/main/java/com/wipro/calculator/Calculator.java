package com.wipro.calculator;

import java.util.Scanner;

//Class Name and File Name are same
public class Calculator {
	
	//Entry Point of java program
	public static void main(String args[]) {
		
		//Read the input from keyboard
		//new keyword used to create the object
		Scanner scan=new Scanner(System.in);
		//Variable -Local
		int numberOne,numberTwo;
		System.out.println("enter the number 1");
		numberOne=scan.nextInt();
		System.out.println("enter the number 1");
		numberTwo=scan.nextInt();
		
		int result=numberOne+numberTwo;
		
		System.out.println("Addition of two numbers" + result);
	
		System.out.println("Welcome to Stackroute Program");
		
	}

}
