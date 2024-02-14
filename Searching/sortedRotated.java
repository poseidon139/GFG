// find the element on a rotated sorted array



public class sortedRotated {
    public static int sortedRotatedFunc(int arr[], int n, int x){
        int low=0; 
        int high= n-1;
        while( low<high){
            int mid= (low+high)/2; 
            // find which part is sorted 
            if( arr[low]<arr[mid]){
                //check if the element is present in the left sorted part 
                if(x>=arr[low] && x<arr[mid] ){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                    
                }
            }
            else {
                if( x > arr[mid] && x < arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={70,30,40,50,60,20};
        System.out.println(sortedRotatedFunc(arr,6 , 60));
    }
}




