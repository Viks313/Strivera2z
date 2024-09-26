public class Bubblesort {
    public static void Bsort(int array[] ){
        for(int turn=0;turn<array.length;turn++){
            int swaps=0;
            for(int j=0;j<array.length-1-turn;j++){
                
                if(array[j]>array[j+1]){

                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                swaps++;
            }
            }
            if(swaps==0){
                break;
            }
            
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Bsort(arr);
        printarray(arr);
        
    }
}
