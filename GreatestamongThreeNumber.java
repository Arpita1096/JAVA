package arpita;
import java.util.Scanner;
public class greatest {
	//greatest of three numbers
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.print("Enter value of a:");
	int a = s.nextInt();
	System.out.print("Enter value of b:");
	int b = s.nextInt();
	System.out.print("Enter value of :");
	int c = s.nextInt();
	if(a>b && a>c)
	{
		System.out.println("Greatest number is:"+a);
	}
	else if(b>a && b>c)
	{
		System.out.println("Greatest number is:"+b);
	}
	else
	{
		System.out.println("Greatest number is:"+c);
	}
}
}
