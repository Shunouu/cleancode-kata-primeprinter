package com.cleancode.knuth;

public class PrimePrinterHelper {

    private final int numberOfPrimes;
    private final int linesPerPage;
    private final int columns;
    private int[] primes;

    public PrimePrinterHelper(int numberOfPrimes, int linesPerPage, int columns) {
        this.numberOfPrimes = numberOfPrimes;
        this.linesPerPage = linesPerPage;
        this.columns = columns;
        this.primes = new int[numberOfPrimes + 1];
    }

    public void generatePrimes() {
        int M = numberOfPrimes;
        int J = 1;
        int K = 1;
        boolean JPRIME;
        int ORD = 2;
        int SQUARE = 9;
        int N = 0;
        int[] MULT = new int[30 + 1]; // OrdMax = 30

        primes[1] = 2;

        while (K < M) {
            do {
                J += 2;
                if (J == SQUARE) {
                    ORD++;
                    SQUARE = primes[ORD] * primes[ORD];
                    MULT[ORD - 1] = J;
                }
                N = 2;
                JPRIME = true;
                while (N < ORD && JPRIME) {
                    while (MULT[N] < J) {
                        MULT[N] += primes[N] + primes[N];
                    }
                    if (MULT[N] == J) {
                        JPRIME = false;
                    }
                    N++;
                }
            } while (!JPRIME);
            K++;
            primes[K] = J;
        }
    }

    public void printPrimes() {
        int pageNumber = 1;
        int pageOffset = 1;
        while (pageOffset <= numberOfPrimes) {
            System.out.print("The First ");
            System.out.print(numberOfPrimes);
            System.out.print(" Prime Numbers === Page ");
            System.out.println(pageNumber);
            System.out.println();

            for (int rowOffset = pageOffset; rowOffset < pageOffset + linesPerPage && rowOffset <= numberOfPrimes; rowOffset++) {
                for (int column = 0; column < columns; column++) {
                    if (rowOffset + column * linesPerPage <= numberOfPrimes) {
                        System.out.printf("%10d", primes[rowOffset + column * linesPerPage]);
                    }
                }
                System.out.println();
            }

            System.out.println("\f");
            pageNumber++;
            pageOffset += linesPerPage * columns;
        }
    }
}