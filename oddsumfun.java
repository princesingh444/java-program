import java.util.Scanner ;
public class oddsumfun {
    public static int oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        } 
        System.out.println("the sum of odd number is = "+sum);
        return sum;
    }
    
    public static void main (String a[]){
      Scanner sc = new Scanner (System.in);
      int n= sc.nextInt ();
      oddSum(n);
      }
}
