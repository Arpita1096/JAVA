package arpita;

import java.util.Scanner;

public class simplepattern {
	public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of lines u want to enter:");
    int num = s.nextInt();
    for (int i=1; i<=num; i++)
    {
    	for (int j=1; j<=i; j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
		
	}

}
