//in sorted  arrays the one's are always number of ele - first occurenced of one
//eg:[0,1,1,1,1]= 5-1=4 it will of complexity O(n)
//whereas we can use binary search to get the index of first one and then the complexity will be O(log n)




public class countOnes {
    

    public static int countOnesFunc(int arr[], int n){
        int low=0 ;
        int high=n-1;

        while( low <= high){
            int mid= (low+high)/2;
            // if mid=0 first 1 is in the second half or right side so 
            // we do low= mid +1
            if(arr[mid]==0){
                low= mid+1;
            }
            // if it is 1 then two case arises either it is first one and any one in the midddle 
            // for first one whoose index is 0 mid =0 and if it first one in between them previous element should be zero 
            // which is arr[mid-1]=0
            //else if it not the first one we update high=mid -1 and again use binary search to find first one on left side
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


