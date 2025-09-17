import java.util.Scanner;
public class tut17 {
    public static void main (String a[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n1 = ");
        int n1=input.nextInt();
        System.out.println("Enter the value of n2 = ");
        int n2=input.nextInt();
        int result =n1*n2;
        System.out.println("The result is = "+result);
    }
}
