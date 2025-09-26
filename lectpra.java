import java.util.*;
public class lectpra {
    public static void main (String a[]){
Scanner p = new Scanner (System.in);
System.out.print("enter your choice = ");
int choice=p.nextInt();
switch(choice)
{
    case 1:{
        System.out.println("hello");
        break;
    }
    case 2:{
        System.out.println("namaste");
        break;
    }
    case 3:{
        System.out.println("bonjour");
        break;
    }default:{
        System.out.println("invailid entry !!!!");
    }
}

// if (choice==1){
//     System.out.println("hello");
// }
// else if (choice==2){
//     System.out.println("namaste");
// }
// else if(choice==3){
//     System.out.println("bonjour");
// }
// else{
//     System.out.println("invailid entry!!! please choice only (1,2,3)");
// }


// System.out.print("Enter the first number = ");
// int n1=p.nextInt ();
// System.out.print("Enter the second number = ");
// int n2=p.nextInt();
// if (n1==n2){
//     System.out.println("Equal");
// }
// else if (n1>n2){
//     System.out.println("n1 is greater");
// }else
// {
//     System.out.println("n2 is greater");
// }









// if (n%2==0){
// System.out.println("the number is even ");
// }else {
//     System.out.println("the number is odd");
// }











// System.out.print("Enter your age = ");
// int age=p.nextInt();
// if (age>18 && age<40){
//     System.out.println("you are adult");
// }
// else if (age>40){
//     System.out.println("you are not young !!sorry");
// }
// else {
//     System.out.println("you are not adult");
// }
// System.out.println("your age is = "+age);
    }
}
