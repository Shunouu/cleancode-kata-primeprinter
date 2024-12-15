package com.cleancode.knuth;

public class PrimePrinterHelper {
    private PrimeGenerator generator;

    public PrimePrinterHelper(PrimeGenerator generator) {
        this.generator = generator;
    }

    public void invoke() {
        int M = 30;
        int[] primes = generator.generatePrimes(M);

        System.out.println("Les premiers " + M + " nombres premiers sont :");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}