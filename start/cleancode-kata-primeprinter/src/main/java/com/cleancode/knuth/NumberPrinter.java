package com.cleancode.knuth;

public class NumberPrinter {

    private final int linesPerPage;
    private final int columns;

    public NumberPrinter(int linesPerPage, int columns) {
        this.linesPerPage = linesPerPage;
        this.columns = columns;
    }

    public void printNumbers(int[] numbers, int numberOfNumbers) {
        System.out.println("Les " + numberOfNumbers + " nombres sont :");
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.print(numbers[i] + " ");
            if ((i + 1) % columns == 0) {
                System.out.println();
            }
        }
    }
}