import java.util.Scanner;

public class strings{
    public static void main (String a[]){
        Scanner sc=new Scanner (System.in);
        String name=sc.next();
        System.out.println(name);
        String fa="my name is prince raghuvanshi ";
        String f=fa.substring(11,17);
        System.out.println(f);
        String firstName="Prince";
        String lastName="Raghuvanshi";
        String fullname=firstName+" "+lastName;
        System.out.println(fullname.length());
        if (firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        // for(int i=0;i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }
    }
}