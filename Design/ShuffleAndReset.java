package Design;

import java.util.Arrays;
import java.util.Random;

public class ShuffleAndReset {
    
    int[] nums;

    public ShuffleAndReset(int[] nums){
        this.nums = nums;
    }

    public int[] reset(){
        return nums;
    }

    public int[] shuffle(){
        int[] shuffled = nums.clone();
        Random r = new Random();
        for(int i = 0; i<shuffled.length; i++){
            int random = r.nextInt(shuffled.length);
            int temp = shuffled[random];
            shuffled[random] = shuffled[i];
            shuffled[i] = temp;
        }
        return shuffled;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        ShuffleAndReset obj = new ShuffleAndReset(arr);
        System.out.println(Arrays.toString(obj.shuffle()));
        System.out.println(Arrays.toString(obj.reset()));

    }

}
