package com.cleancode.knuth;

public class PrimePrinter {
    public static void main(String[] args) {
        PrimeGenerator generator = new PrimeNumberGenerator();
        PrimePrinterService service = new PrimePrinterService(generator);
        NumberPrinter printer = new NumberPrinter(10, 5);

        int[] primes = service.generateNumbers(30);
        printer.printNumbers(primes, 30);
    }
}