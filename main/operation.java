package main;

import java.io.*;

public class operation {
	static boolean exists(File dir,String filename) {
		String[] files = dir.list();
		for(String file : files)
			if(file.equals(filename))
				return true;
		return false;
	}
	static void add() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name with extension!");
		String name = br.readLine();
		File dir = new File("/home/maheshranpisein/Desktop/LockStorage/");
		if(exists(dir,name) == true) {
			System.out.println("===============> File already exists");
		}
		File file = new File("/home/maheshranpisein/Desktop/LockStorage/"+name);
		file.createNewFile();
		System.out.println("==============> Enter file name with"+name+" added!");
		
	}
	static void delete() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("=============> Enter file name with Extension!: ");
		String name = br.readLine();
		File dir = new File("/home/maheshranpisein/Desktop/LockStorage/");
		if(exists(dir,name) == true) {
			File file = new File("/home/maheshranpisein/Desktop/LockStorage/"+name);
			file.delete();
			System.out.println("=============> File" +name+ " deleted Successfully!");
	
		}else {
			System.out.println("================> file not found! Make sure its case sensitive!");
		}
	}
	static void search() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("=============> Enter file name to search!: ");
		String value = br.readLine();
		File dir = new File("/home/maheshranpisein/Desktop/LockStorage/");
		File[] searchFile = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith(value);
			}
		});
		if(searchFile.length == 0) {
			System.out.println("============> File not found!!");
		}else {
			System.out.println("========|Searched Files!!|==========");
			for(int i=0; i<searchFile.length; i++) {
				File filename = searchFile[i];
				System.out.println("| "+filename);
			}
			System.out.println("====================================");
		}
	}
	public static void subMenu() throws Exception{
		System.out.println("|==============|FILE OPERATIONS|==============|");
		System.out.println("1. Add File");
		System.out.println("2. Delete File");
		System.out.println("3. Search File");
		System.out.println("4. Back to main menu");
		System.out.println("===============================================");
		System.out.print("Enter Choice: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		int value = 0;
		try {
			value = Integer.parseInt(read);
		}catch(NumberFormatException e){
			System.out.println("||||||||||||Please enter a number|||||||||||");
			subMenu();
		}
		switch(value) {
		case 1:
			add();
			subMenu();
		case 2:
			delete();
			subMenu();	
		case 3:
			search();
			subMenu();
		case 4:
			LockedMe.menu();
			break;
		default:
			System.out.println("|||||||||||||Please select the correct option|||||||||||");
	} 
	}
}
