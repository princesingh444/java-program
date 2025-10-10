import java.util.Scanner;
public class revfuntion {

    // ####### print name #########
//     public static void printMyName (String name1,String name2)
//     {
//         return;
//     }
//     public static void main (String a [] ){
//    Scanner sc = new Scanner (System.in);
//    String name1 =sc.next();
//    String name2 =sc.next();
//    printMyName(name1 , name2);
//    System.out.println(name1 +" " +name2);

    // }

    // ######## sum of two numbers ##########

    // public static int calculatesum(int n1,int n2){
    //     return n1+n2;
    // }
    // public static void main (String a[]){
    //  Scanner sc=new Scanner (System.in);
    //  int n1=sc.nextInt ();
    //  int n2=sc.nextInt ();
    //  calculatesum(n1, n2);
    //  System.out.println("The sum is = "+(n1+n2));
    // }

    // ###### product  of two numbers ##########
     
//  public static int calculateproduct(int n1 , int n2){
//     return n1*n2;
//  }
//     public static void main (String []args){
//         Scanner sc=new Scanner (System.in);
//         int n1=sc.nextInt (); 
//         int n2=sc.nextInt ();
//         System.out.print("the product of 2 numbers is = ");
//         System.out.println(calculateproduct(n1, n2));
//     }



// ############ factorial of a number ###########

public static void calculatefactorial (int n){
    int factorial =1;
    for (int i=n;i>=1;i--){
        factorial =factorial*i;
    }
    System.out.println(factorial);
}
public static void main (String []args ){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt ();
    System.out.print("the factorial is = ");
    calculatefactorial(n);

}

}
