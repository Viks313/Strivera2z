public class Mergesort {
    //To Print an Array
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Merge Sort Of an Array
    public static void mergesort(int arr[],int si,int ei){ 

        if(si>=ei){
            return;
        }
        //mid Or divide
        int mid=si+(ei-si)/2;

        //Left Part
        mergesort(arr,si,mid);
        //right part
        mergesort(arr,mid+1,ei);

        //Combine
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        //temp array
        int temp[]=new int[ei-si+1];
        int i=si; //iterator from left
        int j=mid+1; //iterator from right
        int k=0; //iterator from temp
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
               
            }else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printarr(arr);
    }
    
}
