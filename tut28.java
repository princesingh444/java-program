class mobile
{
    int price;
    static String name;       //static are use to print same value 
    String brand;

    public void show(){ // it's a instance method .
    System.out.println("name : "+ name + "," + " price : "+ price +","+ " brand : "+brand);
}

}

public class tut28 {
    public static void main (String a[]){
        mobile obj1=new mobile ();
        obj1.price=100000;
        obj1.name="smartphone";   
        obj1.brand="iphone";

        mobile obj2=new mobile ();
        obj2.price=150000;
        obj2.name="phone";      // because phone call by later.
        obj2.brand="sumsung";   // so the name is phone not a smartphone .

        obj1.show();
        obj2.show();


        // System.out.println("Name : "+obj1.name);
        // System.out.println("Price :"+obj1.price);
        // System.out.println("Brand :"+obj1.brand);
        // System.out.println("\n");
        // System.out.println("Name : "+obj2.name);
        // System.out.println("Price :"+obj2.price);
        // System.out.println("Brand :"+obj2.brand);
    }
}
