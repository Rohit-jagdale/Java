import java.util.HashMap;
import java.util.Hashtable;

public class DynamicProgramming {

    // fibonacci series
    // if you try to run this its takes to much time
    // public static int fibo(int n){
    // if(n==1 || n==2){
    // return 1;
    // }
    // return fibo(n-1) + fibo(n-2);
    // }
    // public static void main(String[] args) {
    // System.out.println(fibo(60));
    // }

    // //using dynamic programing
    // static Hashtable<Integer, Integer> hash = new Hashtable<>();
    // public static int fibo(int n){
    // if(hash.containsKey(n)){
    // return hash.get(n);
    // }
    // if(n==1 || n==2){
    // return 1;
    // }
    // hash.put(n, fibo(n-1)+fibo(n-2));
    // return hash.get(n);
    // }
    // public static void main(String[] args) {
    // System.out.println(fibo(6));
    // }



    // 1. climbing stairs
    // // Input: n = 2
    // // Output: 2
    // // Explanation: There are two ways to climb to the top.
    // // 1. 1 step + 1 step
    // // 2. 2 steps
    // static HashMap<Integer, Integer> hashMap = new HashMap<>();
    // public static int stairs(int n){
    //     if(hashMap.containsKey(n)){
    //         return hashMap.get(n);
    //     }
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     hashMap.put(n, stairs(n-1)+ stairs(n-2));
    //     return hashMap.get(n);
    // }
    // public static void main(String[] args) {
    //     System.out.println(stairs(5));
    // }


    // //2. best time to buy and sell the stocks
    // // Input: prices = [7,1,5,3,6,4]
    // // Output: 5
    // public static void main(String[] args) {
    //     int[] prices = {7,1,5,3,6,4};
    //     int max = 0;
    //     int min = prices[0];
    //     for(int i = 1; i< prices.length; i++){
    //         max = Math.max(max, prices[i]-min);
    //         min = Math.min(min, prices[i]);
    //     }
    //     System.out.println(max);
    // }


    // // 3. maximum subarray kadane's algo
    // // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // // Output: 6
    // // Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    // public static void main(String[] args) {
    //     int[] nums = {5,4,-1,7,8};

    //     int currsum = nums[0];
    //     int sum = nums[0];
    //     for(int i = 1; i<nums.length; i++){
    //         if(currsum<0){
    //             currsum = nums[i];
    //         }else{
    //             currsum += nums[i];
    //         }
    //         sum = Math.max(sum, currsum);
    //     }
    //     System.out.println(sum);
    // }


    // //4. house robber
    // // Input: nums = [1,2,3,1]
    // // Output: 4
    // // Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    // // Total amount you can rob = 1 + 3 = 4.

    // public static void main(String[] args) {
    //     int[] nums = {2,7,9,3,1};
    //     int[] dp = new int[nums.length];
    //     if(nums.length ==1){
    //         System.out.println(nums[0]);
    //     }else if(nums.length==2){
    //         System.out.println(Math.max(nums[0], nums[1]));
    //     }
    //     dp[0] = nums[0];
    //     dp[1] = Math.max(nums[0], nums[1]);
    //     for(int i = 2; i<nums.length; i++){
    //         dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
    //     }
    //     System.out.println(dp[dp.length-1]);
    // }


    // // 5. jump game 
    // public static boolean isJump(int[] nums){
    //     int maxJump = nums[0];
    //     for(int i = 0; i<nums.length; i++){
    //         if(i>maxJump){
    //             return false;
    //         }else{
    //             maxJump = Math.max(maxJump, i+nums[i]);
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     int[] nums = {3,2,1,0,4};
    //    if(isJump(nums)){
    //     System.out.println("yes");
    //    }else{
    //     System.out.println("no");
    //    }
    // }


}
