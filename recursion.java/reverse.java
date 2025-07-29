
import java.util.*;

class reverse {
    public static int rev(int n) {
        int i;
        for (i = n; i > 1; i--) {
            System.out.println(i);
        }
        return i;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which reverse of natural number need to find :");
        int n = sc.nextInt();
        System.out.println("the reverse is ");
        int res = rev(n);
        System.out.println(res);
    }

}