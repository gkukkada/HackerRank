package com.hackerrank.collections.visitor.domain;

import com.hackerrank.collections.visitor.interfaces.Shape;

public class Rectangle implements Shape {

	private final double length;
	private final double bredth;

	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * bredth;
	}

}
