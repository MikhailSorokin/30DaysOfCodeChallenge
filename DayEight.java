//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      //Create HashMap
      Map<String, Integer> contactList = new HashMap<String, Integer>(); 
       
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         contactList.put(name, phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if (contactList.containsKey(s)) {
             System.out.println(s + "=" + contactList.get(s));
         } else {
             System.out.println("Not found");
         }
      }
      
       
   }
}
