package com.company;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println("First 10 random numbers");
        int[] numbers = new int[10];

        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(500);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Ascending order of the random numbers: \n");

        sort(numbers);
    }

    public static void sort(int[] numbers) {
        int temp;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}