import java.util.Scanner;
public class array2 {
    public static void main (String a[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array = ");
       int size=sc.nextInt();
       System.out.println("Enter the numbers = ");
       int numbers[]=new int [size];
       for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
       }
       System.out.println("Enter the finding value = ");
       int x=sc.nextInt();
       System.out.println("The index number is = ");
     
       for(int i=0;i<size;i++){
          if (numbers[i]==x){
        System.out.println(i);
       }
    }
}
}

