package com.stackroute.oops;
public class AbstractShape implements Shape {

	public AbstractShape() {
		super();
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimeter() {
		return 0;
	}

	public Object getColour() {
		return null;
	}

}
