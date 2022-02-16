package edu.ycp.cs320.lab02a_nchristman.controller;

import edu.ycp.cs320.lab02a_nchristman.model.Numbers;

public class NumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	public void popValues(Double one, Double two, Double three) {
		model.setFirst(one);
		model.setSecond(two);
		model.setThird(three);
	}
	
	public Double add() {
		return model.getAddResult();
	}
	public Double multiply() {
		return model.getMultiplyResult();
	}
}
