public class FindtheDuplicateNumber {

        public void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        public int findDuplicate(int[] nums) {
            int i = 0;
            while(i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                   swap(nums, i, correct);
                }else i++;
            }
    
            for(int j = 0; j < nums.length; j++){
                if(j+1 != nums[j]){
                    return nums[j];
                }
            }
            return nums[nums.length-1];
        }
}
