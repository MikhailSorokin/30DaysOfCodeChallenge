import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Coord {
    
    public int x, y;
    
    Coord (int _x, int _y) {
        x = _x;
        y = _y;
    }
    
}

public class Solution {

    
    public static ArrayList<Coord> FindSmallestDiffs(int[] arr) {
        ArrayList<Coord> allSmallest = new ArrayList<Coord>();
        
        int smallestDiff = Integer.MAX_VALUE;
     
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < smallestDiff) {
                smallestDiff = Math.abs(arr[i] - arr[i + 1]);
            }
        }
        
        for (int newi = 0; newi < arr.length - 1; newi++) {
            if (Math.abs(arr[newi] - arr[newi + 1]) == smallestDiff) {
               allSmallest.add(new Coord(arr[newi], arr[newi + 1]));
            }
        }
        
        return allSmallest;
    }
    
    public static void PrintCoords(ArrayList<Coord> coords) {
        for(Coord c : coords) {
            System.out.print(c.x + " " + c.y + " ");
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int sizeList =sc.nextInt();
        int[] arr = new int[sizeList];
        int i = 0;
        
        while(i < sizeList){
              int ele=sc.nextInt();
              arr[i] = ele;
              i++;
        }
        
        Arrays.sort(arr);
        ArrayList<Coord> smallestInts = FindSmallestDiffs(arr);
        PrintCoords(smallestInts);
        
    }
}