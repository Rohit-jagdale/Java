import java.util.Stack;

public class other {

    
    // //number of 1 bits
    // public static void main(String[] args) {
    // int n = 11;
    // int a = 1;
    // int c = 0;
    // for(int i = 0; i<32; i++){
    // if((a&n)!=0){
    // c++;
    // }
    // a <<=1;
    // }
    // System.out.println(c);
    // }





    // //hamming distance
    //     public static void main(String[] args) {
    //     int x = 3, y=4;
    //     int m = x^y;
    //     int a = 1;
    //     int c = 0;
    //     for(int i = 0; i<32; i++){
    //         if((a&m)!=0){
    //             c++;
    //         }
    //         a<<=1;
    //     }
    //     System.out.println(c);
    // }



    // reverse the bits
    // public static void main(String[] args) {
    //     int n =1342177280;
    //     int r = 0;
    //     for(int  i= 0; i<32; i++){
    //         r<<=1;
    //         int c = n&1;
    //         r = r|c;
    //         n>>=1;
    //     }
    //     System.out.println(r);
    // }




    // //missing number
    // public static void main(String[] args) {
    //     int[] arr = {9,6,4,2,3,5,7,0,1};
    //     int sum = 0;
    //     int tsum = 0;
    //     for(int i = 0; i<arr.length; i++){
    //         sum+=arr[i];
    //     }
    //     for(int i = 0; i<=arr.length; i++){
    //         tsum+=i;
    //     }
    //     int a = tsum - sum;
    //     System.out.println(a);
    // }



    // valid parenthess
    // public static boolean validParantheses(String s){
    //     Stack<Character> stack = new Stack<>();
        
    //     for(int i = 0; i<s.length();i++){
    //         if(s.charAt(i) == '('){
    //             stack.push(')');
    //         }else if(s.charAt(i)== '['){
    //             stack.push(']');
    //         }else if(s.charAt(i)== '{'){
    //             stack.push('}');
    //         }else if(stack.isEmpty() || stack.pop()!=s.charAt(i)){
    //             return false;
    //         }
    //     }
    //     return stack.isEmpty();
    // }
    // public static void main(String[] args) {
    //     String s = "(){}[]";
    //     if(validParantheses(s)){
    //         System.out.println("yes");
    //     }else{
    //         System.out.println("no");
    //     }
    // }
}
