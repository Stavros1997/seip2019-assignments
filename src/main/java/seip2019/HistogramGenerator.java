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

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(new File(args[0]));

		String sCurrentLine;
		String token1;

		ArrayList<String> temps = new ArrayList<String>();
		while (scn.hasNext()) {
			token1 = scn.next();
			temps.add(token1);
		}
	}

	
			public void generateChart(int[] dataValues) {
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
				JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "x_axis title", "y_axis_title",
						dataset, PlotOrientation.VERTICAL, legend, tooltips, urls);

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
	}
}
