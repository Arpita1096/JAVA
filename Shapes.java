package arpita;

class Shape
{
	void draw() {
		System.out.println("Draw the shape.");
	}
	void erase() {
		System.out.println("Erase the shape.");
	}
}
class Circle extends Shape 
{
	void draw() {
		System.out.println("Draw the circle.");
	}
	void erase() {
		System.out.println("Erase the circle.");
	}
}
class Triangle extends Shape 
{
	void draw() {
		System.out.println("Draw the triangle.");
	}
	void erase() {
		System.out.println("Erase the triangle.");
	}
}
class Square extends Shape
{
	void draw() {
		System.out.println("Draw the square.");
	}
	void erase() {
		System.out.println("Erase the square.");
	}
}
public class Assignment {
	public static void main(String args[])
	{
		Circle c = new Circle();
		Triangle tri = new Triangle();
		Square s = new Square();
		c.draw();
		c.erase();
		tri.draw();
		tri.erase();
		s.draw();
		s.erase();		
	}
}
