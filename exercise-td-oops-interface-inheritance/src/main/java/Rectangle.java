package com.stackroute.oops;

public class Rectangle extends AbstractShape {
	private String colour;
	private int length;
	private int breadth;
	private double area;
	private double perimeter;
	public Rectangle(String colour, int length, int breadth) {
		super();
		this.colour = colour;
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public double getArea() {
		area = length* breadth;
		return area;
	}
	
	
	public void setArea(double area) {
		this.area = area;
	}
	
	
	public double getPerimeter() {
		perimeter = 2 * (length + breadth);
		return perimeter;
	}
	
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	@Override
	public String toString() {
		return "Rectangle [colour=" + colour + ", length=" + length + ", breadth=" + breadth + "]";
	}



	
	
	

}
