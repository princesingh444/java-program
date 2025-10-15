import java.util.Scanner;
public class twoDArray1 {
    public static void main (String a[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Rows number = ");
        int rows=sc.nextInt();
        System.out.print("Enter the columns number = ");
        int cols=sc.nextInt();
        int number[][]=new int [rows][cols];

        System.out.println("Enter the number =");
        for(int i=0;i<rows;i++){
            for(int k=0;k<cols;k++){
                number[i][k]=sc.nextInt();
            }
        }
        System.out.println("Enter the finding number =");
        int x=sc.nextInt();
        System.out.println("The index number is = ");
        for(int i=0;i<rows;i++){
            for(int k=0;k<cols;k++){
                if(x==number[i][k]){
                System.out.print(i+","+k+" ");
            }
            System.out.println();
        }
    }
    }
}
