public class Quicksort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotindex= partition(arr,si,ei);
        Quicksort(arr,si,pivotindex-1);
        Quicksort(arr,pivotindex+1,ei);
    }

    public static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<arr.length;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
              i++;
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;

            }
    



    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        Quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}
