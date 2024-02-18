public class tripletSum {
    public static int twoSumFunc(int arr[], int n , int x){
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
    public static int tripletSumFunc(int arr[], int x){
        int res=-1;
        for ( int i =0 ; i< arr.length ; i++){
            if(twoSumFunc(arr, arr.length-i, x-arr[i])==1)
                res=1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr={10,20,03,40,50,60,70};
        System.out.println(tripletSumFunc(arr, 93));
    }
}
