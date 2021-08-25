package main;

import java.io.*;

public class display {
	
	static void displayDir() {
		File dir = new File("/home/maheshranpisein/Desktop/LockStorage/");
		String[] files = dir.list();
		if(files.length == 0) {
			System.out.println("============> Looks like the root directory is empty!");
		}else {
			System.out.println("========|FILES/FOLDER IN DIRECTORY|===============");
			for(int i=0; i<files.length; i++) {
				String filename = files[i];
				System.out.println("| "+filename);
			}
			System.out.println("===================================================");
		}
	}

}
