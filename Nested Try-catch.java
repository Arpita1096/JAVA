import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
class Test extends Exception{
	public Test(String str) {
		super(str);
	}
}
class Test1 extends Exception{
	public Test1(String st) {
		super(st);
	}
}
public class Main {
	public static void main(String argsp[]) {
		Scanner sc = new Scanner(System.in);
		float temp = sc.nextFloat();
		try {
			if(temp < 94.0)
			throw new MyException("Temperature below normal");
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		try {
			 if(temp > 94.0 && temp<100) 
			 throw new Test("Normal Temperature");
		}
		catch(Test ex) {
			System.out.println(ex.getMessage());
		}
		try {
			if(temp > 100.0)
				throw new Test1("Temperature above normal");
		}
		catch(Test1 t) {
			System.out.println(t.getMessage());
		}
	}

}
