// multidimension array
public class tut20 {
    public static void main (String a[]){
    int arr[] []=new int[3][4];
   // int random=0;
    
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {  // random give value in points so multiply by 10 or 100 than it converted into the integer value
           arr [i][j]=(int)(Math.random()*100);// here we use random digit use of random 
           System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
