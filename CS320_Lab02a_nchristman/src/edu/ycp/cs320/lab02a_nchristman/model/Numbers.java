package edu.ycp.cs320.lab02a_nchristman.model;

// model class for AddNumbers & MultiplyNumbers
// only the controller should be allowed to call the set methods
// the JSP will call the "get" and "is" methods implicitly
// when the JSP specifies game.first, that gets converted to
//    a call to model.getFirst()
public class Numbers {
	private Double first, second, third;
	
	public Numbers() {
	}
	
	public void setFirst(Double first) {
		this.first = first;
	}
	
	public Double getFirst() {
		return first;
	}
	
	public void setSecond(Double second) {
		this.second = second;
	}
	
	public Double getSecond() {
		return second;
	}
	
	public void setThird(Double third) {
		this.third = third;
	}
	
	public Double getThird() {
		return third;
	}
	
	public Double getAddResult() {
		return first + second + third;
	}
	
	public Double getMultiplyResult() {
		return first * second;
	}
	
	
}
