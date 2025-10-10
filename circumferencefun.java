import java.util.Scanner;
public class circumferencefun {
    public static void circumference(int r){
        double x=3.14;
        double c= 2*x*r;
        System.out.println("the circumference of a circle is = "+c);
        return ;
    }
    public static void main (String a[]){
       Scanner sc=new Scanner (System.in);
       int r=sc.nextInt();
       circumference(r);

    }
}
