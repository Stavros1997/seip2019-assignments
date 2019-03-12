package seip2019;

import java.io.File;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HistogramGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File inFile = null;
		if (0 < args.length) {
			inFile = new File(args[0]);
		} else {
			System.err.println("Invalid arguments count:" + args.length);
			BufferedReader br = null;

			try {

				String sCurrentLine;
				

				br = new BufferedReader(new FileReader(inFile));
				Scanner s=new Scanner(inFile);
				while ((sCurrentLine = br.readLine()) != null) {
					int[] array = new int[s.nextInt()];
				}

			}

			catch (IOException e) {
				e.printStackTrace();
			}

			finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		
	}

}
