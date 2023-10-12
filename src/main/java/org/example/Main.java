package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.quest1();
        main.quest1ver2();
        main.quest2();
        main.quest2ver2();
        main.quest3();
        main.quest3ver2();
    }

    public void quest1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или = 7, Ничего не выведу");
        }
    }

    public void quest1ver2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        String result = (scanner.nextInt() > 7) ? "Привет" : "Ничего";

        System.out.println(result);
    }

    public void quest2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");

        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void quest2ver2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");

        String result = (scanner.nextLine().equals("Вячеслав") ? "Привет, Вячеслав" : "No name");

        System.out.println(result);

    }

    public void quest3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        System.out.print("Введите элементы массива:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.stream(numbers)
                .filter(number -> number % 3 == 0)
                .forEach(System.out::println);
    }

    public void quest3ver2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массив в формате {элемент1,элемент2,элемент3,...}: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input, "{}, ");
        int size = tokenizer.countTokens();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
