import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
         int n = scan.nextInt(); 
         LinkedList<Integer> list= new LinkedList<>();
         for(int i=0; i<n; i++){
             int value = scan.nextInt();
             list.add(i,value);
         }
         int q= scan.nextInt();
         for(int j=0; j<q; j++){
             String a= scan.next();
             if(a.equals("Insert")){
                 int x=scan.nextInt();
                 int y=scan.nextInt();
                 list.add(x,y);
             }else{
                 int z=scan.nextInt();
                 list.remove(z);
             }
         }
         for (int num:list)
         System.out.print(num+" ");
    }
}
