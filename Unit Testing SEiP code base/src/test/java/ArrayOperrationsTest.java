import static org.mockito.Mockito.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

import filehandlers.FileIO;
import operations.ArrayOperrations;
import operations.IntegerOperations;
public class ArrayOperrationsTest {
	FileIO fl= new FileIO();
	IntegerOperations intop=new IntegerOperations();
	ArrayOperrations arop=new ArrayOperrations(fl,intop);
	@Test
	public void test_find_max_in_file_Mocking_normal() {
		String filepath="src/test/resources/test1.txt";
		int[] linesList = {1,2,3,4,5};
		FileIO fl=mock(FileIO.class);
		when(fl.readFile(filepath)).thenReturn(linesList);
		
		Assert.assertEquals(5,arop.findMaxInFile(filepath));
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_find_max_in_file_Mocking_exception() {
		String filepath="src/test/resources/test4.txt";
		int[] linesList = {};
		FileIO fl=mock(FileIO.class);
		when(fl.readFile(filepath)).thenReturn(linesList);
		
		arop.findMaxInFile(filepath);
		
	}
	
	
	@Test
	public void test_reverse_signs_in_file_Mocking_normal() {
		IntegerOperations intop= mock(IntegerOperations.class);
		int[] linesList = new int[] {1,2,3,4,5};
		int[] reversedlinesList = new int[] {-1,-2,-3,-4,-5};
		for(int i=0;i<linesList.length;i++) {
			when(intop.reverseSign(linesList[i])).thenReturn(reversedlinesList[i]);
			}
		String  filepath="src/test/resources/test1.txt";
		
		
		
		
		
		
		Assert.assertArrayEquals(reversedlinesList,arop.reverseArray(filepath));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_reverse_signs_in_file_Mocking_exception() {
		String filepath="src/test/resources/test4.txt";
		int[] linesList = {};
		FileIO fl=mock(FileIO.class);
		when(fl.readFile(filepath)).thenReturn(linesList);
		
		arop.reverseArray(filepath);
		
	}
	
	
}
