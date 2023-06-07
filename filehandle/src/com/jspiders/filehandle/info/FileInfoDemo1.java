package com.jspiders.filehandle.info;

import java.io.File;

public class FileInfoDemo1 {
	public static void main(String[]args) {
	 
	File file=new File("D:/WEJA1/Hello.txt");
	if(file.exists()) {
		System.out.println("file name: "+file.getName());
		System.out.println("Absolute path: "+ file.getAbsolutePath());
		System.out.println("can readable: " +file.canRead());
		System.out.println("can writable: " +file.canWrite());
		System.out.println("can executable: " +file.canExecute());
		System.out.println("file length: " +file.length());
	
	}
	else {
		System.out.println("hiii");
	}
	
	}
}
