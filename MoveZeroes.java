public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            int i = 0;
            int temp = 0;
    
            while(i < nums.length){
                if(nums[i] != 0){
                    nums[temp++] = nums[i]; 
                }
                i++;
            }
            while(temp < nums.length){
                nums[temp++] = 0;
            }
        }
    }
