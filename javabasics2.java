
public class javabasics2{

    public static float averagethree(int a , int b , int c){
        float result=(float)((a+b+c)/3);
        return result;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static String isPalindrome(int n){
        int temp = n;
        int remNumber=0;
        while(n>0){
        int lastdigit = n%10;
        remNumber = remNumber*10 + (lastdigit);
        n=n/10;}
        if(temp==remNumber){
            return "Palindrome";
        }
        return "Not a Palindrome";

    }

    public static int SumOfIntegers(int number){
        int sum=0;
        while(number>0){
            int lastdigit=number%10;
            sum=sum+lastdigit;
            number=number/10;
        }
        return sum;
    }
    public static void main(String args[]){
        // int binarynumber=11;
        // int decimal=0;
        // int pow=0;
        // while(binarynumber>0){
        //     int lastdigit=binarynumber%10;
        //     decimal = decimal+(int)(lastdigit*(Math.pow(2,pow)));
        //     binarynumber=binarynumber/10;
        //     pow++;
        // }
        // System.out.println(decimal);
       
        System.out.println(SumOfIntegers(4569));

    
    }
}