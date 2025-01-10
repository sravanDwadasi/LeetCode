import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return nums.length + 1;
    }
    public void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        } 
    }
}

