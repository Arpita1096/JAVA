import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solu{tion. */
       Scanner sc = new Scanner(System.in);
       try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = x/y;
            System.out.println(c);
       }
       catch(InputMismatchException e){
           System.out.println(e.getClass().getName());
       }
       catch(ArithmeticException e){
           System.out.println(e);
       }
       finally{
           sc.close();
       }
    }
}
