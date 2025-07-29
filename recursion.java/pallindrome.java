
import java.util.*;

class pallindrome {
    public static String pallindrome(int n) {
        int n2 = n;
        int n1;
        int rev = 0;
        if (n < 0) {
            return "not valid";
        } else {
            while (n2 != 0) {
                n1 = n2 % 10;
                rev = rev * 10 + n1;
                n2 = n2 / 10;
            }
            if (n == rev) {
                return "pallindrome";
            } else {
                return "not pallindrome";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        System.out.println(pallindrome(a));
    }
}