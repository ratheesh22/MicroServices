package com.cognizant.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileService {
	
	public void hello()
	{
		File file =new File("C:\\Users\\91790\\Documents\ros.txt");
		try {
			Scanner s=new Scanner(file);
			String s1=s.nextLine();
			System.out.println(s1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
