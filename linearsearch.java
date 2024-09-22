import java.util.Arrays;
public class linearsearch{
    public static int linesearcg(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largestOfAll(int numbers[]){
        int largest=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int Binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid] < key ){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            

        }
        return -1;
    }
   
    public static void main(String args[]){
        int numbers[]={14,15,16,17,18,19,5,6,4,8,9,2,3,95,96,97,98,10,15,16,18,12,10};

        int key =14;

        Arrays.sort(numbers);

        int index=Binarysearch(numbers,key);
        if(index!=-1){
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("Index for the key is "+ index);

        }else{
            System.out.println(-1);
        }

    }
}