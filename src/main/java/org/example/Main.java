package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare Scanner
        Scanner scanner = new Scanner(System.in);
        //Declare array for doubles
        double[] numbers = new double[10];
//Output to user
        System.out.println("Enter ten double numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }
//USe bubble sort
        bubbleSort(numbers);
//output sorted results
        System.out.println("Sorted numbers:");
        for (double num : numbers) {
            System.out.println(num + " ");
        }

        scanner.close();
    }
    //USe bubble sort
    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
