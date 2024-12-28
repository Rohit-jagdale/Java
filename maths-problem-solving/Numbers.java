import java.util.*;

public class Numbers {

    // ### **1. Prime Numbers**
    // - **Prime Check:** Determine if a number is prime.
    // - **Prime Generation:** Generate all prime numbers within a range (Sieve of
    // Eratosthenes is commonly used).
    // - **Prime Factorization:** Find all prime factors of a number.

    // ---

    // ### **2. Palindromic Numbers**
    // - Numbers that read the same forward and backward (e.g., 121, 1331).

    // ---

    // ### **3. Armstrong Numbers (Narcissistic Numbers)**
    // - Numbers where the sum of their digits raised to the power of the number of
    // digits equals the number itself (e.g., 153: \(1^3 + 5^3 + 3^3 = 153\)).

    // ---

    // ### **4. Perfect Numbers**
    // - A number equal to the sum of its proper divisors (e.g., 28: \(1 + 2 + 4 + 7
    // + 14 = 28\)).

    // ---

    // ### **5. Abundant and Deficient Numbers**
    // - **Abundant:** Sum of proper divisors > number itself.
    // - **Deficient:** Sum of proper divisors < number itself.

    // ---

    // ### **6. Fibonacci Numbers**
    // - A sequence where each number is the sum of the two preceding ones: \(0, 1,
    // 1, 2, 3, 5, \dots\).

    // ---

    // ### **7. Factorial**
    // - Product of all positive integers up to \(n\) (\(n! = 1 \times 2 \times
    // \dots \times n\)).

    // ---

    // ### **8. Divisors and Multiples**
    // - Finding all divisors of a number.
    // - Determining if a number is a multiple of another.

    // ---

    // ### **9. Perfect Squares and Cubes**
    // - Numbers that are the square (e.g., 16 = \(4^2\)) or cube (e.g., 27 =
    // \(3^3\)) of an integer.

    // ---

    // ### **10. GCD and LCM**
    // - **GCD (Greatest Common Divisor):** Largest number dividing two or more
    // numbers.
    // - **LCM (Least Common Multiple):** Smallest number divisible by two or more
    // numbers.

    // ---

    // ### **11. Happy Numbers**
    // - A number is "happy" if repeatedly summing the squares of its digits
    // eventually leads to 1 (e.g., 19).

    // ---

    // ### **12. Disarium Numbers**
    // - Sum of digits raised to their respective positions equals the number.

    // ---

    // ### **13. Automorphic Numbers**
    // - A number whose square ends with the number itself (e.g., \(5^2 = 25\),
    // \(76^2 = 5776\)).

    // ---

    // ### **14. Harshad (Niven) Numbers**
    // - A number divisible by the sum of its digits (e.g., 18: \(18 \div (1+8) =
    // 2\)).

    // ---

    // ### **15. Magic Numbers**
    // - A number whose digits repeatedly summed lead to 1 (e.g., \(19 \to 1+9=10
    // \to 1+0=1\)).

    // ---

    // ### **16. Strong Numbers**
    // - A number where the sum of the factorial of its digits equals the number
    // itself (e.g., 145: \(1! + 4! + 5! = 145\)).

    // ---

    // ### **17. Friendly Numbers**
    // - Two numbers where the sum of one’s divisors equals the other (e.g., 220 and
    // 284).

    // ---

    // ### **18. Kaprekar Numbers**
    // - A number whose square, when split into two parts, adds up to the number
    // itself (e.g., 45: \(45^2 = 2025 \to 20 + 25 = 45\)).

    // ---

    // ### **19. Triangular Numbers**
    // - Numbers that can form an equilateral triangle: \(T_n = n(n+1)/2\) (e.g., 1,
    // 3, 6, 10).

    // ---

    // ### **20. Hamming Numbers**
    // - Numbers whose only prime factors are 2, 3, or 5 (e.g., 1, 2, 3, 4, 5, 6, 8,
    // 9).

    // ---

    // ### **21. Bit Manipulation in Numbers**
    // - **Power of 2 Check:** Determine if a number is a power of 2.
    // - **Hamming Weight:** Count the number of 1's in the binary representation of
    // a number.
    // - **Reverse Bits:** Reverse the binary representation of a number.

    // ---

    // ### **22. Modulo Arithmetic**
    // - Efficient computations using modulo for large numbers.
    // - Finding modular inverses.

    // ---

    // ### **23. Sum of Digits**
    // - Sum all digits of a number (often used in various puzzles and checks).

    // ---

    // ### **24. Catalan Numbers**
    // - A sequence used in combinatorics to solve problems like valid parenthesis
    // generation.

    // ---

    // ### **25. Binary Numbers**
    // - Conversion between binary, decimal, and hexadecimal.
    // - Check if a binary number is a palindrome.

