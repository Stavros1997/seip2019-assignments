package code_analyzer;

public class Factory {//creates object of analyzers
	public static Strategy  choose_analyzer(String choice) {
		if(choice=="String") {
			return new analyzer_string();
		}else if(choice=="regex") {
			return new analyzer_regex();
		}
		return null;
		
			
	}
}
