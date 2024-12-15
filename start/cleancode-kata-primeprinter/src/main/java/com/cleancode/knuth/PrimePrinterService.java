package com.cleancode.knuth;

public class PrimePrinterService {

    private final PrimeGenerator generator;

    public PrimePrinterService(PrimeGenerator generator) {
        this.generator = generator;
    }

    public int[] generateNumbers(int numberOfNumbers) {
        return generator.generatePrimes(numberOfNumbers);
    }
}