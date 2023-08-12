public class Alogo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] newNums = new int[nums.length] ;
        int count = nums.length -1;
        for(int i = 0; i < nums.length  ; i++){
                newNums[i] = nums[count];
                count--;

            }
        for (int i = 0; i < nums.length; i++){
            nums[i] = newNums[i];
            System.out.println(nums[i]);
        }
        

        }
    }
    

