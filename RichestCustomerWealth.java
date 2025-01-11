public class RichestCustomerWealth {
        public int maximumWealth(int[][] accounts) {
            int ans = 0;
            for (int[] account : accounts) {
                int sum = 0;
                for (int j = 0; j < account.length; j++) {
                    sum = sum + account[j];
                }
                if(sum > ans){
                    ans = sum;
                }
            }
            return ans;
        }
    }
