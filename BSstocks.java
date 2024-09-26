public class BSstocks {
    public static int stocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int Profit=prices[i]-buyprice;
                maxProfit=Math.max(maxProfit,Profit);
            }else{
                buyprice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,4};

        System.out.println(stocks(prices));
    }
}
