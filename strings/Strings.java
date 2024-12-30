package strings;

import java.util.*;

public class Strings {

    // public static void main(String[] args) {

    // 1. palindrome
    // public static boolean ispalindrome(String s){ //move this outside of main
    // int i = 0;
    // int j = s.length()-1;
    // while (j>=(s.length()/2)) {
    // if(s.charAt(i)!=s.charAt(j)){
    // return false;
    // }
    // i++;
    // j--;
    // }
    // return true;
    // }

    // String s = "nitin";
    // if(ispalindrome(s)){
    // System.out.println("yes");
    // } else{
    // System.out.println("no");
    // }

    // System.out.println("palindrome");

    // alternative method
    // StringBuilder sb = new StringBuilder("");
    // for (int i = r.length() - 1; i >= 0; i--) {
    // // System.out.print(r.charAt(i));
    // sb.append(r.charAt(i));
    // }
    // String reversedString = sb.toString();
    // if (r.equals(reversedString)) {
    // System.out.println("palindrome");
    // } else {
    // System.out.println("not palindrome");
    // }

    // 2. valid anagram
    // valid anagram
    // Input: s = "anagram", t = "nagaram"
    // Output: true
    // Example 2:
    // Input: s = "rat", t = "car"
    // Output: false

    // public static boolean isAnagram(String s, String t) { // move outside the
    // main
    // Hashtable<Character, Integer> hashset = new Hashtable<>();

    // for(int i = 0; i<s.length(); i++){
    // if(hashset.containsKey(s.charAt(i))){
    // hashset.put(s.charAt(i),hashset.get(s.charAt(i))+1);
    // }else{
    // hashset.put(s.charAt(i), 1);
    // }
    // }

    // for(int j = 0; j<t.length(); j++){
    // if(hashset.containsKey(t.charAt(j))){
    // hashset.put(t.charAt(j),hashset.get(t.charAt(j))-1);
    // if(hashset.get(t.charAt(j)) == 0){
    // hashset.remove(t.charAt(j));
    // }
    // }else{
    // return false;
    // }
    // }

    // if(hashset.isEmpty()){
    // return true;
    // }

    // return false;
    // }

    // String s = "rac", t = "car";

    // if(isAnagram(s, t)){
    // System.out.println("yes");
    // }else{
    // System.out.println("no");
    // }

    // alternative method
    // int[] charCount = new int[26];

    // if(s.length() != t.length()){
    // return false;
    // }

    // for(int i = 0; i< s.length(); i++){
    // charCount[s.charAt(i) - 'a']++;
    // charCount[t.charAt(i) - 'a']--;
    // }

    // for(int i = 0; i<charCount.length; i++){
    // if(charCount[i] != 0){
    // return false;
    // }
    // }
    // return true;

    // 3. remove duplicate letters
    // remove duplicate letters
    // Set<Character> set = new HashSet<>();
    // StringBuilder ans = new StringBuilder();

    // for(int i = 0; i< s.length(); i++){
    // set.add(s.charAt(i));
    // }

    // for(Character c : set){
    // ans.append(c);
    // }

    // return ans.toString();

    // 3. reverse the string

    // }

    // // 1. reverse the string
    // public static void main(String[] args) {
    // char[] str = { 'h', 'e', 'l', 'l', 'l', 'o' };
    // int l = 0;
    // int r = str.length - 1;
    // while (l < r) {
    // char temp = str[l];
    // str[l] = str[r];
    // str[r] = temp;
    // l++;
    // r--;
    // }
    // System.out.println(Arrays.toString(str));
    // }

    // // 2. first unique character in string
    // public static int firstUniqChar(String s) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // if (!map.containsKey(s.charAt(i))) {
    // map.put(s.charAt(i), 1);
    // } else {
    // map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    // }
    // }

    // for (int i = 0; i < s.length(); i++) {
    // if (map.get(s.charAt(i)) == 1) {
    // return i;
    // }
    // }
    // return -1;
    // }
    // public static void main(String[] args) {
    // String s = "leetcodelove";
    // int ans = firstUniqChar(s);
    // System.out.println(ans);
    // }

