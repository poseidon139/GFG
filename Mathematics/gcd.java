package Mathematics;

public class gcd {
    public static int gcd_fun(int a, int b){
        while(a!=b){
            if(b==0){
                return a; 
            }
            else{
                return gcd_fun(b,a%b);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(gcd_fun(6,4));
    }
    
}
