package basicofjava.loops;

public class pattern { 
    public static void main(String[] args) {
       int n=5 , number =1;
       
    //    int m=5;


    //    for(int i = 1; i<=n;i++){

    //     for(int j =1 ; j<=m;j++){
    //         if (i==1 || j==1 ||i==n || j==m) {
    //             System.out.print("*");
               
    //         }else{
    //             System.out.print( " ");
    //         }
            
            
    //     }
    //     System.out.println();


    //     }

        //  for(int i = 1; i<=n;i++){
        //     for(int j =1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
   
        // }

        //  for(int i = n; i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }


        //   for(int i = n; i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        // for(int i = 1; i<=n;i++){
        //     for(int j =m; j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
   
        // }
        // for(int i =1 ;i<=m;i++){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //  for(int i =m ;i>=1;i--){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

       
    //    for(int i=0; i<n; i++) {
    //        for(int j=0; j<m; j++) {
    //            if(i == 0 || i == n-1 || j == 0 || j == m-1) {
    //                System.out.print("*");
    //            } else {
    //                System.out.print(" ");
    //            }
    //        }
    //        System.out.println();
    //    }


    // int n = 4;
    // // int m = 5;
    // for(int i=0; i<n; i++) {
    //     for(int j=0; j<m; j++) {
    //         if(i == 0 || i == n-1 || j == 0 || j == m-1) {
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }


    // for(int i=1; i<=n; i++) {
    //     //spaces
    //     for(int j=n; j<=n-i; j++) {
    //         System.out.print("*");
    //     }


    //     //stars
    //     // for(int j=1; j<=n; j++) {
    //     //     System.out.print("*");
    //     // }
    //     System.out.println();
    // }

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //      System.out.println();
    // }


    //   for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //      System.out.println();
    // }
     
     
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+ " ");
    //         number++;
    //     }
    //      System.out.println();
    // }

     
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //        if ((i+j) % 2==0) {
    //         System.out.print(1 +" ");
            
    //        }else{
    //         System.out.print(0 +" ");
    //        }
    //     }
    //      System.out.println();
    // }





    // for(int i=1 ; i<=n;i++){
    //     for(int j=1 ;j<=i;j++){
    //         System.out.print("*");
    //     }

    //     for(int j=0;j<=2*(n-i);j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }

    //     System.out.println();
    // } 

    // for(int i=n ; i>=1; i--){
    //     for(int j=1 ;j<=i;j++){
    //         System.out.print("*");
    //     }

    //     for(int j=0;j<=2*(n-i);j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }

    //     System.out.println();
    // } 

        // for(int i=1 ;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //  for(int i=1 ;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }



         for(int i=1 ;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


   }
}


        
    
    


    

