//Write a program to get list of all file names from the given folder.(I/O)
package com.file;
import java.io.File;
public class Files {
	public static void main(String[] args) {
		File file = new File("C:/MyFolder/");
		String[] fileList = file.list();
		for (String name:fileList){
			System.out.println(name);
		}
	}
}