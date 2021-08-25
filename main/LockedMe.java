package main;

import java.io.*;

public class LockedMe {
	
	public static void menu() throws Exception{
		System.out.println("============================================================");
		System.out.println("=====| Please select one option from the below. |======");
		System.out.println("============================================================");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|	1. List Files");
		System.out.println("|	2. Add/Delete/Search Operation on File");
		System.out.println("|	3. Close Application");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("============================================================");
		System.out.print("Enter Choice: ");
		String read = br.readLine();
		int value = 0;
		try {
			value = Integer.parseInt(read);
		}catch(NumberFormatException e){
			System.out.println("||||||||||||Please enter a number|||||||||||");
			menu();
		}
		switch(value) {
		case 1:
			display.displayDir();
			menu();
		case 2:
			operation.subMenu();
			break;
		
		case 3:
			System.out.println("+++++++++++CLOSING APPLICATION++++++++++");
			System.exit(0);
		default:
			System.out.println("|||||||||||||Please select the correct option|||||||||||");
	}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("=================================================================================");
		System.out.println("=================================================================================");
		System.out.println("================|	Welcome to LockedMe.com	|================================");
		System.out.println("================|	This application is made by Mahesh Ranpise.	|========");
		System.out.println("=================================================================================");
		menu();

	}

}
