import java.util.Scanner;

//. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).
public class Main {

    public static void main(String[] args) {
        //getNumbers();
        compareNumerals();
        //arrayMaxMinAvg();
        //lastTask();

    }

    public static void getNumbers() {

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = enter.nextInt();


        {
            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == num) {
                    System.out.println("Your number is in the array: " + i + ":" + num);
                }
            }
        }
    }


    //1 Создайте массив целых чисел. Удалите все вхождения заданного
    //числа из массива.
    //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
    //выведите сообщения об этом.
    //В результате должен быть новый массив без указанного числа.


    public static void compareNumerals() {
        int[] numerals = new int[5];
        numerals[0] = 3;
        numerals[1] = 10;
        numerals[2] = 89;
        numerals[3] = 3;
        numerals[4] = 90;

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter some array numbers: ");
        int scanner = enter.nextInt();

        System.out.print("First array is: ");
        getFirstArray(numerals);

        System.out.print("\nNew array is: ");

        for (int i = 0; i < numerals.length; i++) {
            if (numerals[i] == scanner) {
                continue;
            }
            System.out.print(numerals[i] + " ");
        }
    }

    public static void getFirstArray(int[] numerals2)
    {
        for (int i = 0; i < numerals2.length; i++) {
            System.out.print(numerals2[i] + " ");
        }
    }


    //else numerals[i - count] = numerals[i];

//        if (count == 0) {
//            System.out.println("There is no such number in the array");
//            return;
//        }
//            else {
//                System.out.println("There is no such number in the array");
//            }
//        }
//        for (int i = 0; i < numerals2.length; i++)
//            numerals2[i] = numerals[i];
//        for (int i = 0; i < numerals.length - count; i++)
//            System.out.print(numerals2[i] + " ");
//    }



//Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли.

    public static void arrayMaxMinAvg() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = enter.nextInt();
        int max = 0;
        int min = 0;
        int avg = 0;

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * n);

            for (i = 0; i < nums.length; i++)
                if (max < nums[i])
                    max = nums[i];
                System.out.println("Max: " + max);

                for (i = 0; i < nums.length; i++)
                    min = nums[0];
            for (i = 0; i < nums.length; i++)
                if (min > nums[i])
                    min = nums[i];

                System.out.println("Min: " + min);

                for (i = 0; i < nums.length; i++)
                avg += nums[i] / nums.length;
                System.out.println("Average: " + avg);

                enter.close();
            }
        }

//        3 Создайте 2 массива из 5 чисел.
//    Выведите массивы на консоль в двух отдельных строках.
//    Посчитайте среднее арифметическое элементов каждого массива и
//    сообщите, для какого из массивов это значение оказалось больше (либо
//     сообщите, что их средние арифметические равны).

public static void lastTask() {
    int[] massive1 = new int[5];
    int[] massive2 = new int[5];
    int m1 =0;
    int m2 =0;
    double a1, a2;

    for(int i=0; i<massive1.length; i++){
        massive1[i] = (int)(Math.random()*6);
        massive2[i] = (int)(Math.random()*6);
    }
    for(int i=0; i<massive1.length; i++) {
        System.out.print(massive1[i]+" ");
    }
    System.out.println();
    for(int i=0; i<massive1.length; i++) {
        System.out.print(massive2[i]+" ");
    }
    for(int i=0; i<massive1.length; i++){
        m1 = massive1[i];
    }
    for(int i=0; i<massive2.length; i++){
        m2 = massive2[i];
    }
    System.out.println();
    a1 = (double)m1/5;
    a2 = (double)m2/5;
    if(a1<a2) {
        System.out.println("AVG massive1 < AVG massive2");
    } else if(a2<a1) {
        System.out.println("AVG massive2 < AVG massive1");
    } else {
        System.out.println("AVG massive1 = AVG massive2");
    }
}
}
