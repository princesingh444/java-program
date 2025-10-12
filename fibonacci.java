import java.util.Scanner;
public class fibonacci{
    public static void main (String []args){
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        int n1=0,n2=1;
        System.out.println(n1+" ");
        if (n>0){
            for(int i=2;i<=n;i++){
                System.out.println(n2+" ");
                int temp =n2;
                n2=n1+n2;
                n1=temp;
            }
            System.out.println();
        }
    }
}