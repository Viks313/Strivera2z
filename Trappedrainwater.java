public class Trappedrainwater {
    public static int trappedrainwater(int numbers[]){
        //left max boundary
        int leftmax[]=new int[numbers.length];
        leftmax[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            leftmax[i]=Math.max(numbers[i],leftmax[i-1]);
        }
        //right max boundary 
        int rightmax[]=new int[numbers.length];
        rightmax[numbers.length-1]=numbers[numbers.length-1];
        for(int i=numbers.length-2;i>=0;i--){
            rightmax[i]=Math.max(numbers[i],rightmax[i+1]);
        }
        // trapped waters
        int trappedrainwater=0;
        for(int i=0;i<numbers.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedrainwater+=waterlevel-numbers[i];
        }
        return trappedrainwater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}
