public class arrayPractice{
    public static void reverse(int numbers[]){
        int start=0,end=numbers.length-1;
        while(start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
        }
    }
    public static void arraypairs(int numbers[]){
        for(int i=0;i<=numbers.length-1;i++){
            int currentnumber=numbers[i];
            for(int j=i+1;j<=numbers.length-1;j++){
                System.out.print("( "+currentnumber+" , "+numbers[j]+" )");
            }
            System.out.println();
        }
    }
    public static void subarray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxsubarraysum(int numbers[]){
        int curSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                curSum=0;
                for(int k=start;k<=end;k++){
                    curSum+=numbers[k];
                }
                System.out.println(curSum);
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};

       maxsubarraysum(numbers);
    }
}