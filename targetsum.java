package basicofjava.Array;

import java.util.Scanner;

public class targetsum {



    static int secondlargest(int[]arr){
        int mx = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++){
            if ( arr[i]> mx){
                mx = arr[i];
            }
        }

        return mx;
    }
 
    static int findSecondMax(int[]arr){
        int mx =secondlargest(arr);
         for ( int i =0; i <arr.length;i++){
            if(arr[i]== mx){
                arr[i]=Integer.MIN_VALUE;
            }
         }

          int secondMax = secondlargest(arr);

          return secondMax;


    }


    static int findUnique(int[]arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for ( int j = i +1; j <n; j++){
                if ( arr[i]== arr[j]){
                    arr[i]= -1;
                    arr[j] = -1;

                }
            }
        }


        int ans = -1;
        for (int i = 0 ; i<n; i++){
            if ( arr[i]> 0){
                ans =arr[i];
            }
        }
        return ans;
    }



    static int tripletssum(int []arr , int x){         //finding the answere the triple of sum
        int n = arr.length;
        int ans = 0;

        for(int i = 0 ; i<n; i++){
            for (int j =i+1 ; j <n ; j++){
                for( int k=j+1; k<n ; k++){
                    if ( arr[i]+ arr[j]+ arr[k]==x){
                        ans++;
                    }
                }

            }
        }
        return ans;

    }


    static int pairsum(int[]arr,int x){       //finding the answere pairsum
        int n = arr.length;
        int ans = 0;

        for(int i= 0; i< n; i++){
            for(int j=i+1; j < n ; j++){
                if(arr[i]+arr[j]== x){
                    ans++;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println( " enter the array ");
         int n = sc.nextInt();

         int [] arr = new int[n];

        System.out.println("enter" + n + "  " + "elements");

         for(int i= 0; i < arr.length;  i++){
            arr[i] = sc.nextInt();
         }

         

         
        System.out.print("Enter x ");
        int x = sc.nextInt();



        // System.out.println(pairsum(arr, x));

        // System.out.println(tripletssum(arr, x));


        // System.out.println(findUnique(arr));


        System.out.println(findSecondMax(arr));

        

        
    }
    
}
