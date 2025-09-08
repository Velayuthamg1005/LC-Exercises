package Numbers;

public class LC09_PalindromeNumber {

    public static boolean checkPrime(int n){

        if(n<0){
            return false;
        }

        int original=n;
        int rem=0;

        while(n!=0){
            int mod=n%10;
            rem=rem*10+mod;
            n=n/10;
        }

        if(!(rem==original)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=10;
        boolean result=checkPrime(n);

        if(result){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
