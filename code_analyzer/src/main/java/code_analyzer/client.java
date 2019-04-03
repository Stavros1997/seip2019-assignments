package code_analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/***
 * 
 * @author StavrosKar The purpose of this class is to run the programm and take the arguments.
 *
 */
public class client {
	 static Facade facade=new Facade();
	public static void main (String[] args)  {
		String inFile = null;
		if (0 < args.length) {
			inFile = (args[0]);
		}
		try {
			facade.readsourcecode(inFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String analyzer=args[1];
		facade.calculatemetrics(analyzer);
	}
	
		
	
}
