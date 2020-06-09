import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

       int[] a= new int[16];
       int p=0;
       
      for(int row=0; row<4; row++)
      {
          for(int col=0; col<4; col++){
          int sum=0;
          for(int x=row; x<row+3; x++)
          {
             for(int y=col; y<col+3; y++)
             {  
                if((x==row+1 && y==col) || (x==row+1 && y==col+2)){
                    continue;
                }else 
                sum = sum + arr[x][y];
             }

          }
                 a[p]=sum;
                 p++;

        }  
      }
       int max=a[0];
       for(int z=1; z<a.length; z++){
           if( max<a[z])
           max= a[z];
       }
       System.out.println(max);
    
    }
}
