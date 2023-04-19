package arpita;
import java.util.Scanner;
class Calculation
{
	void multiplication(int a, int b) {
		int z = a*b;
		System.out.println(z);
	}
}
class My_Calculation extends Calculation 
{ 
	void addition(int a, int b) {
		int z = a + b;
		System.out.println(z);
	}
	void subtraction(int a, int b)
	{
		int z = a - b;
		System.out.println(z);
	}
	void division(int a, int b)
	{
		int z = a / b;
		System.out.println(z);
	}
	
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		My_Calculation cal = new My_Calculation();
		cal.addition(a, b);
		cal.subtraction(a,b);
		cal.multiplication(a,b);
		cal.division(a, b);

	}

}
