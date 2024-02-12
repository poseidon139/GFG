//in sorted  arrays the one's are always number of ele - first occurenced of one
//eg:[0,1,1,1,1]= 5-1=4 it will of complexity O(n)
//whereas we can use binary search to get the index of first one and then the complexity will be O(log n)




public class countOnes {
    

    public static int countOnesFunc(int arr[], int n){
        int low=0 ;
        int high=n-1;

        while( low <= high){
            int mid= (low+high)/2;
            if(arr[mid]==0){
                low= mid+1;
            }
            else{
                if( mid==0 || arr[mid-1]==0){
                    return  (n-mid);
                }
                else{
                    high=mid-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,1,1,1,1}; 
        System.out.println(countOnesFunc(arr, 9));
        
    }
}


