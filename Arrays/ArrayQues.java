package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class ArrayQues {

    // // 1. min and max in array
    // public static void main(String[] args) {
    // int min = Integer.MAX_VALUE;
    // int max = Integer.MIN_VALUE;
    // int[] arr = {5, 3, -9, 2, 8};

    // for(int i = 0; i<arr.length; i++){
    // if(arr[i]>max){
    // max = arr[i];
    // }
    // }
    // for(int i = 0; i<arr.length; i++){
    // if(arr[i]<min){
    // min = arr[i];
    // }
    // }
    // System.out.println("max is:"+max+" min is:"+min);
    // }

    // //2. find second largest
    // public static void main(String[] args) {
    // int max1 = Integer.MIN_VALUE;
    // int max2 = max1;
    // int[] arr = {5, 3, 9, 2, 8};

    // for(int i = 0; i< arr.length; i++){
    // if(arr[i]> max1){
    // max2 = max1;
    // max1 = arr[i];
    // }else if(arr[i]> max2 && arr[i]!=max1){
    // max2 = arr[i];
    // }
    // }
    // System.out.println("second largest is: "+max2);
    // }

    // //3. remove duplicates from arrays
    // public static void main(String[] args) {
    // int[] arr = {3, 2, 3, 1, 2, 4,5,5};
    // HashSet<Integer> set = new HashSet<>();
    // for(int i : arr){
    // set.add(i);
    // }
    // int[] uarr = new int[set.size()];
    // int index =0;
    // for(int num : set){
    // uarr[index] = num;
    // index++;
    // }
    // System.out.println(Arrays.toString(uarr));
    // }

    // // 4. Intersection of 2 arrays without considering the frequency
    // public static void main(String[] args) {
    // int[] arr1 = { 1, 2, 3, 4, 5, 6, 6 };
    // int[] arr2 = { 5, 6, 7, 8, 9, 6 };
    // HashSet<Integer> set = Intersection(arr1, arr2);
    // System.out.println("Intersection of arrays are: " + set);
    // }
    // public static HashSet<Integer> Intersection(int[] arr1, int[] arr2) {
    // HashSet<Integer> set1 = new HashSet<>();
    // HashSet<Integer> intesec = new HashSet<>();
    // for (int num : arr1) {
    // set1.add(num);
    // }
    // for (int num : arr2) {
    // if (set1.contains(num)) {
    // intesec.add(num);
    // }
    // }
    // return intesec;
    // }

    // // 5. rotate array to right
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    // int r = 2;
    // reverse(arr, 0, arr.length - 1);
    // reverse(arr, 0, r - 1);
    // reverse(arr, r, arr.length - 1);

    // System.out.println(Arrays.toString(arr));
    // }

    // public static void reverse(int[] arr, int s, int e) {
    // while (e > s) {
    // int temp = arr[s];
    // arr[s] = arr[e];
    // arr[e] = temp;
    // s++;
    // e--;
    // }
    // }

    // // 6. Move Zeros to the End
    // public static void main(String[] args) {
    // int[] a = { 1, 1, 0, 3, 12, 9, 0 };
    // int l = 0;
    // int r = 1;
    // while (r < a.length) {
    // if (a[l] == 0) {
    // if (a[r] != 0) {
    // int temp = a[l];
    // a[l] = a[r];
    // a[r] = temp;
    // l++;
    // r++;
    // } else {
    // r++;
    // }
    // } else {
    // l++;
    // r++;
    // }
    // }
    // System.out.println(Arrays.toString(a));
    // }

    // // 7. valid suduko
    // public static void main(String[] args) {
    // char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
    // { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
    // { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
    // { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
    // { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
    // { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
    // { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
    // { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
    // { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

    // if (isValidSudoku(board)) {
    // System.out.println("yes");
    // } else {
    // System.out.println("no");
    // }

    // }
    // public static boolean isValidSudoku(char[][] board) {
    // HashSet<String> numberFound = new HashSet<>();

    // for (int i = 0; i < board.length; i++) {
    // for (int j = 0; j < board[0].length; j++) {
    // if (board[i][j] != '.') {
    // if (!numberFound.add(i + "row" + board[i][j])) {
    // return false;
    // }
    // if (!numberFound.add(j + "column" + board[i][j])) {
    // return false;
    // }

    // int boxno = ((i / 3) * 3) + (j / 3);
    // if (!numberFound.add(boxno + "box" + board[i][j])) {
    // return false;
    // }
    // }
    // }
    // }
    // return true;
    // }

    // //8. 2sums
    // // Input: nums = [2,7,11,15], target = 9
    // // Output: [0,1]
    // // with time complexity of o(n^2)
    // public static void main(String[] args) {
    // int[] arr = {2,7,11,15};
    // int target = 9;
    // int[] ans = new int[2];
    // for(int i = 0; i<arr.length; i++){
    // for(int j = i+1; j<arr.length; j++){
    // if(target == arr[i]+arr[j]){
    // ans[0] = i;
    // ans[1] = j;
    // }
    // }
    // }
    // System.out.println("at position" + Arrays.toString(ans));

    // //with time complexity of o(n)
    // Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    // for(int i = 0; i<arr.length; i++){
    // if(hashtable.containsKey(target-arr[i])){
    // ans[0] = hashtable.get(target-arr[i]);
    // ans[1] = i;
    // System.out.println("position at" + Arrays.toString(ans));
    // return;
    // }else{
    // hashtable.put(arr[i],i);
    // }
    // }
    // }

    // // 9. 3 sums
    // Input: nums = [-1,0,1,2,-1,-4]
    // Output: [[-1,-1,2],[-1,0,1]]
    // public static void main(String[] args) {
    // brute force approach
    // int[] nums = { -1, 0, 1, 2, -1, -4 };
    // List<List<Integer>> ans = new ArrayList<>();

    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // for (int k = j + 1; k < nums.length; k++) {
    // if (nums[i] + nums[j] + nums[k] == 0) {
    // List<Integer> a = new ArrayList<>();
    // a.add(nums[i]);
    // a.add(nums[j]);
    // a.add(nums[k]);
    // Collections.sort(a);
    // if (!ans.contains(a))
    // ans.add(a);
    // }
    // }
    // }
    // }
    // System.out.println(ans);

    // optimal solution
    // Arrays.sort(nums);
    // for (int i = 0; i < nums.length - 2; i++) {
    // if (i > 0 && nums[i] == nums[i - 1])
    // continue;
    // int l = i + 1;
    // int r = nums.length - 1;
    // while (l < r) {
    // if (nums[i] + nums[l] + nums[r] > 0) {
    // r--;
    // } else if (nums[i] + nums[l] + nums[r] < 0) {
    // l++;
    // } else {
    // ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
    // l++;
    // r--;
    // while (l < r && nums[l] == nums[l - 1])
    // l++;
    // while (l < r && nums[r] == nums[r + 1])
    // r--;
    // }
    // }
    // }
    // System.out.println(ans);
    // }

    // // 10. reverse array
    // public static void main(String[] args) {
    // int[] arr = { 2, 3, 4, 5, 6 };
    // int[] revArr = new int[arr.length];
    // int j = 0;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // revArr[j] = arr[i];
    // j++;
    // }
    // System.out.println(Arrays.toString(revArr));
    // }

    // // 11. nested arrays
    // // nums = [5,4,0,3,1,6,2]
    // // ouput : 4
    // // Explanation:
    // // nums[0] = 5, nums[1] = 4, nums[2] = 0, nums[3] = 3, nums[4] = 1, nums[5] =
    // 6,
    // // nums[6] = 2.
    // // One of the longest sets s[k]:
    // // s[0] = {nums[0], nums[5], nums[6], nums[2]} = {5, 6, 2, 0}

    // public static void main(String[] args) {
    // int[] nums = { 5, 4, 0, 3, 1, 6, 2 };
    // int max = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] == Integer.MIN_VALUE) {
    // continue;
    // }
    // max = Math.max(max, lengthOfCycle(i, nums));
    // }
    // System.out.println("max is " + max);

    // }

    // public static int lengthOfCycle(int start, int[] nums) {
    // if (start < 0 || start > nums.length - 1 || nums[start] < 0) {
    // return 0;
    // }
    // int next = nums[start];
    // nums[start] = Integer.MIN_VALUE;
    // return 1 + lengthOfCycle(next, nums);
    // }

    // // 12. best time to buy and sell the stocks
    // // Input: prices = [7,1,5,3,6,4]
    // // Output: 5
    // public static void main(String[] args) {

    // int[] arr = {7,1,5,3,6,4};
    // int maxProfit = 0;
    // int minPrice = Integer.MAX_VALUE;
    // for(int i = 0; i<arr.length; i++){
    // minPrice = Math.min(minPrice, arr[i]);
    // int max = arr[i] - minPrice;
    // maxProfit = Math.max(maxProfit, max);
    // }
    // System.out.println(maxProfit);
    // }

    // // 13. merge sorted arrays
    // // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    // // output: [1,2,2,3,5,6]
    // public static void main(String[] args) {
    // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    // int m = 3;
    // int[] nums2 = { 2, 5, 6 };
    // int n = 3;
    // // above is given
    // int num1P = m - 1;
    // int num2P = n - 1;
    // int last = nums1.length - 1;
    // while (num2P >= 0) {
    // if (nums1[num1P] <= nums2[num2P] && num1P >= 0) {
    // nums1[last] = nums2[num2P];
    // last--;
    // num2P--;
    // } else {
    // nums1[last] = nums1[num1P];
    // last--;
    // num1P--;
    // }
    // }
    // System.out.println(Arrays.toString(nums1));
    // }

    // // 14. first bad version(binary search)
    // public static void main(String[] args) {
    // boolean[] isBadVersion = { false, false, false, true, true, true, true, true,
    // true };
    // int l = 0;
    // int r = isBadVersion.length - 1;
    // while (l < r) {
    // int mid = l + (r - l) / 2;
    // if (!isBadVersion[mid]) {
    // l = mid + 1;
    // } else {
    // r = mid - 1;
    // }
    // }
    // System.out.println(l);
    // }

    // //15. intersection of two arrays with frequency
    // // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    // // Output: [9,4]
    // public static void main(String[] args) {

    // int[] nums1 = { 4, 9, 5, 9, 4 };
    // int[] nums2 = { 9, 4, 9, 8, 4 };

    // Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    // ArrayList<Integer> arrList = new ArrayList<>();

    // for (int i = 0; i < nums1.length; i++) {
    // if (hashtable.containsKey(nums1[i])) {
    // hashtable.put(nums1[i], hashtable.get(nums1[i]) + 1);
    // } else {
    // hashtable.put(nums1[i], 1);
    // }
    // }
    // for (int i = 0; i < nums2.length; i++) {
    // if (hashtable.containsKey(nums2[i])) {
    // arrList.add(nums2[i]);
    // hashtable.put(nums2[i], hashtable.get(nums2[i]) - 1);
    // if (hashtable.get(nums2[i]) == 0) {
    // hashtable.remove(nums2[i]);
    // }
    // }
    // }
    // int[] arr = new int[arrList.size()];
    // for (int i = 0; i < arrList.size(); i++) {
    // arr[i] = arrList.get(i);
    // }
    // System.out.println("intersections are: " + arrList);
    // }

    // 16. sort 0, 1 and 2
    // Input: nums = [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]
    // public static void main(String[] args) {
    //     int count0 = 0;
    //     int count1 = 0;
    //     int count2 = 0;
    //     int[] nums = { 2, 0, 2, 1, 1, 0 };
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == 0) {
        // count0++;
        // } else if (nums[i] == 1) {
        // count1++;
        // } else {
        // count2++;
        // }
        // }
        // int ind = 0;
        // for (int i = 0; i < count0; i++) {
        // nums[ind] = 0;
        // ind++;
        // }
        // for (int i = 0; i < count1; i++) {
        // nums[ind] = 1;
        // ind++;
        // }
        // for (int i = 0; i < count2; i++) {
        // nums[ind] = 2;
        // ind++;
        // }
        // System.out.println(Arrays.toString(nums));

        // alternative approach using dutch
        // int l = 0;
        // int r = nums.length - 1;
        // int i = 0;
        // while (i <= r) {
        //     if (nums[i] == 0) {
        //         int temp = nums[i];
        //         nums[i] = nums[l];
        //         nums[l] = temp;
        //         l++;
        //         i++;
        //     } else if (nums[i] == 1) {
        //         i++;
        //     } else {
        //         int temp = nums[i];
        //         nums[i] = nums[r];
        //         nums[r] = temp;
        //         r--;
        //     }
        // }
        // System.out.println(Arrays.toString(nums));
    // }




    //17. find all pairs of numbers that sum up to a given target.
    // brute force approach
    // public static void main(String[] args) {
    // int[] arr = { 2, 7, 4, -5, 11, 5, 20 };
    // int target = 22;
    // List<List<Integer>> result = new ArrayList<>();
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // int numFind = target - arr[i];
    // if (numFind == arr[j]) {
    // List<Integer> list = new ArrayList<>();
    // list.add(arr[i]);
    // list.add(arr[j]);
    // result.add(list);
    // }
    // }
    // }
    // System.out.println(result);
    // }

    // // optimal approach with timecomplexity of (n):
    // public static void main(String[] args) {
    // int[] arr = { 2, 7, 4, -5, 11, 5, 20 };
    // int target = 9;
    // List<List<Integer>> result = new ArrayList<>();
    // HashMap<Integer, Integer> hm = new HashMap<>();
    // for (int i = 0; i < arr.length; i++) {
    // int numFind = target - arr[i];
    // if (hm.containsKey(numFind)) {
    // result.add(Arrays.asList(arr[i], numFind));
    // }
    // hm.put(arr[i], 1);
    // }
    // System.out.println(result);
    // }

    // // 18.find the length of the longest subarray that has a sum equal to zero.
    // public static void main(String[] args) {
    //     int[] arr = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23 };
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     int max = 0;
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //         if (sum == 0) {
    //             max = i + 1;
    //         }

    //         if (hm.containsKey(sum)) {
    //             max = Math.max(max, i - hm.get(sum));
    //         } else {
    //             hm.put(sum, i);
    //         }
    //     }
    //     System.out.println(max);
    // }
}
