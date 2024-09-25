public class subarraysum{

    public static void optimizedsubarray(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int [numbers.length];

        prefix[0]=numbers[0];
        // calculate prefix array
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                //instead of loop
                currentSum = start==0 ?prefix[end]: prefix[end]-prefix[start-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void kadanesalgo(int numbers[]){
        int currentSum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            currentSum+=numbers[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxsum=Math.max(maxsum,currentSum);
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        optimizedsubarray(numbers);
        kadanesalgo(numbers);
    }
}