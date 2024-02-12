public class squareRoot {
    public static int squareRootFunc(int n){
        // Naive Solution
        // int res=-1;
        // for( int i =0 ; i <= n ; i++){
        //     if( i*i==n)
        //         res=i;
        // }
        // return res;

        //Efficient Solution    
        // using binary search
        //[0,1,2,3]
        int res=-1;
        int low=1; 
        int high= n;
        while( low< high){
            int mid=(low+high)/2; 
            if((mid*mid)==n){
                res=mid; 
                break;
            }
            else if((mid*mid)>n){
                high=mid-1;
            }
            else{
                low=mid+1;
                res=mid;
            }
        }    
        return res;
    }
    public static void main(String[] args) {
        System.out.println(squareRootFunc(64));
    }
}
