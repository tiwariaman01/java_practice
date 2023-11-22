import java.util.Scanner;

public class rotatenum {

    static void printarray(int[]arr){
        for(int i =0 ; i < arr.length; i++){
            
           System.out.print(arr[i]);
       }
       System.out.println();

    }




    static int[]rotare_Number(int[]arr, int k){
        int n = arr.length;
        k  = k % n;
        int []ans = new int[n];
        int j = 0;

        for(int i = n-k; i<= n-1; i++){
            ans[j++] =arr[i];

        }

        for ( int i =0 ; i < n-k; i++){
            ans[j++]=arr[i];
        }
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         int[]arr = new int[n];

         for(int i = 0;i<arr.length;i++){
             arr[i]= sc.nextInt();

         }
        

         int k = sc.nextInt();

         System.out.println("Original array");
         printarray(arr);

         System.out.println("after chage array");

         int []ans = rotare_Number(arr, k);

         printarray( ans);
    }
    
}
