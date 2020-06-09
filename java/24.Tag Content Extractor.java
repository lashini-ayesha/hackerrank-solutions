import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String s ="<(.+)>([^<>]+)</\\1>";
        Pattern p = Pattern.compile(s);
		while(testCases>0){
			String line = in.nextLine();
			Matcher m = p.matcher(line);
            int x= 0;

            while(m.find()){
            System.out.println(m.group(2));
            x=1;}

            if(x==0)
            System.out.println("None");
          	//Write your code here
			
			testCases--;
		}
	}
}

