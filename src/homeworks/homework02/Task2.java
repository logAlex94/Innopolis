package homeworks.homework02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-е целое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        System.out.println("Сумма двух целых чисел: " + (first + second) );
        System.out.println("Разница двух целых чисел: " + (first - second) );
        System.out.println("Произведение из двух целых чисел: " + (Math.multiplyExact(first, second) ) );
        System.out.println("Среднее из двух целых чисел: " + (double)(first + second) / 2 );
        System.out.println("Расстояние двух целых чисел:" + Math.abs(first - second) );
        System.out.println("Максимальное целое число: " + Math.max(first, second) );
        System.out.println("Минимальное целое число: " + Math.min(first, second) );
    }
}
