package arpita;
class Test_ref
{
	int x,y;
}
class Test2_ref implements Cloneable
{
	int a;
	int b;
	Test_ref c = new Test_ref();
	public Object clone() throws CloneNotSupportedException
	{
		//assigning shallow copy to new reference variable
		Test2_ref t1 = (Test2_ref)super.clone();
		//creating a deep copy for c
		t1.c = new Test_ref();
		t1.c.x = c.x;
		t1.c.y = c.y;
		return t1;
	}
}
public class DeepCloning {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Test2_ref t2 = new Test2_ref();     //creating object of test_ref class
		t2.a = 20;
		t2.b = 30;
		t2.c.x = 40;
		t2.c.y = 50;
		Test2_ref t3 = (Test2_ref)t2.clone();
		t3.a = 50;
		t3.c.x = 100;
		System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y);
		System.out.println(t3.a+" "+t3.b+" "+t3.c.x+" "+t3.c.y);
		
	}

}
