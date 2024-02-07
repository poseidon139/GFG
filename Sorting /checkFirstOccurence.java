public class checkFirstOccurence {
    public static int checkFirstOccurenceFunc(int a[], int x){
        int res=-1;
        for( int i =0 ; i < a.length ; i++){
            if (a[i]==x){
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,45,5};
        System.out.println(checkFirstOccurenceFunc(arr, 3));
    }
}
