// jagged array 
public class tut22 {
    public static void main(String a[]){
        int arr [][]=new int [3][];
        arr[0]=new int [3];
        arr[1]=new int [2];
        arr[2]=new int [3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

}
}