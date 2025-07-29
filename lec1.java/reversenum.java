import java.util.*;

class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        String str = sc.nextLine();
        String s = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        System.out.println("reverse of a number is " + s);
    }
}