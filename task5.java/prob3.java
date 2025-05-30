//package task5.java;
import java.util.*;
// sum of array elements
public class prob3 {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size]; int i,s=0;
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt(); 
        } 
        for(i=0; i<size; i++){
          s = s+ arr[i];
        } 
        System.out.println(s); sc.close();
    }
}