    // ---

    // These concepts often appear in algorithm challenges, coding tests, and
    // interviews due to their mathematical depth and implementation variety.

    // // Method that returns a string
    // public String getMessage() {
    // for(int i = 0; i<=10; i++){
    // return "Hello";
    // }
    // }

    // public static void main(String[] args) {
    // // Create an instance of the Solution class
    // technicalRoundqustion solution = new technicalRoundqustion();

    // // Call the getMessage method and store the result in a variable
    // String message = solution.getMessage();

    // // Print the message
    // System.out.println(message);
    // }

    //
    // // 1. armstrong number
    // public static void main(String[] args) {
    // int m = 153;
    // int digits = String.valueOf(m).length();
    // int sum = 0;
    // int q = m;
    // while (q > 0) {
    // int rem = q % 10;
    // sum += Math.pow(rem, digits);
    // q = q / 10;
    // }
    // if (sum == m) {
    // System.out.println("yes");
    // } else {
    // System.out.println("no");
    // }
    // }

    // //armstrong no in the given interval
    // public static void main(String[] args) {
    // int m = 1;
    // int n = 9999;
    // int count = 0;
    // ArrayList<Integer> arr = new ArrayList<>();

    // for(int i = m; i<=n; i++){
    // int q = i;
    // int sum = 0;
    // int digits = String.valueOf(q).length();
    // while (q>0) {
    // int rem = q%10;
    // sum += Math.pow(rem, digits);
    // q = q/10;
    // }
    // if(sum == i){
    // arr.add(i);
    // count+=1;
    // }
    // }

    // System.out.println("the armstrong numbers between interval " +m+ " to " +n+"
    // is: "+count+ " and they are: "+arr );

    // }

    // // 2. Disarium number
    // // 1
    // // 1+3^2+5^3=1+9+125=135
    // public static int disarium(int m) {
    // int digits = String.valueOf(m).length();
    // int q = m;
    // int sum = 0;
    // while (q > 0) {
    // int rem = q % 10;
    // sum += Math.pow(rem, digits);
    // q = q / 10;
    // digits--;
    // }
    // return sum;
    // }

    // // Disarium number in given interval
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int m = scanner.nextInt();
    // int n = scanner.nextInt();
    // ArrayList<Integer> arr = new ArrayList<>();
    // int count = 0;
    // for (int i = m; i <= n; i++) {
    // int sum = disarium(i);
    // if (sum == i) {
    // count++;
    // arr.add(i);
    // }
    // }
    // System.out.println(+count + " are " + arr);
    // }

