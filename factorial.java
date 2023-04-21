package arpita;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int a = sc.nextInt();
		for(int i=1 ; i<=a ; i++)
		{
			fact = fact*i; 
		}
		System.out.println("Factorial of a number is:"+fact);
	}

}
