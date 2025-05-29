//package task4.java;
// largest of three numbers
import java.util.*;
public class prob1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        int q= sc.nextInt();
        int r= sc.nextInt();
        if((p>q) && (p>r)){
            System.out.println(p +"is larger");
        }
         else if((q>p) && (q>r)){
            System.out.println(q+"is larger");
         }
         else{
            System.out.println(r+"is larger");
         }
            sc.close();
    }
}
