package edu.ycp.cs320.lab02a_nchristman.controller;

import static org.junit.Assert.assertEquals;
import edu.ycp.cs320.lab02a_nchristman.model.Numbers;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nchristman.controller.NumbersController;

public class AddNumbersControllerTest {
	private NumbersController controller;
	private Numbers model;
	
	@Before
	public void setUp() {
		controller = new NumbersController();
		model = new Numbers();
		controller.setModel(model);
	}
	
	@Test
	public void testAddValidNumbers() {
		Double one = 1.0;
		Double two = 2.0;
		Double three = 3.0;
		controller.popValues(one, two, three);
		Double result = controller.add();
		assertEquals((Double)6.0, result);
	}
	
}
