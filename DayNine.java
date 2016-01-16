import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]){
        int a, b;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int gcd = find_gcd(a,b);
        System.out.println(gcd);
    }
   
    static int find_gcd(int a,int b){
          int return_var;
        
          if (a == b) {
            return_var = a;
          } else {
            return_var = find_gcd(Math.max(a, b) - Math.min(a, b), Math.min(a, b));
          }
        
        return return_var;
      }
}
 
