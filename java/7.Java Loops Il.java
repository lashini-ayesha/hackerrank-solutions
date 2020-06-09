import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

           int x=1, y= a;
           for(int k=1; k<=n; k++)
           {
              if(k!=1) 
              x = x*2;
              y = y + b*x;  
             System.out.printf("%d ",y);   
           } 
           System.out.printf("\n");
        } 
        in.close();
    }
}
