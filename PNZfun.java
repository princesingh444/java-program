import java.util.Scanner;
public class PNZfun {
    public static void pnzNumber(int n){
        if (n>0){
            System.out.println("number is positive ");
        }
        else if (n<0){
            System.out.println("number is negative ");
        }
        else {
            System.out.println("number is zero");
        }

    }
    public static void main (String a[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt ();
    pnzNumber(n);
    }
}
