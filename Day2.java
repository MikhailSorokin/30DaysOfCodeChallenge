import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      // Enter your code here!
      double tipInMoney = (double)(T)/100 * M;
      double taxInMoney = (double)(X)/100 * M;
      
      int total = (int) Math.round(M + tipInMoney + taxInMoney);
      
      
      System.out.println("The final price of the meal is $" + total + ".");
      
    }
}
