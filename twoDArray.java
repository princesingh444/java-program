import java.util.Scanner;
public class twoDArray {
    public static void main (String a[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the rows number = ");
        int rows = sc.nextInt();
        System.out.print("Enter the colums number = ");
        int col=sc.nextInt();
        int number[][]=new int [rows][col];
      System.out.println("Enter the numbers = ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
              number [i][j]=sc.nextInt();
            }
        }

        System.out.println("the number is = ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
