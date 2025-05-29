import java.util.*;
public class leet13 {
    static class Solution{
    public int reverse(int x) {
        int f, s=0;
        while(x!=0){
            f = x%10;
            if((s<Integer.MIN_VALUE/10)||(s==Integer.MIN_VALUE/10 && f<-8)) return 0;
            if((s>Integer.MAX_VALUE/10)||(s==Integer.MAX_VALUE/10 && f>7)) return 0;
            s =s*10 +f;
            x = x/10;
        } return s;
    }}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.reverse(n);
        System.out.println(result);
         sc.close();
    }
}
