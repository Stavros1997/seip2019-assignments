package code_analyzer;

import java.util.regex.*;
/***
 * 
 * @author StavrosKar The purpose of this class is to count loc,noc and nom.
 *
 */
public  class analyzer_regex implements Strategy {
	//private static final String REGEX = "\\bcat\\b";
	  // private static final String INPUT = "cat cat cat cattie cat";

	   public int countclass( String[] file ) {//count how many classes the file has
		   int count=0;
		   Pattern p = Pattern.compile("class");
		    Matcher m;
		    for (int i=0; i<file.length; i++) {
		        m = p.matcher(file[i]);
		        if (m.matches()) {
		            
		            count++;
		        }
		    }
		return count;
	   }
	   public int countmethods(String[] file) {//count how many  methods the file has
		   int count=0;
		   Pattern p = Pattern.compile("(public|protected|private|static|\\s) +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])");
		    Matcher m;
		    for (int i=0; i<file.length; i++) {
		        m = p.matcher(file[i]);
		        if (m.matches()) {
		            
		            count++;
		        }
		    }
		return count;
		   
	   }
	   
	   public int countlines(String[] file) { //count how many lines the file has
		   int count=0;
		   Pattern p = Pattern.compile("(\"^((?!//).)*$\"])");
		    Matcher m;
		    for (int i=0; i<file.length; i++) {
		        m = p.matcher(file[i]);
		        if (!m.matches()) {
		            
		            count++;
		        }
		    }
		return count;
		   
	   }
}
	
	
