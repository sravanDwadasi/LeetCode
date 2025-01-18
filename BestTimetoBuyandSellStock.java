public class BestTimetoBuyandSellStock {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxPrice = 0;
    
            for(int currentPrice : prices){
                minPrice = Math.min(currentPrice, minPrice);
                maxPrice = Math.max(maxPrice, currentPrice - minPrice);
            }
            return maxPrice;
        }
    }
