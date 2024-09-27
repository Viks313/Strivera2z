import java.util.Scanner;
public class first {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            //columns
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==key){
                System.out.println("the key is found at ( "+i+" , "+j+" )");
                return true;
               }
            }
       }
       System.out.println("Not found");
       return false;
    }
    public static void main(String args[]){

        int matrix[][]=new int [3][3];

        Scanner input=new Scanner(System.in);
        int n=matrix.length;
        int m=matrix[0].length;
        //Input

        //rows
        for(int i=0;i<n;i++){
             //columns
             for(int j=0;j<m;j++){
                matrix[i][j]=input.nextInt();
             }
        }

       //Output
       for(int i=0;i<n;i++){
        //columns
        for(int j=0;j<m;j++){
           System.out.print(matrix[i][j]+" ");
        }
        System.out.println() ;
   }
search(matrix, 8);
    }   
}
