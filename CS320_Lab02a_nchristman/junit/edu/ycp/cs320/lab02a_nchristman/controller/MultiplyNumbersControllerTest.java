package edu.ycp.cs320.lab02a_nchristman.controller;

import static org.junit.Assert.assertEquals;
import edu.ycp.cs320.lab02a_nchristman.model.Numbers;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nchristman.controller.NumbersController;

public class MultiplyNumbersControllerTest {
	private NumbersController controller;
	private Numbers model;
	
	@Before
	public void setUp() {
		controller = new NumbersController();
		model = new Numbers();
		controller.setModel(model);
	}
	
	@Test
	public void testMultiplyValidNumbers() {
		Double one = 5.0;
		Double two = 6.0;
		controller.popValues(one, two, 0.0);
		Double result = controller.multiply();
		assertEquals((Double)30.0, result);
	}
}