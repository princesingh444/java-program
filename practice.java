public class practice {
    public static void main (String a[]){

 // #####  solid rectangle #######

//    int n=5;
//    for(int i=1;i<=n-1;i++){
//     for(int j=1;j<=n;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
//    }

//######## hollow pattern  ############


// int m=5;
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if (i==1||j==1||i==n||j==m){
//         System.out.print("*");
//         }
//         else
//         {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }


// ######## half piramid #######//#endregion

// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
// System.out.print("*");
//     }
//     System.out.println();
// }


//######## inverted half piramid ##########//#endregion

// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
// System.out.print("*");
//     }
//     System.out.println(" ");
// }

// ###### inverted half piramid 180 degree #######

// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }for(int j=1;j<=i;j++)
//     {
// System.out.print("*");
//     }
//     System.out.println();
// }


// ########### half piramid with number ######


//  int n=5;
//  for (int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
//  }


//########  inverted half pyramid with number #####


// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
// System.out.print(j+" ");
//     }
//     System.out.println();
// }

//######## floyd's tringle #####

// int number =1;
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
// System.out.print(number + " ");
// number++;
//     }
//     System.out.println();
// }


//###### 0-1 tringle ##########

int n=5;
for(int i=1;i<=n;i++){
    for (int j=1;j<=i;j++){
        int sum=i+j;
        if (sum%2==0){
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }System.out.println();
}
    }
}
