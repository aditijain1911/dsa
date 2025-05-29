  import java.util.*;
 public class leet {
   
    public static boolean isPalindrome(int x) {
        
             int f , s=0;
            while(x!=0){
                f= x%10;
                s = s*10 +f;
                x= x/10;
            }
            if(s==x){
                return true;
            }
            else{
                return false;
            }
        }
            public static void main(String []args){
                Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean result =  isPalindrome(n);
             sc.close();
             if(result) {
                System.out.println("palindrome");
            }
             else {
                System.out.println("Not Palindrome");
            }
           
        }
    }


