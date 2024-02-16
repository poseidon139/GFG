public class findPeakElement {
    public static int findPeakElementFunc(int arr[], int n){
        int res=-1;

        if(n==0){
            return arr[0];
        }
        if(arr[n-2]==arr[n-1]){
            return arr[n-1];
        }
        else{
            for ( int i =1 ; i < n-1 ; i++){
                if( arr[i-1]<= arr[i]&& arr[i+1]<arr[i]){
                    return arr[i];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10,20,9,60,70,80};
        System.out.println(findPeakElementFunc(arr, 6));
    }
}
