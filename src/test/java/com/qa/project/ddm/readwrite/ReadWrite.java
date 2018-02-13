package com.qa.project.ddm.readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import com.opencsv.CSVReader;

public class ReadWrite {
	public static void Read(String filePath) throws FileNotFoundException{
		CSVReader reader = new CSVReader(new FileReader(filePath));// This will load csv file
	}
	
	public static void Write(String fileName) throws FileNotFoundException{
		PrintWriter writer = new PrintWriter(new File("fileName"));
	}
	
}
