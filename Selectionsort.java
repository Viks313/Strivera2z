public class Selectionsort {
    public static void Ssort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minposition=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minposition]>arr[j]){
                    minposition=j;
                }
            }
            //swapping values
            int temp=arr[minposition];
            arr[minposition]=arr[turn];
            arr[turn]=temp;
        }
    }

    public static void  printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={6,17,8,90,1};
        Ssort(arr);
        printarr(arr);

    }
}
