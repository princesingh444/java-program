import java.util.Scanner;

class calculator {
    public int sub(int n1,int n2){
        
      int r= n1-n2;
      System.out.println("sub = "+r);
    return 0;
    }
}
public class tut14 {
    public static void main (String a[]){
        Scanner input = new Scanner (System.in);
// int num1=50;
// int num2=30;
System.out.println(" enter the value of num1  = ");
int num1=input.nextInt();
System.out.println(" enter the value of num2  = ");
int num2=input.nextInt();
calculator calc=new calculator ();

int result =calc.sub(num1,num2);

//int result =num1+num2;
System.out.println(result);
    }
}
