public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int count;
        for(int i = 0; i < nums.length /2  ; i++){
                
            count = nums[i];
            nums[i] = nums[nums.length - i -1];
            nums[nums.length - i -1] = count;


        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);

        }
    }

 }
    

