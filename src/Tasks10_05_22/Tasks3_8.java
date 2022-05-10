package Tasks10_05_22;

import java.util.Scanner;
import java.lang.Math;

public class Tasks3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        3.Пусть x = 5, y = 10;
        Выведите на экран sqrt (xx + yy); Это и есть гипотенуза треугольника со сторонами x, y.
         */

        System.out.println("Task 3");

        double x = 5;
        double y = 10;
        System.out.println(Math.pow(x, 2) + Math.pow(y, 2));

        //4.Тоже решение для чисел введенных с клавиатуры^^

        System.out.println("Task 4");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println(Math.pow(x1, 2) + Math.pow(y1, 2));

        /*
        5.В переменных q и w хранятся два натуральных числа.
        Создайте программу, выводящую на экран результат деления q на w с остатком.
         */

        System.out.println("Task 5");

        int q = 40;
        int w = 6;
        int division = 40 / 6;
        int result = q % w;
        System.out.println(division + "с остатком" + result);

        /*
        6.В переменной n хранится натуральное трёхзначное число.
        Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
         */

        System.out.println("Task 6");

        int n = 396;
        System.out.println("Сумма цифр числа" + n + " = " + ((n % 10) + (n / 10) % 10 + (n / 100) % 10));

        /*
        7.В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
         */

        System.out.println("Task 7");

        double n1 = 4.7;
        int n2 = (int) (n1 + 0.5);
        System.out.println(n2);

        /*
        8.Запустите код.
        Подумайте, почему программа выдаст отрицательное число вместо двух миллиардов:
         */

        System.out.println("Task 8");

        System.out.println("Привет!");
        int z = 2147483647 + 1;
        System.out.println(z);
        //потому что int может принимать значений до  2147483647
    }
}


