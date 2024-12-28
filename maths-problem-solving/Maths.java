import java.util.Arrays;
import java.util.Scanner;

public class Maths {
    // //1.fizzbuzz

    // public static String[] fizzbuzz(int n){
    // String[] arr = new String[n];
    // for(int i = 1; i<=n; i++){
    // if(i%3 == 0 && i%5==0){
    // arr[i-1] = "FizzBuzz";
    // }
    // else if(i%3 == 0){
    // arr[i-1] = "Fizz";
    // }
    // else if(i%5==0){
    // arr[i-1] = "Buzz";
    // }
    // else{
    // arr[i-1] = String.valueOf(i);
    // }
    // }
    // return arr;
    // }
    // public static void main(String[] args) {
    // String[] arr = fizzbuzz(15);
    // System.out.println(Arrays.toString(arr));
    // }

    // //2.count primes
    // public static int count(int n){
    // boolean[] arr = new boolean[n];
    // for(int i = 2; i<Math.sqrt(n); i++){
    // if(arr[i]== false){
    // for(int j = 2; i*j<n; j++){
    // arr[i*j] = true;
    // }
    // }
    // }
    // int count = 0;
    // for(int i = 2; i<n; i++){
    // if(arr[i] == false){
    // count++;
    // }
    // }
    // return count;
    // }
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int ans =scanner.nextInt();
    // int result = count(ans);
    // System.out.println(result);
    // }

    // //3.power of three
    // public static boolean isPower(int num){
    // if(num>1){
    // while (num%3==0) {
    // num /= 3;
    // }
    // }
    // return num==1;
    // }
    // public static void main(String[] args) {
    // if(isPower(99)){
    // System.out.println("yes");
    // }else{
    // System.out.println("no");
    // }
    // }

    // // 4.Roman to integer
    // public static int romanToInteger(String s) {
    // int prev = 0;
    // int num = 0;
    // int ans = 0;
    // for (int i = s.length() - 1; i >= 0; i--) {
    // if (s.charAt(i) == 'I') {
    // num = 1;
    // } else if (s.charAt(i) == 'V') {
    // num = 5;
    // } else if (s.charAt(i) == 'X') {
    // num = 10;
    // } else if (s.charAt(i) == 'L') {
    // num = 50;
    // } else if (s.charAt(i) == 'C') {
    // num = 100;
    // } else if (s.charAt(i) == 'D') {
    // num = 500;
    // } else if (s.charAt(i) == 'M') {
    // num = 1000;
    // }
    // if (num < prev) {
    // ans -= num;
    // } else {
    // ans += num;
    // }
    // prev = num;
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // String s = "MCMXCIV";
    // int result = romanToInteger(s);
    // System.out.println(result);
    // }
}