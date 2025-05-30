import java.util.*;
public class prob1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); double i,f=1;
        for( i=1; i<=n; i++){
              f =  f*i;
              sc.close();
        }
        System.out.println(f);
        
    }
}
