import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); 
        
         while (size > 0) 
         {
             recursiveCall(scan.nextInt());
             System.out.println();
             size--;
         }
   }
    
   public static void recursiveCall(int num) {
       int remainder = num%2;
       if (num > 0) {
           recursiveCall(num/2);
           System.out.print(remainder);
       }
   }
}
