import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import operations.IntegerOperations;

@RunWith(Parameterized.class)
public class PoweroftwoParameterized {
	@Parameter (value=0)
	public int power;
	@Parameter (value=1)
	public int result;
	IntegerOperations integerop=new IntegerOperations();
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data=new Object[][] {{2,4},{3,8},{4,16}};
		return Arrays.asList(data);
		
		
	}
	@Test
	public void test_PowerOfTwo() {
		Assert.assertEquals(result,integerop.powerOfTwo(power));
	}
}
