public class SetMismatch {
        public int[] findErrorNums(int[] nums) {
            int[] arr = new int[2];
            int i = 0;
             int l = nums.length;
            while(i < l){
                int correct = nums[i] - 1;
                if(nums[i] <= l && nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }else{
                    i++;
                }
            } 
            for(int j = 0; j < l; j++){
                if(nums[j] - 1 != j){
                    arr[0] = nums[j];
                    arr[1] = j + 1;
                    break;
                } 
            }
            return arr;
        }
}
