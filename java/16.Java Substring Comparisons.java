import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        
        smallest = s.substring(0,k);
       
        for (int x=0; x<=s.length()-k; x++)
           {
              if(smallest.compareTo(s.substring(x,x+k))>0 ){
              smallest=s.substring(x,x+k);
              }
             if(largest.compareTo(s.substring(x,x+k))<0)                   
              {
              largest=s.substring(x,x+k);
              
              }  
              
             

           }
        return (smallest + "\n" + largest);
    } 
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}