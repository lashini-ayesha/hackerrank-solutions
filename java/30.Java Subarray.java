import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }

        int[] a = new int[10000];
        int p=0; 
        for(int j=1; j<=n; j++)
        {
            for(int y=0; y<n-j+1; y++){
              int sum=0;
            for(int x=y; x<y+j; x++)
            {
               sum= sum + arr[x];

            }
            a[p]=sum;
            p++;
          }
        }
        int negsum=0;
        for(int z=0; z<a.length; z++)
        {
            if(a[z]<0)
            {
             negsum++;
            }
        }
        System.out.println(negsum);

    }
}
