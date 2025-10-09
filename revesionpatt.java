public class revesionpatt {
    public static void main (String a[]){
        // ######## pattern 1 ###########
    //     int n=3;
    //     for(int i=0;i<=n;i++){
    //     for(int j=0;j<=4;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }   
    
    
    
    //###### pattern 2 #############
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     int m=5;
    //     for(int j=1;j<=m;j++){
    //         if (i==1 || i==n ||j==1||j==m){
    //         System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
            
    //     }
    //     System.out.println();
    // }


   // ########### pattern 3 #######################

//    int n=4;
//    for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//      System.out.print("*");
//     }
//     System.out.println();
//    }



//####### pattern 4 ########### 

// int n=4;
// for (int i=0;i<=n;i++){
//     for(int j=0;j<=n-i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


//############ pattern 5 ########### 
int n=4;
for (int i=0;i<=n;i++){
    for (int j=0;j<=n-i;j++){
        System.out.print("-");
    
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    
    }
        System.out.println();
    }


}
}
    

