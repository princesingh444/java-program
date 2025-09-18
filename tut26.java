// mutable String = change and immutable String =unchange
public class tut26 {
    public static void main(String a[]){
        String name="prince"; // here this String is immutable String .
                                   // so it dosen't change
        name=name+" singh";
        System.out.println(name);
        String s1="Prince";  // s1 and s2 have same address ..
        String s2="Prince";
        System.out.println(s1==s2);
    }
}
