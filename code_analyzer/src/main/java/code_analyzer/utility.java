package code_analyzer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/***
 * 
 * @author StavrosKar The purpose of this class is to read a file and write in a file.
 *
 */
public class utility {
	public static String[] readfile(File f) {
		try {
			Scanner s1 = new Scanner(f);//read the file first time to find out how many lines the file has.
			int n = 0; //the number of lines of the file
			while(s1.hasNextLine()) {
				n++; 
				s1.nextLine();
			 }
			 s1.close(); //close the file
			Scanner s2=new Scanner(f); //read the file second time 
			String[] arrayofcode = new String[n];//the array that contains all the lines
			try{ 
				for (int i = 0; i < arrayofcode.length; i++) {
					arrayofcode[i] = s2.nextLine();
						
					}
			}catch (NoSuchElementException e1){
				System.out.print(e1.getMessage());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Exception");
		return null;
	}
	
	public static void writefile(String[] file,int counter) 
			  throws IOException {
			    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			    writer.write(counter);
			     
			    writer.close();
			}
}

