
import java.util.*;

class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        String str = sc.nextLine();
        String s = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        System.out.println(s);
        if (s.equals(str)) {
            System.out.println(s + " is pallindrome");
        } else {
            System.out.println(s + " is not a pallindrome");
        }
    }
}