package code_analyzer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/***
 * 
 * @author StavrosKar The purpose of this class is to call factory methods and utility methods.
 *
 */
public class Facade {
	
	
	public static void readsourcecode (String [] file) {
		
		File inFile = null;
		if (0 < file.length) {
			inFile = new File(file[0]);
		}
		utility.readfile(inFile);
	}
	public static void writesourcecode(String [] file) throws IOException {
		utility.writefile(file);
		
	}
	public static void calculatemetrics(String choice) {
		Factory.choose_analyzer(choice);
	}
	
}
