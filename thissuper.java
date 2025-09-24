class A{
    public A()
    {super();
        System.out.println("in a") ;
     }
  public A(int n)
  { super();
System.out.println("hi a ");
 }

}
class B extends A{
    public B(){
        super ();
        System.out.println("in b");
    }
    public B(int n){ 
        this ();
System.out.println("hi b ");
    }
}
public class thissuper {
    public static void main (String a[])
{
    B obj = new B (9);

}
}
