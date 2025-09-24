class human {
   private int age;
   private String name;

public human(){
 age =18;
name ="prince";
 }
public int getage(){
    return age;
}
public void setage(int age )
{
    this.age=age;
}
public String getname(){
    return name;
}
public void setname(String name){
     this.name=name;
}
}
public class constractor {
    public static void main (String a[]){
        human obj =new human ();
        System.out.println(obj.getname()+" : "+ obj.getage() );
    }
}
