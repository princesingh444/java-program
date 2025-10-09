import java.util.Scanner;


public class funtionmulti {
    public static int calculateMulti(int n1,int n2){
        int multi =n1*n2;
    return n1*n2;
}
public static void main (String a[]){
    Scanner sc=new Scanner(System.in);
    int n1 =sc.nextInt();
    int n2 =sc.nextInt();
    int multi = calculateMulti(n1, n2);
    System.out.println("the multification is = "+multi);
}
}
