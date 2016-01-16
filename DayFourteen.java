import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference (int[] arr) {
        elements = new int[arr.length];
        for (int element = 0; element < elements.length; element++) {
            elements[element] = arr[element];
        }
        maximumDifference = 0;
    }


    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }
} // End of Difference Class

public class Solution {        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
    
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
   }
}
