public class reverse {

    static void swaparray(int[]arr,int i, int j){
        int temp = arr[i];
         arr[i] = arr[j];
          arr [j] =  temp;


    }


    static void printarray(int[]arr,int []ans){
         for(int i =0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();


    }

    // static int [] reverseArray(int[]arr){
    //     int n = arr.length;
    //     int []ans = new int[n];
    //     int j = 0;

    //     for (int i = n-1 ; i >=0;i--){
    //         ans[j++] = arr[i];
    //     }
    //     return ans;
    // }


    static void reverseArray(int[]arr){
        int i =0 , j =arr.length-1;

        while (i< j) {
            swaparray(arr, i, j);
            i++;
            j--;

            
        }
    }

    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5};

        // int []ans = reverseArray(arr);

        // printarray(arr, ans);

       reverseArray(arr);
       printarray(arr, arr);
        
       
    }
    
}
