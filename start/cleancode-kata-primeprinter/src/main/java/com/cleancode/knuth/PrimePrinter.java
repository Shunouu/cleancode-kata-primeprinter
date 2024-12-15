package com.cleancode.knuth;

public class PrimePrinter {
    public static void main(String[] args) {
        PrimeGenerator generator = new PrimeNumberGenerator();  // Création du générateur
        PrimePrinterHelper helper = new PrimePrinterHelper(generator);  // Passer le générateur au helper
        helper.invoke();
    }
}