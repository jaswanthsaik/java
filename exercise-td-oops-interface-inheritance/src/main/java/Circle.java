package com.stackroute.oops;

public class Circle extends AbstractShape {
	private String colour;
	private int radius;
	double pi = Math.PI;
	private double area;
	private double perimeter;
	public Circle(String colour, int radius) {
		super();
		this.colour = colour;
		this.radius = radius;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		area = pi * radius * radius;
		return area;
	}
	public double getPerimeter() {
		perimeter = 2 * pi * radius;
		return perimeter;
	}
	@Override
	public String toString() {
		return "Circle [colour=" + colour + ", radius=" + radius + "]";
	}
	
}
