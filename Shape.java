package edu.txst.assignment2;


public interface Shape{
	double getArea();
	String getClassName();
}

class Circle implements Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getClassName() {
		return "Circle";
	}
	
	@Override
	public String toString() {
		return ("The area of the "+ getClassName() +" is: "+ getArea());
	}
}


class Square implements Shape {
	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return (side * side);
	}
	
	public String getClassName() {
		return "Square";
	}
	
	@Override
	public String toString() {
		return ("The area of the "+ getClassName() +" is: "+ getArea());
	}
}


class Rectangle implements Shape {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
	
	public String getClassName() {
		return "Rectangle";
	}
	
	@Override
	public String toString() {
		return ("The area of the "+ getClassName() +" is: "+ getArea());
	}
}


class Triangle implements Shape {
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (0.5 * base * height);
	}
	
	public String getClassName() {
		return "Triangle";
	}
	
	@Override
	public String toString() {
		return ("The area of the "+ getClassName() +" is: "+ getArea());
	}
}
