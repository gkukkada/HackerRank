package com.hackerrank.collections.visitor.domain;

import com.hackerrank.collections.visitor.interfaces.Shape;

public class Triangle implements Shape {

	private final double height;
	private final double base;

	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

}
