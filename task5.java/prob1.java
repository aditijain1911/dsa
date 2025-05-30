//package task5.java;
import java.util.*;
// print elements of arrays
public  class prob1 {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int  i;
         int []arr = new int [size];
         for(i=0; i<size; i++){
          arr[i] =sc.nextInt();    
         }
         for(i =0; i<size; i++){
            System.out.println(arr[i]);
           }    sc.close();
} }


