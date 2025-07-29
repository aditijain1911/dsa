
import java.util.*;

class sum {
    public static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which sum of natural number want to find : ");
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println("the sum of numbers is" + res);
    }
}