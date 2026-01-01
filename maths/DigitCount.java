public class DigitCount {
    

    public static void main(String[] args) {
        int n = 123045, digitCount = 0;

        while (n > 0) {
            n = n / 10;
            digitCount++;
        }
        System.out.println(digitCount);
    }
}
