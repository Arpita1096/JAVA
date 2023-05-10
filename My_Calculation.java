package arpita;
class Calculation
{
	int z;
	void addition(int x,int y) {
		z = x+y;
		System.out.println("The sum:"+z);
	}
	void subtraction(int x,int y) {
		z=x-y;
		System.out.println("Difference :" +z);
	}
}

public class My_Calculation extends Calculation{
	void multiplication(int x,int y) {
		z = x*y;
		System.out.println("Multiplication:"+z);
	}
	public static void main(String args[]) {
		My_Calculation demo = new My_Calculation();
		demo.addition(10, 20);
		demo.subtraction(20,10);
		demo.multiplication(10,20);
	}

}
