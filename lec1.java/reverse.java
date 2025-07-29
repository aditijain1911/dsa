import java.util.*;
public class reversear{
    public static int [] rev(int [] arr){
        int n = arr.length;
        int [] temp = new int [n]; int i;
        
        for(i=0; i<n; i++){
             temp[i] = arr[n-i-1];
        }
       
        return temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array: ");
        int n = sc .nextInt();
        int [] arr = new int [n];
        System.out.println("enter the array elements:  ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the original array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
       // for(int i=0; i<n; i++){
            int [] res = rev(arr);
            System.out.println("reversed array : ");
            for(int i=0; i<n; i++){
               System.out.print(res[i] + " ");
            }
    }
    
}