    // // 3. is palindrome
    // public static boolean isPalindrome(String s) {
    // String str = "";
    // for (int i = 0; i < s.length(); i++) {
    // if (Character.isLetterOrDigit(s.charAt(i))) {
    // str += s.charAt(i);
    // }
    // }

    // String newStr = str.toLowerCase();
    // int l = 0;
    // int r = newStr.length() - 1;
    // while (l < r) {
    // if (newStr.charAt(l) != newStr.charAt(r)) {
    // return false;
    // }
    // l++;
    // r--;
    // }
    // return true;
    // }
    // public static void main(String[] args) {
    // String s = "A man, a plan, a canal: Panama";
    // if(isPalindrome(s)){
    // System.out.println("yes");
    // }else{
    // System.out.println("no");
    // }
    // }

    // // 4. string to integer
    // public static int myAtoi(String s) {
    // String str = s.trim();
    // int i= 0;
    // int sign = 1;
    // int ans = 0;
    // if(str.length() ==0){
    // return 0;
    // }
    // if(str.charAt(i) == '-'){
    // sign = -1;
    // i++;
    // }else if(str.charAt(i) == '+'){
    // i++;
    // }
    // while(i<str.length() && Character.isDigit(str.charAt(i))){
    // int digit = str.charAt(i) - '0';
    // if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 &&
    // digit>Integer.MAX_VALUE%10)){
    // if(sign == -1){
    // return Integer.MIN_VALUE;
    // }
    // return Integer.MAX_VALUE;
    // }
    // ans = (ans*10) + digit;
    // i++;
    // }
    // return sign*ans;
    // }

    // public static void main(String[] args) {
    // String s = " -042";
    // String str = "1337c0d3";
    // String ss = "67565871263880415826374934852";
    // int a = myAtoi(s);
    // int b = myAtoi(str);
    // int c = myAtoi(ss);
    // System.out.println(a +" " +b+" "+c);
    // System.out.println(Integer.MAX_VALUE);
    // }

    // //5. find the index of first occurence in the string
    // public static int strStr(String haystack, String needle) {
    // for (int i = 0; i <= haystack.length() - needle.length(); i++) {
    // for (int j = 0; j < needle.length(); j++) {
    // if (haystack.charAt(i + j) != needle.charAt(j)) {
    // break;
    // } else if (j == needle.length() - 1) {
    // return i;
    // }
    // }
    // }
    // return -1;
    // }
    // public static void main(String[] args) {
    // String str1 = "rohit", str2 = "hi";
    // String str3 = "rohittt", str4 = "roha";
    // int ans1 = strStr(str1, str2);
    // int ans2 = strStr(str3, str4);
    // System.out.println(ans1+" "+ans2);
    // }

    // // 6. longest comman prefix
    // public static String longestCommonPrefix(String[] strs) {
    //     String pre = strs[0];
    //     for (int i = 1; i < strs.length; i++) {
    //         String temp = "";
    //         int size = Math.min(pre.length(), strs[i].length());
    //         for (int j = 0; j < size; j++) {
    //             if (pre.charAt(j) == strs[i].charAt(j)) {
    //                 temp += pre.charAt(j);
    //             } else {
    //                 break;
    //             }
    //         }
    //         pre = temp;
    //     }
    //     return pre;
    // }

    // public static void main(String[] args) {
    //     String[] strs = {"flower","flow","flight"};
    //     String ans =  longestCommonPrefix(strs);
    //     System.out.println(ans);
    // }

    // //7. length of longest substring
    // public static int lengthOfLongestSubstring(String s) {
    //     HashSet<Character> set = new HashSet<>();
    //     int l = 0;
    //     int ans = 0;
    //     for(int r = 0; r<s.length(); r++){
    //         while(!set.add(s.charAt(r))){
    //             set.remove(s.charAt(l++));
    //         }
    //         ans = Math.max(ans, r-l+1);
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     int ans = lengthOfLongestSubstring("wiygco3uovnwl");
    //     System.out.println(ans);
    // }
}
