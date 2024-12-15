package com.cleancode.knuth;

public class PrimePrinter {
    public static void main(String[] args) {
        PrimeGenerator generator = new PrimeNumberGenerator();
        PrimePrinterHelper helper = new PrimePrinterHelper(generator);
        helper.invoke();
    }
}