package arpita;

import java.util.Scanner;

class Division{
	Division(int dividend,int divisor){
	try {
		int a = dividend/divisor;    
	    if(divisor == 0) {
	    	System.out.println("divisor cannot be zero.");
	    }
	    else {
	    	System.out.println(a);
	    }
	}
	catch(ArithmeticException e) {
		System.out.println("An exception occured:"+e+" "+e.getMessage());
	}
	finally {
		System.out.println("This is the final block.");
	}
}
}
public class Assignment3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		Division div = new Division(dividend,divisor);
		sc.close();
	}

}
