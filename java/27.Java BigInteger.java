import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in = new Scanner(System.in);

      BigInteger a= new BigInteger(in.next());
      BigInteger b= new BigInteger(in.next());
      BigInteger sum= a.add(b);
      BigInteger mul=a.multiply(b);

      System.out.println(sum);
      System.out.println(mul);
    }
}
