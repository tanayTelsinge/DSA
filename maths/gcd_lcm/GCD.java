package gcd_lcm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GCD {

    /* i/p a = 24 b = 36, ans = 12 */
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a & b : ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = gcd(a, b);
        System.out.println(ans);

        pw.close();
    }

    // “Subtraction-based Euclid works but is inefficient for large differences.
    // Example: gcd(1, 100000) → 100,000 recursive steps
    // Modulo reduces the problem much faster, giving O(log n) time.”
    public static int gcdraw(int a, int b) {
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a < b) {
            b = b - a;
        } else {
            a = a - b;
        }
        return gcdraw(a, b);
    }

    // “Subtraction-based Euclid works but is inefficient for large differences.
    // Example: gcd(1, 100000) → 100,000 recursive steps
    // Modulo reduces the problem much faster, giving O(log n) time.”
    public static int gcdv2(int a, int b) {
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (b > a)
            return gcdv2(a, b - a);
        else
            return gcdv2(b, a - b);
    }

    //Euclidean Algorithm, 
    //% mathematically, we need greater num / smaller num, but % handles it.
    //Also for zero case, if we do a == 0 return b / by zero exception.
    // for GCD, 0 , 10, 30, then gcd is 10 but for lcm if any 1 is zero then all 0.
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
