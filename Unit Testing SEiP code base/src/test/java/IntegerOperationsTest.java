import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

import operations.IntegerOperations;

public class IntegerOperationsTest {
	IntegerOperations integerop=new IntegerOperations();

	
	@Test
	public void test_reversepositive() {
		Assert.assertEquals(-2, integerop.reverseSign(2));
	}
	
	
	@Test
	public void test_reversezero() {
		Assert.assertEquals(0, integerop.reverseSign(0));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_add_negatives() {
		integerop.add(-3, -4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_add_big_number() {
		integerop.add(Integer.MAX_VALUE, 1);
	}
	
	@Test
	public void test_add_normal() {
		Assert.assertEquals(4,integerop.add(2, 2) );
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	@Test
	public void test_power_negative() {
		exception.expectMessage(-2 + " is not a positive integer");
		integerop.powerOfTwo(-2);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void test_power_big() {
		thrown.expectMessage(32 + "^2 causes an integer overflow.");
		integerop.powerOfTwo(32);
	}
	
	
	
	
}