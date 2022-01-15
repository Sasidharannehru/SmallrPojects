package com.sasi.project.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BugFix {
	public static void main(String[] args) {
        System.out.println("welcome ....here you handle your mobilenumbers");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my mobilenumber",
                "2. I wish to add my mobilenumber",
                "3. I wish to delete my mobilenumber",
                "4. I wish to sort the mobilenumber",
                "5. I wish to search for a particular mobilenumber",
                "6. Close the app"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> mobileNumber = new ArrayList<Integer>();
        mobileNumber.add(+4324654);
        mobileNumber.add(+2300435);
        mobileNumber.add(+4500054);
        mobileNumber.add(+4332000);
        mobileNumber.add(+5445110);
        mobileNumber.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner thescan = new Scanner(System.in);
        int  options =  thescan.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved mobileNumber are listed below: \n");
                        System.out.println(mobileNumber+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your mobileNumber: \n");
                        int value = thescan.nextInt();
                        mobileNumber.add(value);
                        System.out.println("Your value is updated\n");
                        mobileNumber.addAll(arrlist);
                        System.out.println(mobileNumber+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your mobilenumber! \nConfirm again by selecting the same option...\n");
                        int con_choice = thescan.nextInt();
                        if(con_choice==options){
                               mobileNumber.clear();
                            System.out.println(mobileNumber+"\n");
                            System.out.println("All your mobilenumbers are erased!\n");
                        } else {
                            System.out.println("sry..... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(mobileNumber);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(mobileNumber);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the mobilenumber you want to search:\t");
        //
        Scanner thescan = new Scanner(System.in);
        int input = thescan.nextInt();
        //Linear Search
        for(int i=0;i<leng;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the expense " + input + " at " + i + " position");
        	}
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The mobile number should be sorted in ascending order.
        
        Collections.sort(arrayList);
        System.out.println("Sorted mobilenumber: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
       
    }
}
		
	
