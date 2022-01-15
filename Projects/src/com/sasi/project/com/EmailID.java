package com.sasi.project.com;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailID {

	public static void main(String[] args) {
		ArrayList<String > list= new  ArrayList<String>();// create the array list to  store the data 
		
//		add the data to the list as string format
		list.add("employee1@mylearn.com");
		list.add("emplyolee2@mylearn.com");
		list.add("employee3@mylearn.com");
		list.add("employee4@mylearn.com");
try (//	 take the input from the user to search the mail id which was user will entered
		Scanner theScan = new Scanner (System.in)) {
			System.out.println("please enter the email id you want to search:....");
			  String searching = theScan.nextLine(); // take a input as string 
			  boolean Id=list.contains(searching); //   list.contain() use to compare the  list to user input 
			  
			  //this the condition for check the condition contains is true
			  
			  if (Id) {
				  System.out.println("the list contain the bove email ID:....");
				 
					   
				  
				  
			  }
			  else {
				  System.out.println("the list does not contains the email like you enter ");
				  
			  }
		}
		
		
	}

}
