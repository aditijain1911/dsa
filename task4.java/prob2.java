//package task4.java;
import java.util.*;
// count digits in a number
public class prob2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int count=0;  
         while(n!=0){
            count++;
            n = n/10;
         }
         System.out.println(count);
         sc.close();
    }
}
