//package task4.java;
// reverse of a number
import java.util.*;
public class prob3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int f, r=0;
        while(n!=0){
            f = n%10;
            r = r*10 +f;
            n = n/10;
        }
        System.out.println(r);
     sc.close();
    }
}
