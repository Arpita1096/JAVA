abstract class Shape
{
	abstract void draw();
	abstract void erase();
}
class Square extends Shape
{
	void draw() {
		System.out.println("Drawing square");
	}
	void erase() {
		System.out.println("Erasing square");
	}
}
public class Assignment
{
	public static void main(String args[])
	{
		Shape s = new Square();
		s.draw();
		s.erase();
	}
}
