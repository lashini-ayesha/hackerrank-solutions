import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try{
            int x=scan.nextInt();
            int y=scan.nextInt();
            int result=x/y;
            System.out.print(result);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
