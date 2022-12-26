public class buy_and_sell_stock {
    public static void main(String[] args) {
        int daily_price[] = { 7,1,5,3,6,4};
        System.out.println(stock(daily_price)); 
        System.out.println(mp(daily_price));
    }
    public static int stock(int daily_price[]) {
        int buy_price = Integer.MAX_VALUE ;
        int max_profit = 0;
        for(int i=0;i<daily_price.length;i++){
            if(buy_price < daily_price[i] ){
                int profit = daily_price[i] - buy_price ;
                max_profit = Math.max(profit, max_profit);
            }
            else 
            buy_price = daily_price[i];
        }
        return max_profit;
    }

    
    public static int mp(int daily_price[]) {
        int buy = daily_price[0];
        int profit = 0;
        for (int i = 1; i < daily_price.length; i++) {
            if (buy < daily_price[i]) {
                profit = Math.max(daily_price[i] - buy, profit);
            } else {
                buy = daily_price[i];
            }
        }
        return profit;
    }
}
