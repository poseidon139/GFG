public class twoSum {
    public static int twoSumFunc(int arr[], int n , int x){
        //Naive approach
        // for ( int i =0 ; i < n ; i++){
        //     for ( int j =0 ; j < n ; j++){
        //         if( (arr[i] + arr[j]) == x)
        //         System.out.println(arr[i]+" "+ arr[j]);
        //     }
        // }      
        // return -1;
        int i =0 ;
        int j = n-1;
        while( i < j){
            if( arr[i]+arr[j]==x)
                return 1;
            else if( arr[i]+arr[j]<x){
                i++;
            }
            else{
                j--;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60,70};
        System.out.println(twoSumFunc(arr, 7, 90));
    }
}
