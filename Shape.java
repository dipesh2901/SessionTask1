package com.neosoft.basicPrograms;

public abstract class Shape {
	int xcordinate=3,ycordinate=4;
	int height=5;
	public void area() {}
	
	public void draw() {}
	
	public static void main(String[] args) {
		
		Circle c=new Circle();
		Square sq=new Square();
		Triangle t=new Triangle();
		//s.area();
		c.area();
		sq.area();
		t.area();
		//s.draw();
		c.draw();
		sq.draw();
		t.draw();
	}
}
class Circle extends Shape{
	int radius=3;

	
	public void area() {
		System.out.println("Area of a Circle: "+(2*3.14*radius));
		}
	
	public void draw() {
		System.out.println("Drawing of a Circle with  x_coordinate: "+xcordinate+" and y-cordinate: "+ycordinate);
	}
}
class Triangle extends Shape{
	int base=2;
	
	public void area() {
		System.out.println("Area of a Triangle: "+(0.5*base*height));
		}
	
	public void draw() {
		System.out.println("Drawing of a Triangle with x_coordinate: "+xcordinate+" and y_coordinate: "+ycordinate);
	}
}

class Square extends Shape{
	
	public void area() {
		System.out.println("Area of a Square: "+(height*height));
		}
	
	public void draw() {
		System.out.println("Drawing of a Square with x-Coorindate: "+xcordinate+" and ycordinate: "+ycordinate);
	}
	
}
