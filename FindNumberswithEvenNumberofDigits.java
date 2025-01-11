public class FindNumberswithEvenNumberofDigits {
        public int findNumbers(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                int temp = 0;
                int n = nums[i];
                while(n != 0){
                    n = n/10;
                    temp++;
                }
                if(temp%2 == 0){
                    count++;
                }
            }
            return count;
        }
    }
