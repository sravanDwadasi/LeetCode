import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
               swap(nums, i, correct);
            }else i++;
        } 

        List<Integer> arr = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(j+1 != nums[j]){
                arr.add(nums[j]);
            }
        }
        return arr;
    }
}

