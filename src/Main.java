import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getSeason();
        //returnSeason();
        //evenAndOdd();
        //getTemperature();
//        getRainbowColor();
//        evenAndOdd2();
 //       getDecrement();
        sumNumbers();
//        getLine();
//        getLine2();
//        getSquare();
    }

    public static void getSeason() {
        int season = 9;

        switch (season) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("There is no number");
                break;
        }
    }

    public static void returnSeason() {
        int month = 8;
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Check the data");
        }
    }

    public static void evenAndOdd() {
        int n = 14;
        if (n % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }

    public static void getTemperature() {
        int t = -27;
        if (t > -5) {
            System.out.println("Тепло");
        }
        if (t <= -5 & t > -20) {
            System.out.println("Нормально");
        }
        if (t <= -20) {
            System.out.println("Холодно");
        }
    }

    public static void getRainbowColor() {
        int color = 5;

        switch (color) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Indigo");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Purple");
                break;
        }
    }

    //1 При помощи цикла for вывести на экран нечетные числа от 1 до 99
    //При решении используйте операцию инкремента (++).
    public static void evenAndOdd2() {

        for (int counter = 1; counter <= 99; counter += 2) {
            System.out.println(counter);
        }
    }

    //2 Необходимо вывести на экран числа от 5 до 1
    //При решении используйте операцию декремента (--).
    public static void getDecrement() {

        for (int counter = 5; counter >= 1; counter--) {

            System.out.println(counter);
        }
    }

    //3 Напишите программу, где пользователь вводит любое целое
    //положительное число. А программа суммирует все числа от 1 до
    //введенного пользователем числа.
    //Для ввода числа воспользуйтесь классом Scanner.
    public static void sumNumbers() {

        Scanner enter = new Scanner(System.in);

        System.out.println("Enter some number: ");

        int number = enter.nextInt();

        int sum = 0;
        //int i = 0;

        if (number >= 0) {
            for (int num = 1; num <= number; num++) {
                sum = sum + num;
            }
                System.out.println(sum);
        }
    }




        public static void getLine () {
            int n = 7;
            while (n <= 98) {
                System.out.println("Count: " + n);

                n += 7;
            }

        }
    //5 Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void getLine2() {

        int n = 0;
        while (n >= -45) {
            System.out.println("Show me the line: " + n);
            n -= 5;

        }
    }

        //6 Составьте программу, выводящую на экран квадраты чисел от 10 до
        //20 включительно.

        public static void getSquare () {
            for (int n = 10; n <= 20; n++) {
                System.out.println((int) Math.pow(n, 2));   //возведение в степень

            }
        }

}