import java.util.Scanner;
public class averagefun {
public static int calculateAverage(int n1,int n2,int n3)
{
    int average = (n1+n2+n3)/2;
    return average;
}
    public static void main (String a[]){
    Scanner sc=new Scanner (System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    System.out.println("the average is = "+ calculateAverage(n1, n2, n3));
    }
}
