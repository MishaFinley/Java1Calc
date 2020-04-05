package edu.neumont.csc180.Finley.Misha.FinleyM_JUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
	
	@Test
    public void testAdd() {
    	int ans = Calculator.Add(1, 5);
    	Assert.assertEquals(6, ans);
    }
	
	@Test
	public void testSub() {
		int ans = Calculator.Subtract(1, 5);
		Assert.assertEquals(-4, ans);
	}
	

	@Test
	public void testDiv() {
		double ans = Calculator.Divide(1, 4);
		Assert.assertEquals(0.25, ans, 0.0);
	}
	
	@Test
	public void testMult() {
		int ans = Calculator.Multiply(5, 5);
		Assert.assertEquals(25, ans);
	}
}
