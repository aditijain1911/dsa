import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
       int r=0;
       for(int arr: nums){
        r ^= arr;
       } 
       return r;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int i; int [] nums = new int [size];
        for(i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int f = sol.singleNumber(nums);
        System.out.println(f); sc.close();
    }
}