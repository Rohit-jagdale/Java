package patterns;

public class Pattern {
    public static void main(String[] args) {

        // // ******
        // // ******
        // // ******
        // // ******
        // int r = 4;
        // int c = 6;
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // *****
        // // * *
        // // * *
        // // *****
        // int r = 4;
        // int c = 5;
        // for(int i = 1; i<=r; i++){
        // for(int j = 1; j<=c; j++){
        // if(i == 1 || j ==1 || i == r || j == c){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // *
        // // **
        // // ***
        // // ****
        // int r = 4;
        // for(int i = 1; i<=r; i++){
        // for(int j = 1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.err.println();
        // }

        // // ****
        // // ***
        // // **
        // // *
        // int r = 4;
        // for(int i = 1; i<=r; i++){
        // for(int j = r; j>=i; j--){
        // System.out.print("*");
        // }
        // System.err.println();
        // }

        // // *
        // // **
        // // ***
        // // ****
        // int r = 4;
        // for(int i = 1; i <= r; i++){
        // for(int j = r-1; j>=i; j--){
        // System.err.print(" ");
        // }
        // for(int m = 1; m<=i; m++){
        // System.err.print("*");
        // }
        // System.err.println();
        // }

        // // 1
        // // 12
        // // 123
        // // 1234
        // // 12345
        // int r = 5;
        // for(int i = 1; i<= r; i++){
        // for(int j = 1; j <= i; j++){
        // System.err.print(j+ " ");
        // }
        // System.err.println();
        // }

        // // 12345
        // // 1234
        // // 123
        // // 12
        // // 1
        // int r = 5;
        // for(int i = 1; i<=r; i++){
        // for(int j = 1; j<=r-i+1; j++){
        // System.err.print(j+" ");
        // }
        // System.err.println();
        // }

        // // 1
        // // 2 3
        // // 4 5 6
        // // 7 8 9 10
        // // 11 12 13 14 15
        // int r = 5;
        // int num = 1;
        // for(int i = 1; i <=r; i++){
        // for(int j = 1; j<=i; j++){
        // System.err.print(num+ " ");
        // num++;
        // }
        // System.err.println();
        // }

        // // 1
        // // 01
        // // 101
        // // 0101
        // // 10101
        // int n = 5;
        // for(int i =1; i<=n;i++){
        // for(int j = 1; j<=i; j++){
        // if((i+j) % 2 == 0 ){
        // System.out.print("1");
        // }else{
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // // * *
        // // ** **
        // // *** ***
        // // ********
        // // ********
        // // *** ***
        // // ** **
        // // * *

        // int r = 4;

        // //upper part
        // for(int i = 1; i<=r; i++){
        // for(int j = 1; j<=i; j++){
        // System.err.print("*");
        // }
        // for(int l = 2*(r-i); l >=1; l--){
        // System.out.print(" ");
        // }
        // for(int m = 1; m<=i; m++){
        // System.out.print("*");
        // }
        // System.err.println();
        // }
        // //inverse of upper part
        // for(int i = r; i>=1; i--){
        // for(int j = 1; j<=i; j++){
        // System.err.print("*");
        // }
        // for(int l = 2*(r-i); l >=1; l--){
        // System.out.print(" ");
        // }
        // for(int m = 1; m<=i; m++){
        // System.out.print("*");
        // }
        // System.err.println();
        // }

        // // *****
        // // *****
        // // *****
        // // *****
        // // *****

        // int r = 5;
        // for(int i = 1; i<=r; i++){
        // for(int j = 0; j< r-i; j++){
        // System.out.print(" ");
        // }
        // for(int m = 1; m<= r; m++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // 1
        // // 2 2
        // // 3 3 3
        // // 4 4 4 4
        // // 5 5 5 5 5

        // int r = 5;
        // for(int i = 1; i <= r; i++){
        // for(int j = 0; j< r-i; j++){
        // System.out.print(" ");
        // }
        // for(int m = 1; m<=i; m++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        // // 1
        // // 212
        // // 32123
        // // 4321234
        // // 543212345

        // int r =5;
        // for(int i = 1; i <= r; i++){
        // for(int j = 0; j< r-i; j++){
        // System.out.print(" ");
        // }
        // for(int j = i; j>=1; j--){
        // System.out.print(j);
        // }
        // for(int j = 2; j<=i; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // *
        // // ***
        // // *****
        // // *******
        // // *****
        // // ***
        // // *

        // int r = 4;
        // // upper part
        // for(int i = 1; i <= r; i++){

        // for(int j = 0; j< r-i; j++){
        // System.out.print(" ");
        // }
        // for(int j = 1; j<= (2*i)-1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // //lower part
        // for(int i = r-1; i >= 1; i--){

        // for(int j = 0; j< r-i; j++){
        // System.out.print(" ");
        // }
        // for(int j = 1; j<= (2*i)-1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // print pascal triangle

        // int r = 5;
        // for(int i = 1; i<= r; i++){

        // for(int j = 0; j<r-i; j++){
        // System.out.print(" ");
        // }
        // int num = 1;
        // for(int j = 1; j<=i; j++){
        // System.out.print(num+" ");
        // num = num * (i - j) / j;
        // }
        // System.out.println();
        // }

    }
}
