package code_analyzer;

import java.util.List;
import java.io.File;
import java.util.Arrays;

public 
class analyzer_string implements Strategy {
	public int countclass(String[] file) { //count how many classes the file has
		int count=0;
		// Convert String Array to List
        List <String> list = Arrays.asList(file);
        for(int i=0;i<list.size();i++) {
        if(list.contains("class")){
            count++;
        }
        }
        return count;
	
    
}
	public  int countnumberoflines(String [] file) { //count how many lines the file has
		int count=0;
		// Convert String Array to List
        List <String> list = Arrays.asList(file);
        for(int k=0;k<list.size();k++) {
        	count++;
        }
	return count;
	}
	public int countmethods(String[] file) { //count how many methods the file has
		int count=0;
		// Convert String Array to List
        List <String> list = Arrays.asList(file);
        for(int i=0;i<list.size();i++) {
        if(list.contains("public"))
            count++;
        }
        
        return count;
	
    
}
	
	
}
