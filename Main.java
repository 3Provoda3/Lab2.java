package Test;

import java.util.Random;

public class Main {

    // Підпрограма для обчислення суми парних елементів масиву
    public static int calculateEvenSum(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Генерація випадкового масиву
        int n = 10; // Кількість елементів у масиві
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(201) - 100; // Генерація чисел в діапазоні [-100, 100]
        }

        // Виведення масиву
        System.out.println("Масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Обчислення суми парних елементів
        int evenSum = calculateEvenSum(array);
        System.out.println("Сума парних елементів: " + evenSum);
    }
}
