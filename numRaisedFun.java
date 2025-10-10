import java.util.Scanner;
public class numRaisedFun {
    public static void raised(double x,double n){
        double result =Math.pow(x, n);
       System.out.println("the result is = "+result);
    }
    public static void main (String a[]){
 Scanner sc=new Scanner (System.in);
 System.out.print("Enter the base number = ");
 double x=sc.nextDouble();
 System.out.print("Enter the exponent number = ");
 double n=sc.nextDouble();
 raised(x, n);
    }
}
