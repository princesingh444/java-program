import java.util.Scanner ;
public class greaterfun {
    public static void greaterNumber(int n1,int n2){
        if (n1>n2){
            System.out.println("this is greater number = "+n1);
        }
        else if (n1<n2){
            System.out.println("this is greater number = "+n2);
        }else {
            System.out.println("both are equal");
        }
        
    }
    public static void main (String a[]){
 Scanner sc=new Scanner (System.in);
 int n1=sc.nextInt();
 int n2=sc.nextInt();
 greaterNumber(n1, n2);
    }
}
