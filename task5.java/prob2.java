//package task5.java;
import java.util.*;
// max element in array
public class prob2 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
     int size = sc.nextInt(); int i;
     int [] arr = new int [size];
     int max = Integer.MIN_VALUE;
     for(i=0; i<size; i++){
        arr[i]= sc.nextInt(); 
     }
     for(i=0; i<size; i++){
       if(arr[i]>max){
        max = arr[i];
       }} System.out.println(max); sc.close();
     } 
    }

