import java.util.Scanner;
import java.lang.Math;

public class WS1 {
    
    public static void main(String[] args) {
        int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
        if (isPrime(n)) {
            System.out.println("N is prime number");
        } else {
            System.out.println("N is not prime number");
        }
      
    }
    
    public static int getAPositiveInteger(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive interger: ");
        n = sc.nextInt();
        return n;
        
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
