package arpita;
class A
{
	int x , y;
}
class A1 implements Cloneable
{
	int a;
	int b;
	A c = new A();
	public Object clone() throws CloneNotSupportedException{
	return super.clone();
	}
}

public class Testex {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		A1 a1 = new A1();
		a1.a = 10;
		a1.b = 20;
		a1.c.x = 30;
		a1.c.y = 40;
		A1 a2 = (A1)a1.clone();         //creating a copy of object a1 ad passing it to a2
		a2.a = 300;                     // change in primitive type of a2 is not reflected in both a2 and a1
   		a2.c.x = 500;
		System.out.println(a1.a+" "+a1.b+" "+a1.c.x+" "+a1.c.y);
		System.out.println(a2.a+" "+a2.b+" "+a2.c.x+" "+a2.c.y);
	}

}
