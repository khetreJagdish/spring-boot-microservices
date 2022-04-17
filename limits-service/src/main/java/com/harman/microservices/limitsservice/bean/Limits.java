package com.harman.microservices.limitsservice.bean;

public class Limits {

	private int minimum;
	private int maxixmim;

	public Limits() {
		// TODO Auto-generated constructor stub
	}

	public Limits(int minimum, int maxixmim) {
		super();
		this.minimum = minimum;
		this.maxixmim = maxixmim;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaxixmim() {
		return maxixmim;
	}

	public void setMaxixmim(int maxixmim) {
		this.maxixmim = maxixmim;
	}

}
