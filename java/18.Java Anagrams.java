import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

         int[] x = new int[50]; 
         String A= a.toLowerCase();
         String B= b.toLowerCase();
         
         if (a.length()==b.length()){
         for(int i=0; i<a.length(); i++)
         {
            int flag = 0;
            for(int j=0; j<b.length(); j++)
            {
              if (A.charAt(i)==B.charAt(j) && x[j]!=1)
              {
                 x[j]=1;
                 flag=1;
                 break;
              }
            }
            if(flag==0)
              return false;
         }
         return true;
         }else return false;
        // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}