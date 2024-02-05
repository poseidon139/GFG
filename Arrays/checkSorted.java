public class checkSorted {
    public static boolean sortedChecking(int[] arr, int n){
        boolean res=true;
        for ( int i =0 ; i < n-1 ; i++){
            if( arr[i]>arr[i+1]){
                res=false;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10,30,40,50,60,70};
        System.out.println(sortedChecking(arr,6));
    }
}
