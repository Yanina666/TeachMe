/*
Добро пожаловать. Это многолинейный комментарий. Пишем что хотим и сколько хотим.
 */

import java.util.Scanner;

// Главная реализация моего объекта это Класс
class Main
{
    public static void main(String[] args)
    {
        // Этот код выводит сообщение, one-line comment
        // Legacy Code - код написанный другим программистом и скорее всего
        // на старой версии языка
        // Java - это чаще всего 1.8 (Java 8)

        System.out.print("");
        System.out.println();

        // new line - symbol, \n

        System.out.print("Please, enter your name: " + "Yanina");
        System.out.println();
        System.out.println("Please, enter your surname: Kazlouskaya");
        System.out.println("Please, enter your age: 33");

        System.out.println("Let's calculate sum of 5 + 10: " + (5 + 10));
        System.out.println("Yanina" + " " + "Kazlouskaya" +
                ". Welcome to my First " +
                "Lesson to...........");

        // This is an example comment for Git
        System.out.println();
        System.out.print("Please, enter your name & surname: Yanina Kazlouskaya");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // New Comment

        String name = "Yanina";
        int age = 33;
        double weight = 88.1;
        char symbol = 'A';
    }
}
