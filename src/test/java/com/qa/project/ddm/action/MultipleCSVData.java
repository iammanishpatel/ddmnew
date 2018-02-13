package com.qa.project.ddm.action;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;
import com.qa.project.ddm.driver.DriverFactory;
//import com.qa.project.ddm.readwrite.ReadWrite;

import pathselector.MultipleCSVDataPath;

public class MultipleCSVData {
	
	public static void translatorSetUp() throws InterruptedException{
		DriverFactory.clickByXpath(MultipleCSVDataPath.requiredLanguageMenuPath);
		System.out.println("Clicked on Language Menu");
		Thread.sleep(500);
		DriverFactory.clickByXpath(MultipleCSVDataPath.requiredLanguagePath);
		System.out.println("Language Selected");
	}
	
	public static void readContent() throws IOException, InterruptedException{
		String output;
		//ReadWrite.Read(path_csvDataSheet);// This will load csv file
		CSVReader reader = new CSVReader(new FileReader(MultipleCSVDataPath.path_csvDataSheet));
		//ReadWrite.Write("newList.csv");
		PrintWriter writer = new PrintWriter(new File("newList.csv"));
		StringBuilder sb = new StringBuilder();
		List<String[]> words = reader.readAll();
		System.out.println("Total row size "+words.size());
		Iterator<String[]> itr = words.iterator();
		while(itr.hasNext()){
			String[] str=itr.next();
			System.out.println("Words to be translated are :");
			for(int i=0;i<str.length;i++){
				 System.out.print(str[i]+" => ");
				 DriverFactory.clearXpath(MultipleCSVDataPath.path_input);
				 DriverFactory.sendKeysByXpath(MultipleCSVDataPath.path_input, str[i]);
				 DriverFactory.clickByXpath(MultipleCSVDataPath.path_translateButton);
				 output = DriverFactory.getTextByXpath(MultipleCSVDataPath.path_output);
				 System.out.println(output);
				 sb.append(output);
				 sb.append(", ");
				 Thread.sleep(500);
			}  	 
		}
		writer.write(sb.toString());
		reader.close();
		System.out.println("Done...");
	}
	
}
