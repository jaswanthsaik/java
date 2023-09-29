package com.stackroute.oops;

public class ShapeService {

	public ShapeService() {
		super();
	}

	public Circle createCircle(String string, int i) {
		Circle circle = new Circle(string,i);
		return circle;
	}

	public Rectangle createRectangle(String string, int i, int j) {
		Rectangle rectangle = new Rectangle(string,i,j);
		return rectangle;
	}

	public static Integer compareShapeArea(Rectangle one, Rectangle two) {
		if(one.getArea()==two.getArea()) {
			return 0;
		}
		
		return null;
	}

	public static String getShapeSummary(Circle circle) {
		return "Circle [colour="+circle.getColour()+", radius="+(int)circle.getRadius()+"]\nArea : "+Math.round(circle.getArea())+" Perimeter : "+Math.round(circle.getPerimeter());
	}

	public static Integer compareShapeArea(Circle one, Rectangle two) {
		if(one.getArea()==two.getArea()) {
			return 0;
		}
		else if(one.getArea()>two.getArea()) {
			return 1;
		}
		return null;
	}

	public static String getShapeSummary(Rectangle rectangle) {
		return"Rectangle [colour="+rectangle.getColour()+", length="+rectangle.getLength()+", breadth="+rectangle.getBreadth()+"]\nArea : "+Math.round(rectangle.getArea())+" Perimeter : "+Math.round(rectangle.getPerimeter());
	}

}