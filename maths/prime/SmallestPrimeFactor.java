package prime;

/*
SPF[x] = smallest prime that divides x
When used? for Factorization
eg. u have 100,000 numbers, each no is upto 10^6.
for each no 2,3,4,5 .... no efficient.
eg. 30 -> normally 2,3,4,5.
instead 30 -> /2, 15 SPF is 3, divide by 3, 3 for 3 spf is 3 -> 1 stop. 3 steps.
*/
public class SmallestPrimeFactor {

    public static void main(String[] args) {

        int n = 30;

        int[] spf = new int[n + 1];
        sieveCompute(spf);

        for (int i = 0; i < spf.length; i++) {
            if (spf[i] > 0)
                System.out.println(i + " = " + spf[i]);
        }
    }

    public static void sieveCompute(int[] spf) {

        // initialize, instead of 0, assume prime.
        for (int i = 1; i < spf.length; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i < spf.length; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < spf.length; j += i) {
                    if (spf[j] == j) { // not marked yet
                        spf[j] = i;
                    }
                }
            }
        }
    }
}
