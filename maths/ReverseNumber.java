public class ReverseNumber {

    public static void main(String[] args) {
        int n = 12345, ans = 0;

        while (n > 0) {
            int end = n % 10;
            ans = ans * 10 + end;
            n /= 10;
        }
        System.out.println(ans);
    }
}
