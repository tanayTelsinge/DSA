package bitwise;

public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;  // will store reversed bits

        // Process exactly 32 bits (int is 32-bit)
        for (int i = 0; i < 32; i++) {

            // Shift result left to make space for next bit
            result = result << 1;

            // Extract last bit of n and add it to result
            // (n & 1) gives 0 or 1
            result = result | (n & 1);

            // Unsigned right shift n to process next bit
            // >>> is used to avoid sign extension
            n = n >>> 1;
        }

        return result;
    }
}

/*
Iteration 1

last bit = n & 1 → 1
result = 0000 << 1 → 0000
result = 0000 | 1 → 0001
n = 1011 >>> 1 → 0101

Iteration 2

last bit = 1
result = 0001 << 1 → 0010
result = 0010 | 1 → 0011
n = 0101 >>> 1 → 0010

Iteration 3

last bit = 0
result = 0011 << 1 → 0110
result = 0110 | 0 → 0110
n = 0010 >>> 1 → 0001

Iteration 4

last bit = 1
result = 0110 << 1 → 1100
result = 1100 | 1 → 1101
n = 0001 >>> 1 → 0000
 */