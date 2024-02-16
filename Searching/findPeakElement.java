public class findPeakElement {
    //Naive solution 
    // public static int findPeakElementFunc(int arr[], int n){
    //     int res=-1;

    //     if(n==0){
    //         return arr[0];
    //     }
    //     if(arr[n-2]==arr[n-1]){
    //         return arr[n-1];
    //     }
    //     else{
    //         for ( int i =1 ; i < n-1 ; i++){
    //             if( arr[i-1]<= arr[i]&& arr[i+1]<arr[i]){
    //                 return arr[i];
    //             }
    //         }
    //     }
    //     return res;
    // }


    // Efficient solution
    public static int findPeakElementFunc(int arr[], int n){
        int res=-1;
        int low=0; 
        int high=n-1; 
        while(low<=high){
            int mid= (low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
                return mid;
            }
            if (mid >0 && arr[mid-1]>=arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={10,20,9,60,70,80};
        System.out.println(findPeakElementFunc(arr, 6));
    }
}
