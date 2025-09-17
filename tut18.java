// method overloading 
class calculator {
    public int add(int n1,int n2,int n3){
        return (n1+n2+n3);
    }
public int add(int n1,int n2){
    return (n1+n2);
}
public double add(double n1,double n2){
    return n1+n2;
}
}
public class tut18 {
    public static void main (String a[]){
calculator calc=new calculator ();
int result =calc.add(21,9,37); //here change the datatype and take result.
System.out.println(result);
    }
}
