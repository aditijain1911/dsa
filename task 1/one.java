// User function Template for Java
import java.util.Scanner;
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n>m){
            return "greater" ;
        }
         else if(n<m){
             return "lesser" ;
         }
          else{
              return "equal" ;
          }
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt ();
        int m = scanner.nextInt ();
        String result = compareNM(n, m);
        System.out.println(result);
    
    scanner.close();
      }
}
