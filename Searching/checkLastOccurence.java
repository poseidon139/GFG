/**
 * checkLastOccurence
 */
public class checkLastOccurence {

    public static int checkLastOccurenceFunc(int[] arr, int x , int n){
        int res=-1;
        int low=0; 
        int high=n-1; 
        while(low <= high ){
            int mid= (low+high)/2;
            if (x<arr[mid]){
                high=mid-1;
            }
            else if(x>arr[mid]){
                low=mid+1;

            }
            else if(arr[mid]==x){
                if(mid==n-1){
                    res=n-1;
                    break;
                }
                else if(arr[mid]==arr[mid+1]){
                    res=mid+1;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30,40,50};
        System.out.println("bfkjdbkjabjbf");
        System.out.println(checkLastOccurenceFunc(arr,20,7));
    }
}