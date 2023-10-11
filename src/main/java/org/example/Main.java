package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.ques1();
        main.quest2();
        main.quest3();
    }

    public void ques1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или = 7, Ничего не выведу");
        }
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

    public void quest3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку со случайными значениями: ");

        String input = scanner.nextLine();
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int[] array = new int[0];
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            if (number % 3 == 0) {

                array = resizeArray(array, array.length + 1);
                array[array.length - 1] = number;
            }
        }
        System.out.print("Числа массива, кратные 3: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
    private static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newSize));
        return newArray;
    }
}
