package edu.ycp.cs320.lab02a_nchristman.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nchristman.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
		model.setMin(1);
		model.setMax(100);
	}
	
	@Test
	public void testSetMin() {
		assertEquals(1, model.getMin());
	}
	
	@Test
	public void testSetMax() {
		assertEquals(100, model.getMax());
	}
	
	@Test
	public void testIsDone() {
		assertFalse(model.isDone());
		model.setMin(50);
		model.setMax(50);
		assertTrue(model.isDone());
	}
	
	@Test
	public void testGetGuess() {
		assertEquals(50, model.getGuess());
	}
	
	@Test
	public void testIsLessThan() {
		int maximum = 50;
		model.setIsLessThan(maximum);
		assertEquals(maximum-1, model.getMax());
	}
	
	@Test
	public void testIsGreaterThan() {
		int minimum = 50;
		model.setIsGreaterThan(minimum);
		assertEquals(minimum+1, model.getMin());
	}
}
