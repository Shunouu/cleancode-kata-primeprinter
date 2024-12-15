package com.cleancode.knuth;

public class PrimeNumberGenerator implements PrimeGenerator {
    @Override
    public int[] generatePrimes(int M) {
        int[] primes = new int[M];
        int count = 0;
        int number = 2;

        while (count < M) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        return primes;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}