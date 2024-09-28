import java.util.*;

public class Stringbasic {
 public static void main(String args[]){
    //char
    String name="Bond";
    String Lastname=new String("bond");
    Scanner input =new Scanner(System.in);

    String Goal=input.nextLine();

    System.out.println(Goal);
    System.out.println(Goal.length());

    System.out.println("Do you know what it takes to  "+ Goal);


    System.out.println(Goal.charAt(5));


 }   
}
