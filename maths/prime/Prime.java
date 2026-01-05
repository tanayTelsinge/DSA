package prime;

public class Prime {
    
    //Time: O(√n)
    // Space: O(1)
    public static void main(String[] args) {
        
        int n = 23;

        System.out.println(isPrime(n));
    }

    public static boolean isPrimeRaw(int n) {
        if (n <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        for(int i = 2; i * i <= n; i++) { // as Math.sqrt give float we can avoid this is more cleaner, instead of root n, multiple i * i
            if (n % i == 0) return false; 
        }
        return true;
    }
}
