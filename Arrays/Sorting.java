package Arrays;
public class Sorting {
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={6, 7, 4, 2, 1};
        for(int i =0; i< arr.length-1; i++){
            int small = i;
            for(int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[small]){
                    int temp = arr[j];
                    arr[j] = arr[small];
                   arr[small] = temp;                }
            }
        }
        printArray(arr);
    }
}
