import java.util.Scanner;
public class funtion {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
 public static void main (String a []){
     Scanner sc=new Scanner (System.in);
     String name=sc.next();
     printMyName(name);
 }
}
