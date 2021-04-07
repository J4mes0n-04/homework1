//
// Created by glazyrin Maksim
//
package ru.geekbrains.lesson1;

public class FirstClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 25;
        b = -75;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
                System.out.println("Сумма отрицательна");
            }
        }

    public static void printColor() {
        int value = 125;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 1 && value < 100) {
            System.out.println("Жёлтный");
        }
        if (value >= 101) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a;
        int b;
            a = 20;
            b = 40;

        if (a >= b)
            System.out.println("a >= b");
        if (a < b)
            System.out.println("a < b");
    }

}
