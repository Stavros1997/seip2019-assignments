package seip2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class HistogramGenerator {
	public static void main(String[] args) {

		File inFile = null;
		if (0 < args.length) {
			inFile = new File(args[0]);
		}
		generateChart(cfreq(inFile));

	}

	public static int[] cfreq(File f) {
		try {
			Scanner s1 = new Scanner(f);//read the file first time to find out how many grades the file has.
			int n = 0; //the number of lines of the file
			while(s1.hasNextLine()) {
				
				n++; 
				s1.nextLine();
			 }
			 s1.close(); //close the file
			Scanner s2=new Scanner(f); //read the file second time to initialize the array the grades.
			int[] arrayofgrades = new int[n];//the array that contains all the grades
			try{ 
				for (int i = 0; i < arrayofgrades.length; i++) {
					arrayofgrades[i] = s2.nextInt();
						
					}
		int count; // counts the frequency of each grade
		 int [] cf = new int [arrayofgrades.length];  
        int visited = -1;  
        
        for(int i = 0; i < arrayofgrades.length; i++){  
            count = 1;  
            for(int j = i+1; j < arrayofgrades.length; j++){  
                if(arrayofgrades[i] == arrayofgrades[j]){  
                    count++;  
                    //To avoid counting same element again  
                    cf[j] = visited;  
                }  
            }  
            if(cf[i] != visited)  
                cf[i] = count;  
        }  
        int[] fr=new int[11];
        int c=0;
        for(int i = 0; i < cf.length; i++){  
            if(cf[i] != visited) {
            	fr[c]=cf[i];
            	c++;
            }
                  
        }
        return fr;
	}catch (NoSuchElementException e1){
				System.out.print(e1.getMessage());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Exception");
		return null;
	}

	public static void generateChart(int[] dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that can be
		 * visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many series in
		 * one dataset.
		 */
		XYSeries data = new XYSeries("random values");

		/*
		 * Populating the XYSeries data object from the input Integer array values.
		 */
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Grades' Frequency", "frequency", "grade", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the previously
		 * created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}
}
