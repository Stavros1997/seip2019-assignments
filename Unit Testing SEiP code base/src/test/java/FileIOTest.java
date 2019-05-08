import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import filehandlers.FileIO;

public class FileIOTest {
	FileIO file=new FileIO();
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void test_filenotfound() {
		String filepath="src/test/resources/test2.txt";
		thrown.expectMessage("File " + filepath + " does not exist");
		file.readFile(filepath);
	}
	
	@Test
	public void test_file_found() {
		Path filepath=Paths.get("src","test","resources","test1.txt");
		int[] linesList =new int[] {1,2,3,4,5};
		Assert.assertArrayEquals(linesList,file.readFile(filepath.toString()) );
		
	}
	@Rule
	public ExpectedException expected = ExpectedException.none();
	@Test
	public void test_invalid_file() {
		String filepath="src/test/resources/test3.txt";
		thrown.expect(NumberFormatException.class);
		file.readFile(filepath);
	}
	
	
	
}
