package com.cleancode.knuth;

public class NumberPrinter {

    private final int linesPerPage;
    private final int columns;

    public NumberPrinter(int linesPerPage, int columns) {
        this.linesPerPage = linesPerPage;
        this.columns = columns;
    }

    public void printNumbers(int[] numbers, int numberOfNumbers) {
        int pageNumber = 1;
        int pageOffset = 0;

        while (pageOffset < numberOfNumbers) {
            System.out.println("Page " + pageNumber);
            for (int rowOffset = 0; rowOffset < linesPerPage && pageOffset < numberOfNumbers; rowOffset++) {
                for (int column = 0; column < columns && pageOffset < numberOfNumbers; column++) {
                    System.out.printf("%10d", numbers[pageOffset++]);
                }
                System.out.println();
            }
            pageNumber++;
            System.out.println();
        }
    }
}