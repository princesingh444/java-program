public class floydtri {
    public static void main (String a[]){
       int n=4;
       int num=1;
        for(int i=1;i<=n;i++){         
            for(int j=4;j>n-i;j--){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
