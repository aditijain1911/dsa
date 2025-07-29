
import java.util.*;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int dup = num;
        int n1;
        int count = 0;
        while (dup != 0) {
            n1 = dup % 10;
            count++;
            dup = dup / 10;
        }
        int dup2 = num;
        int n2;
        double arm = 0;
        while (dup2 != 0) {
            n2 = dup2 % 10;
            arm = Math.pow(n2, count) + arm;
            dup2 = dup2 / 10;
        }
        if (arm == num) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
