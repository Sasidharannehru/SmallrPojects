package com.sasi.project.com;

import java.util.Scanner;


public class ArthmeticCalculator {
	
	public static void main(String[] args) {
		
		int choice ;
	    double result=0;
		try (Scanner theScane = new Scanner(System.in)) {
			System.out.println("enter the vlues:");
			
			System.out.println("enter your first number:");
			int firstNumber = theScane.nextInt();
			
			System.out.println("enter second number:");
			int SecondNumber= theScane.nextInt();
			
			System.out.println("user the below operation are arthmetic operation\n "+"\n1.Addition\n"
			                   +"\n2.substraction\n"+"\n3.Multiplicatiion\n"+"\n4.devision");
			
			System.out.println("please enter your choice user:");
			 choice = theScane.nextInt();
			
			
			switch( choice)
			
			{
			case 1:
//			 for addition operation
				result= firstNumber+SecondNumber;
				System.out.println("your addition result is :"+result);
				
				break;
			case 2:
				
//	for subtraction operation	
				result= firstNumber-SecondNumber;
				System.out.println("your substraction result is :"+result);
				break;
//			multiplication operation 
			case 3:
				result= firstNumber*SecondNumber;
				System.out.println("your multiplication valuee is: "+result);

				break;
				
//			devision operation
			case 4:
				 float devition=  firstNumber/  SecondNumber;
				System.out.println("your devion result is "+devition);
				default:
					System.out.println("user u enter trhe wrong choice please enter the valied answer ");
			}
		}
		

	}
		
		
	}
	

	
	 


