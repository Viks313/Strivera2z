package Hit;
public class Instructions{
private int x;//instance member variable: why ? not static
private int y;//instance member variable
public void punch(int q,int h){
 x=q;
 y=h;
}
public void Kick(){
 System.out.println(x);
 System.out.println(y);
}
}