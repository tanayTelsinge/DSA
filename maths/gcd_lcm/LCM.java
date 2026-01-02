package gcd_lcm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LCM {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter a & b : ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = lcm(a, b);

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcmraw(int a, int b) {
        int product = a * b;
        return product / gcd(a, b);
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) { //
            return 0;
        }
        return (a / gcd(a, b)) * b;
    }

}
