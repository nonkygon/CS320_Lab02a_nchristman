package edu.ycp.cs320.lab02a_nchristman.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nchristman.controller.NumbersController;

public class MultiplyNumbersControllerTest {
	private NumbersController controller;
	
	@Before
	public void setUp() {
		controller = new NumbersController();
	}
	
	@Test
	public void testMultiplyValidNumbers() {
		Double one = 5.0;
		Double two = 6.0;
		Double result = controller.multiply(one, two);
		assertEquals((Double)30.0, result);
	}
	
}