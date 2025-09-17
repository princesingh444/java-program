import java.util.Scanner;
public class tut11 {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print(" enter the value of n = ");
        int n=input.nextInt();
       input.close();
       int i=0;
        while (i<=n){
            System.out.print(" i love u ");
            System.out.println(i);
            i++;
        }
    }
}
