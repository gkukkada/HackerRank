package com.hackerrank.collections.visitor.domain;

import com.hackerrank.collections.visitor.interfaces.Shape;

public class Circle implements Shape {

	private final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
