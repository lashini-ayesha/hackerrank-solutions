import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int n= scan.nextInt();
        int m= scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] BitSet = new BitSet[3];

        BitSet[1] = b1;
        BitSet[2] = b2;
        
        while(m-->0){

           String s= scan.next();
           int x = scan.nextInt();
           int y = scan.nextInt();

           switch (s) {

            case "AND":
              BitSet[x].and(BitSet[y]);
              break;
            case "OR":
              BitSet[x].or(BitSet[y]);
              break;
            case "XOR":
              BitSet[x].xor(BitSet[y]);
              break;
            case "FLIP":
              BitSet[x].flip(y);
              break;
            case "SET":
              BitSet[x].set(y);

           }
           System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());

        }

    }
}
