package com.hackerrank.collections.visitor;

import java.util.Scanner;

import com.hackerrank.collections.visitor.domain.Circle;
import com.hackerrank.collections.visitor.domain.Rectangle;
import com.hackerrank.collections.visitor.domain.Triangle;

public class AreaVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 if you want to calculate area of Circle"
				+ "\nEnter 2 if you want to calculate area of Rectangle"
				+ "\nEnter 3 if you want to calculate area of Triangle");

		int value = sc.nextInt();

		if (value == 1) {
			System.out
					.println("Great! You have choosen Circle. Please enter radius of the Circle: ");
			double radius = sc.nextDouble();
			Circle circle = new Circle(radius);
			System.out.println("Area of the Circle is: " + circle.getArea());
		} else if (value == 2) {
			System.out
					.println("Awesome! You have choosen Rectangle. Please enter length of the Rectangle: ");
			double length = sc.nextDouble();
			System.out.println("Please enter breadth of the Rectangle: ");
			double breadth = sc.nextDouble();
			Rectangle rectangle = new Rectangle(length, breadth);
			System.out.println("Area of the Rectangle is: "
					+ rectangle.getArea());
		} else if (value == 3) {
			System.out.println("Excellent! You have choosen Triangle ");
			System.out.println("Please enter base of the Triangle: ");
			double base = sc.nextDouble();
			System.out.println("Please enter height of the Triangle: ");
			double height = sc.nextDouble();
			Triangle triangle = new Triangle(height, base);
			System.out
					.println("Area of the Triangle is: " + triangle.getArea());
		} else {
			System.out.println("Oops! Wrong selection. Exiting");
			sc.close();
			System.exit(1);
		}
	}

}
