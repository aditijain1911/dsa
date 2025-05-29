package task2;
import java.util.*;
public class prob3{
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); int f,s=0 ;
    // sum of digits
    while(n!=0){
        f = n%10;
        s = s+f;
        n = n/10;
    }
    System.out.println(s);
    sc.close();
}
}