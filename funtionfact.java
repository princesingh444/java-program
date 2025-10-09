import java.util.Scanner;
public class funtionfact {
    public static void calculateFactorial (int n){
        int factorial=1;
        if (n<0){
            System.out.println(" invailid entry ");
        }
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("the factorial is : "+factorial);
        return ;
    }
    public static void main (String a[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
 calculateFactorial(n);
    }
}
