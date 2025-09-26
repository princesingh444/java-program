import java.util.Scanner;
public class calculator {
  public static void main (String a[]){
Scanner sc=new Scanner (System.in);
System.out.print("enter first numbers = ");
int n1=sc.nextInt();
System.out.print("enter second number = ");
int n2=sc.nextInt();
System.out.print("Enter the operator (+,-,*,/) = ");
char oper=sc.next().charAt(0);
switch(oper){
    case '+':{
    System.out.println("the sum is = "+(n1+n2));
break;
}
    case '-':{
    System.out.println("the sub is = "+(n1-n2));
    break;
    }
    case '*':{
    System.out.println("the multi is ="+ (n1*n2));
    break;
    }
    case '/':{
    System.out.println("the division is ="+(n1/n2));
    break;
    }
    default :
    System.out.println("invailid entry !!!");
    
}

  }  
}
