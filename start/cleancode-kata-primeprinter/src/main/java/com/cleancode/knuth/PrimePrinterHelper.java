package com.cleancode.knuth;

public class PrimePrinterHelper {

    private PrimeGenerator generator;

    public PrimePrinterHelper(PrimeGenerator generator) {
        this.generator = generator;
    }

    public void invoke() {
        int M = 30;
        int[] primes = generator.generatePrimes(M);
        printPrimes(primes, M);
    }

    private void printPrimes(int[] primes, int numberOfPrimes) {
        System.out.println("Les premiers " + numberOfPrimes + " nombres premiers sont :");
        for (int i = 0; i < numberOfPrimes; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}
