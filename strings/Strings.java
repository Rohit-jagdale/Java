package strings;
import java.util.*;

public class Strings {

    public static void main(String[] args) {

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

    }
}
