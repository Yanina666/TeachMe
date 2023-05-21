//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную
//        карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую
//        сумму.
//        Добавьте метод, который выводит текущую информацию о карточке.
//        Напишите программу, которая создает три объекта класса CreditCard у
//        которых заданы номер счета и начальная сумма
//        Тестовый сценарий для проверки:
//        Положите деньги на первые две карточки и снимите с третьей.
//        Выведите на экран текущее состояние всех трех карточек.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CreditCard visa = new CreditCard();
        CreditCard mastercard = new CreditCard();
        CreditCard belcard = new CreditCard();



        visa.setAccount("0090-3334-3212-5678");
        mastercard.setAccount("8989-4345-8987-5647");
        belcard.setAccount("5464-8789-4322-7874");

        visa.setBalance(700.80);
        mastercard.setBalance(5000);
        belcard.setBalance(10900);

        visa.getCardInfo();
        mastercard.getCardInfo();
        belcard.getCardInfo();

        visa.refillSomeMoney();
        mastercard.refillSomeMoney();
        belcard.refillSomeMoney();
        belcard.withdrawSomeMoney();
        visa.withdrawSomeMoney();
        mastercard.withdrawSomeMoney();

    }

}
