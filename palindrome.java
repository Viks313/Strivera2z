public class palindrome {
   public static void main(String args[]){
    String word="forward";
    int len = word.length();

    for(int i=0;i<word.length()/2;i++){
        if(word.charAt(i)!=word.charAt(len-i-1)){
            System.out.println(false);
            return;
        }
    }
    System.out.println(true);
   } 
}
