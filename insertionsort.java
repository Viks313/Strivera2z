public class insertionsort {

    public static void Isort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={45,56,89,22,61,34,12,8,25,6};
        Isort(arr);
        printarray(arr);
    }
}
