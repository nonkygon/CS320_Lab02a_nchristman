package edu.ycp.cs320.lab02a_nchristman.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nchristman.model.Numbers;

public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
		model.setFirst(2.0);
		model.setSecond(100.0);
		model.setThird(53.0);
	}
	
	@Test
	public void testSetFirst() {
		assertEquals((Double)2.0, model.getFirst());
	}
	
	@Test
	public void testSetSecond() {
		assertEquals((Double)100.0, model.getSecond());
	}
	
	@Test
	public void testSetThird() {
		assertEquals((Double)53.0, model.getThird());
	}
	
	@Test
	public void testAddNumbers() {
		Double result = model.getAddResult();
		assertEquals((Double)155.0, result);
	}
	
	@Test
	public void testMultiplyNumbers() {
		Double result = model.getMultiplyResult();
		assertEquals((Double)200.0, result);
	}
	
}
