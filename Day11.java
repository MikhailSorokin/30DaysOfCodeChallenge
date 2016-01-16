import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        getBiggestHourglass(arr, 6);
    }
    
    public static void getBiggestHourglass(int [][] arr, int size) {
        int maxSum = Integer.MIN_VALUE;
        int total;
        for (int row = 0; row < (size - 2); row++) {
            for (int col = 0; col < (size - 2); col++) {
                total = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1]
                    + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                if (total > maxSum) {
                    maxSum = total;
                }
                
            }
        }
        
        System.out.print(maxSum);
        
    }
    
}
