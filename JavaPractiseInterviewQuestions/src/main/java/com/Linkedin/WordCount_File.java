package com.Linkedin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WordCount_File {

	public static void main(String[] args) throws FileNotFoundException {
       File path=new File("src/main/resources/WordCount.txt");
       FileInputStream fis=new FileInputStream(path);
       
	}

}
