
// method of class 
class computer {
  public void playmusic (){
    System.out.println("playing music ~~~");
    }
  public String getmeapen(int cost){
    if (cost>=5){
        return "pen";
    }
else{
    return "nothing";
}
    }
}
public class tut15 {
    public static void main (String a[]){
        computer obj=new computer();
        obj.playmusic();
        String str=obj.getmeapen(3); // put the integer value in here . 
        System.out.println(str);
        }
}
