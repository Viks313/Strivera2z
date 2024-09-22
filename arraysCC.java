public class arraysCC{
    public static void main(String args[]){
        int marks[]=new int[100];

        marks[0]=100;
        marks[1]=96;
        marks[2]=97;

        System.out.println("Physics: "+marks[0]);
        System.out.println("chemistry: "+marks[1]);
        System.out.println("Maths: "+marks[2]);
        System.out.println("Social: "+marks[3]);

        marks[3]=95;
        System.out.println("Social: "+marks[3]);

        System.out.println("The length of the array is "+marks.length);
    }
}