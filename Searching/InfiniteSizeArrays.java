// to search for an element in an infinite sorted array

// Naive Solution
// check if the element present in the arrays by simple search and keep 
//check if it is not present between two ele one greater tahn and one smaller than that 
// if not prenent then return -1 


public class InfiniteSizeArrays {

    /// naive apporch/////////

    // public static int InfiniteSizeArraysFunc(int arr[], int x ){
    //     int pos=-1; 
    //     for ( int i =0 ; i < arr.length; i++){
    //         if( arr[i]==x){
    //             pos=i; 
    //             break;
    //         }
    //         else if(arr[i]<x && arr[i+1]>x){
    //             pos=-1;
    //         }
    //     }
    //     return pos;
    // }


    // ///Efficient Approach
    // public static int InfiniteSizeArraysFunc(int arr[], int x){
        
    //     return -1;
    // }

    public static int InfiniteSizeArraysFunc(int[] arr, int x){
        int pos=-1;
        int low=0; 
        int high= 1;
        if (x==arr[0]){
            return 0;
        }
        while (low<high){
            int mid= (low+high)/2;
            if (arr[mid]==x){
                pos=mid;
            }
            else if (x<arr[mid]){
                high= mid-1;
            }
            else{
                low= mid+1;
                high=high*2;
            }
        }
        return pos;
    }


    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        System.out.println(InfiniteSizeArraysFunc(arr, 50));
    }
}