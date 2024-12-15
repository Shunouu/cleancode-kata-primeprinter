package com.cleancode.knuth;

public class PrimePrinterHelper {

    private PrimeGenerator generator;

    public PrimePrinterHelper(PrimeGenerator generator) {
        this.generator = generator;
    }

    public int[] generatePrimes(int numberOfNumbers) {
        return generator.generatePrimes(numberOfNumbers);
    }
}