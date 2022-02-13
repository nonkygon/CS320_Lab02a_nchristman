package edu.ycp.cs320.lab02a_nchristman.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nchristman.controller.AddNumbersController;

public class AddNumbersControllerTest {
	private AddNumbersController controller;
	
	@Before
	public void setUp() {
		controller = new AddNumbersController();
	}
	
	@Test
	public void testAddValidNumbers() {
		Double one = 1.0;
		Double two = 2.0;
		Double three = 3.0;
		Double result = controller.add(one, two, three);
		assertEquals((Double)6.0, result);
	}
	
}
