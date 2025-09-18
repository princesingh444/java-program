public class tut27 {
    public static void main ( String a[]){
        StringBuffer sb=new StringBuffer("prince");
        System.out.println(sb.capacity());
        sb.append(" singh"); // it's add the word .
        sb.insert(12," java");
        System.out.println(sb.length());
        System.out.println(sb);
        
}
}
