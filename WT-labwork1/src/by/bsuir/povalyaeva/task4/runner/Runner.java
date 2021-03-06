package by.bsuir.povalyaeva.task4.runner;

import by.bsuir.povalyaeva.DataScanner;
import by.bsuir.povalyaeva.task4.util.Util;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter length of array: ");
        int length = DataScanner.enterNaturalNumber();

        int[] numbers = new int[length];
        System.out.print("Enter elements of array: ");
        for (int index = 0; index < length; index++) {
            numbers[index] = DataScanner.enterIntegerNumber();
        }
        // Номера позиций начинаются с нуля
        System.out.print("Positions of array prime numbers are: " + Util.findPrimeNumbersPositions(numbers));
    }
}