    // 3. fibonacci series
    // public static void main(String[] args) {
    // int max = 10;
    // int[] arr = new int[max];
    // for (int i = 0; i < max; i++) {
    // if (i == 0) {
    // arr[i] = 0;
    // } else if (i == 1) {
    // arr[i] = 1;
    // } else {
    // arr[i] = arr[i - 1] + arr[i - 2];
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }

    // //4. perfect number
    // public static boolean isPerfectNumber(int num){
    // int sum =0;
    // if(num<=1){
    // return false;
    // }

    // for(int i = 1; i<=num/2; i++){
    // if(num%i == 0){
    // sum+=i;
    // }
    // }

    // if(sum == num) {
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    // //check for given interval
    // public static void main(String[] args) {
    // int n = 10;
    // int m = 500;
    // List<Integer> arr = new ArrayList<>();
    // for(int i = n ; i<=m; i++){
    // if(isPerfectNumber(i)){
    // arr.add(i);
    // }
    // }
    // System.out.println(arr);

    // }

    // // 5. check for palindrome no
    // public static boolean isPalindrome(int n) {
    // int rev = 0;
    // int q = n;
    // while (q > 0) {
    // int rem = q % 10;
    // rev = (10 * rev) + rem;
    // q = q / 10;
    // }
    // return n == rev;
    // }

    // // check in given interval
    // public static void main(String[] args) {
    // int m = 100;
    // int n = 200;
    // List<Integer> arr = new ArrayList<>();
    // for (int i = m; i <= n; i++) {
    // if (isPalindrome(i)) {
    // arr.add(i);
    // }
    // }
    // System.out.println(arr);
    // }

    // // 6. find the gcd and lcm of given two numbers(need little careful practice)
    // public static int GCD(int a, int b) {
    // while (b != 0) {
    // int temp = b;
    // b = a % b;
    // a = temp;
    // }
    // return a;
    // }

    // public static int LCM(int a, int b) {
    // int lcm = a * b / (GCD(a, b));
    // return lcm;
    // }

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    // System.out.println("GCD is :" + GCD(a, b));
    // System.out.println("LCM is :" + LCM(a, b));
    // }

    // // 7. happy number
    // public static boolean isHappyNumber(int n) {
    // HashSet<Integer> set = new HashSet<>();
    // while (n != 1) {
    // int sum = 0;
    // while (n > 0) {
    // int digit = n % 10;
    // sum += digit * digit;
    // n = n / 10;
    // }
    // if (set.contains(sum)) {
    // return false;
    // }
    // set.add(sum);
    // n = sum;
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // List<Integer> arr = new ArrayList<>();

    // System.out.println("enter range:");
    // int m = scanner.nextInt();
    // int n = scanner.nextInt();

    // for (int i = m; i <= n; i++) {
    // if (isHappyNumber(i)) {
    // arr.add(i);
    // }
    // }
    // System.out.println(arr);
    // }

    // // 8. Abundant and Deficient Numbers

    // public static boolean isAbundant(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n / 2; i++) {
    // if (n % i == 0) {
    // sum += i;
    // }
    // }
    // if (sum > n) {
    // return true;
    // }
    // return false;
    // }

    // public static boolean isDeficient(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n / 2; i++) {
    // if (n % i == 0) {
    // sum += i;
    // }
    // }
    // if (sum < n) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // int m = 1;
    // int n = 50;
    // List<Integer> arrAbb = new ArrayList<Integer>();
    // List<Integer> arrDif = new ArrayList<Integer>();
    // for (int i = m; i <= n; i++) {
    // if (isAbundant(i)) {
    // arrAbb.add(i);
    // } else if (isDeficient(i)) {
    // arrDif.add(i);
    // }
    // }
    // System.out.println("Abudant numbers in given range are: " + arrAbb);
    // System.out.println("Deficient numbers in given range are: " + arrDif);
    // }

    // //9. Automorphic number check
    // public static boolean isAutomorphic(int n) {
    // int sq = n * n;
    // int lengthofn = String.valueOf(n).length();
    // int lastdigitsofsq = 0;
    // int i = 0;
    // while (i < lengthofn) {
    // int rem = sq % 10;
    // if (i == 0) {
    // lastdigitsofsq = rem;
    // } else {
    // lastdigitsofsq = (rem * 10) + lastdigitsofsq;
    // }
    // sq = sq / 10;
    // i++;
    // }
    // if (lastdigitsofsq == n) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // int m = 1;
    // int n = 100;
    // List<Integer> arr = new ArrayList<>();
    // for (int i = m; i <= n; i++) {
    // if (isAutomorphic(i)) {
    // arr.add(i);
    // }
    // }
    // System.out.println(arr);

    // }

    // 10. Kaprekar Numbers
    // e.g., 45: \(45^2 = 2025 \to 20 + 25 = 45

    // public static boolean isKaprekar(int n) {
    // if (n == 1) return true;

    // int sq = n*n;
    // String sqStr = String.valueOf(sq);

    // String leftS = sqStr.substring(0, sqStr.length()/2);
    // String rightS = sqStr.substring( sqStr.length()/2);

    // int left = leftS.isEmpty()?0: Integer.parseInt(leftS);
    // int right =rightS.isEmpty()?0: Integer.parseInt(rightS);

    // if(left+right==n){
    // return true;
    // }
    // return false;

    // }
    // public class KaprekarNumber {
    // public static void main(String[] args) {
    // int n = 1;
    // int m = 100;
    // List<Integer> arr = new ArrayList<>();
    // for(int i = n; i<= m; i++){
    // if(isKaprekar(i)){
    // arr.add(i);
    // }
    // }
    // System.out.println("numbers in given range is: "+arr);
    // }

    // }

    // //10. triangular numbers (eg. 1, 1+2 = 3, 1+2+3= 6, 1+2+3+4= 10, .....)
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int n = scanner.nextInt();
    // int sum = 0;
    // List<Integer> arr = new ArrayList<>();
    // for(int i =1; i<=n; i++){
    // sum+=i;
    // arr.add(sum);
    // }
    // System.out.println(arr);
    // }

    // // 11. strong number
    // // 1! + 4! + 5! = 145
    // public static void main(String[] args) {
    // int m = 1;
    // int n = 150;
    // List<Integer> arr = new ArrayList<>();
    // for (int i = m; i <= n; i++) {
    // if (isStrong(i)) {
    // arr.add(i);
    // }
    // }
    // System.out.println("ans is: " + arr);
    // }

    // public static boolean isStrong(int num) {
    // int sum = 0;
    // int q = num;
    // while (q > 0) {
    // int rem = q % 10;
    // int factRem = fact(rem);
    // sum += factRem;
    // q = q / 10;
    // }
    // if (sum == num) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static int fact(int n) {
    // int fact = 1;
    // int ans = 1;
    // while (fact <= n) {
    // ans = fact * ans;
    // fact++;
    // }
    // return ans;
    // }

}
