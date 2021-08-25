package main;

import java.io.*;
import java.util.*;

public class display {
	
	static void displayDir() {
		File fileDir = new File("/home/maheshranpisein/Desktop/LockStorage/");
		if(fileDir.isDirectory()) {
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("========|FILES/FOLDER IN DIRECTORY|===============");
			for(String s:listFile) {
				System.out.println(s);
			}
			Collections.sort(listFile);
			System.out.println("=========|	In Ascending Order	|============");
			for(String s:listFile) {
				System.out.println(s);
			}
		}
		else {
			System.out.println(fileDir.getAbsolutePath() + "is not present");
		}
	}

}
