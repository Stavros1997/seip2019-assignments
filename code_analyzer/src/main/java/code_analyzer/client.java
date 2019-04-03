package code_analyzer;

import java.io.File;
import java.util.Scanner;

public class client {
	 static Facade facade=new Facade();
	public static void main (String[] args) {
		File inFile = null;
		if (0 < args.length) {
			inFile = new File(args[0]);
		}
		facade.readsourcecode(inFile);
		String analyzer=args[1];
		facade.calculatemetrics(analyzer);
	}
	
		
	
}
