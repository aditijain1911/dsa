import java.util.*;
class frequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count =0;
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("enter the array elements: ");
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        
         HashMap<Integer,Integer> map= new HashMap<>();
         for(int i=0; i<n; i++){
             int element = arr[i];
         
         map.put(element,map.getOrDefault(element,0)+1);
         }
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
         
         for (Map.Entry<Integer,Integer> entry : map.entrySet()){
             int value = entry.getValue();
         System.out.println( entry.getKey() + "---->" +entry.getValue());
         
         if(value > max){
             max = value;
         }
         if(value < min){
             min = value;
         }
         }
          System.out.println("highest frequency element---> " +max);
         System.out.println("lowest frequency element---> " +min);
         }
}
    