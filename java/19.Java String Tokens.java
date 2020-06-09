import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] token= s.trim().split("[ !,?.\\_'@]+");
        
        if (s == null || s.equals("") || s.trim().equals(""))
             System.out.println("0");

        else if(s.length()>1 && s.length()<400000)
        {
          System.out.println(token.length);

          for(String element:token)
            System.out.println(element);

        }
        // Write your code here.
        scan.close();
    }
}

