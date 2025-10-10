import java.util.Scanner;
public class votefun {
 public static void vote(int age){
  if (age>=18){
    System.out.println("Eligible to vote ");
  }
  else{
    System.out.println("not eligible to vote ");
  }
 }
    public static void main (String a[]){
    Scanner sc=new Scanner (System.in);
    int age=sc.nextInt();
    vote(age);
    }
}
