//######### Switch case #########

import java.util.Scanner;
public class tut8 {
    public static void main (String a[]){
        Scanner input = new Scanner (System.in);
        System.out.print(" enter the value of n = ");
        int n = input.nextInt();
        switch (n)
        {
            case 1:{
            System.out.println("monday");
            break;
        }
            
            case 2:{
            System.out.println("tuesday");
            break;
            }
         
            case 3:{
            System.out.println("wednesday");
            break;
            }
         
            case 4:{
            System.out.println("thursday");
                 break;
            }
            case 5:{
            System.out.println("friday");
                 break;
        }
        
         
            case 6:{
            System.out.println("saturday");
                 break;
        }
         
         case 7:{
            System.out.println("sunday");
                 break;
        }
        default :{
            System.out.println("invailid entry !!! please enetr vailid number .");
        }
    }
}
}
