// ######  class & object ######
class calculator {          // calculator is a name of class 
    int a;                  // integer 
public int add(int n1,int n2){             // public is a who can access and other called method 
    int r= n1+n2;
    return r;
}

}
public class tut13 {
    public static void main (String a[]){
int num1=40;
int num2=35;

calculator calc=new calculator();

int result =calc.add(num1,num2);

// int result =num1+num2;
System.out.println(result);
    }
}

