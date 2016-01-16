import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int row = 0; row < n; row++) {
            //For the spaces
            for (int spaces = row; spaces < n - 1; spaces++) {
                System.out.print(" ");
            }

             //For the #
            for (int hashtags = 0; hashtags <= row; hashtags++) {
                System.out.print("#");
            }
            
            System.out.println();
        }
        
    }
}
