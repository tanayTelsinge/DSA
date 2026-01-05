package prime; 
import java.util.Scanner;

//gives all prime factors of N
//eg. i/p 72 -> o/p 2 2 2 3 3 72
// eg. i/p 71 -> o/p 71
public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int N = sc.nextInt();

        int temp = N;
        //from 2 to root N
        for(int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                System.out.print(i + " ");
                temp /= i;
            }
        }
        if (N > 1) {
            System.out.println(N);
        }

        sc.close();
    }
}