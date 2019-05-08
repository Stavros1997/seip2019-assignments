package code_analyzer;
/***
 * 
 * @author StavrosKar The purpose of this class is to create object of analyzers.
 *
 */
public class Factory {
	public static Strategy  choose_analyzer(String choice) {
		if(choice=="String") {
			return new analyzer_string();
		}else if(choice=="regex") {
			return new analyzer_regex();
		}
		return null;
		
			
	}
}
